package qycf.samples.springboot.annotation;

import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;

@Component
public class AnnotatedClass {

    @Qycf
    AnnotatingClass annotatingClass;

    public AnnotatingClass getAnnotatingClass() {
        System.out.println("get success");
        annotatingClass.execute();
        return annotatingClass;
    }

    public void setAnnotatingClass(AnnotatingClass annotatingClass) {
        this.annotatingClass = annotatingClass;
    }

    public static void main(String[] args) {

        AnnotatedClass annotatedClass = new AnnotatedClass();
        Field[] fields = AnnotatedClass.class.getDeclaredFields();
        Arrays.stream(fields).filter(a -> a.getAnnotation(Qycf.class) != null).forEach(each -> {
            each.setAccessible(Boolean.TRUE);
            try {
                each.set(annotatedClass, new AnnotatingClass());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.println(annotatedClass.getAnnotatingClass());

        });

    }

}
