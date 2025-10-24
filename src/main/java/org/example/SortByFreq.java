package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortByFreq {

    public static void main(String[] args) {
        int[] input1 = {4, 4, 2, 2, 8, 8, 8, 3, 1, 1, 1, 1};

        Map<Integer, Long> collect = Arrays.stream(input1).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Frequency map:" + collect);

        List<Integer> sortedArrays = Arrays.stream(input1).boxed().sorted((o1, o2) -> {
            long freqA = collect.get(o1);
            long freqB = collect.get(o2);

            if(freqA!=freqB) {
                return Long.compare(freqA, freqB);
            }

            return Integer.compare(o1, o2);
        }).toList();

        System.out.println("Sorted Arrays:" + sortedArrays);





    }
}
