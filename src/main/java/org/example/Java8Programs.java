package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Programs {

    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10,3);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10,3);

        Set<Integer> duplicates = new HashSet<>();

        Set<Integer> collect = numbers1.stream().filter(num -> !duplicates.add(num)).collect(Collectors.toSet());

        System.out.println(collect);

        System.out.println("second highest number");

        System.out.println(numbers1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        System.out.println("top 3 highest number");

        numbers1.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        System.out.println("partition by even and odd numbers");

        Map<Boolean, List<Integer>> collected = numbers1.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("even numbers" + collected.get(true));

        System.out.println("common elements between list");

        List<Integer> commonList = numbers1.stream().filter(numbers2::contains).distinct().collect(Collectors.toList());

        System.out.println(commonList);


    }
}
