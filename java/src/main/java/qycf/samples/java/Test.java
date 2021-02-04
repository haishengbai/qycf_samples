package qycf.samples.java;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        List<Long> clusterIds = Lists.newArrayList(1L, 2L ,3L ,4L ,5L, 6L, 7L, 8L, 9L, 10L);
        Collection<List<Long>> a = clusterIds.stream()
                .collect(Collectors.groupingBy(i -> atomicInteger.getAndIncrement() / 3)).values();
        System.out.println(a.toString());
        Map<Long, String> re = Maps.newConcurrentMap();


        a.parallelStream().forEach(each -> {
            Map<Long, String> m = Maps.newHashMap();
            each.forEach(w -> {
                m.put(w, w +"ok");
            });
            re.putAll(m);
        });

        System.out.println(re);

//        final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
//        final int chunkSize = 3;
//        final AtomicInteger counter = new AtomicInteger();
//
//        final Collection<List<Integer>> result = numbers.stream()
//                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / 3))
//                .values();

//        System.out.println(result);

    }
    
}
