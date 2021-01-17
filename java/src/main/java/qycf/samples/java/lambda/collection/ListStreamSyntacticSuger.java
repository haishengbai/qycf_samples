package qycf.samples.java.lambda.collection;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @Author v_baihaisheng
 * @create 2021/1/8 11:27 上午
 */
public class ListStreamSyntacticSuger {

    /**
     * Divide a list to lists of n size
     * [1,2,3,4,5,6,7] -> [[1,2], [3,4], [5,6], [7]]
     */
    public static <V> List<List<V>> divideList2ListsOfSizeN(Integer sizeN, List<V> listDivided) {
        AtomicInteger counter = new AtomicInteger();

        return new ArrayList<>(listDivided.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / sizeN))
                .values());
    }

    public static void main(String[] args) {

        List<Integer> divided = Lists.newArrayList(1,2,3,4,5,6,7);
        List<List<Integer>> result = ListStreamSyntacticSuger.divideList2ListsOfSizeN(2, divided);
        result.parallelStream().forEach(each -> {
            each.forEach(System.out::println);
        });

        System.out.println(result.toString());
    }

}
