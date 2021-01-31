package qycf.samples.springboot.context.lifecircle;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

/**
 * 必须显式调用
 *
 * */
@Component
public class QycfLife implements Lifecycle {

    boolean flag = Boolean.FALSE;

    @Override
    public void start() {
        System.out.println("context start");
    }

    @Override
    public void stop() {
        System.out.println("context stop");
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
