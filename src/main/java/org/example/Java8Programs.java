package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Programs {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10,3);
        Set<Integer> duplicates = new HashSet<>();

        Set<Integer> collect = numbers.stream().filter(num -> !duplicates.add(num)).collect(Collectors.toSet());

        System.out.println(collect);

        System.out.println("second highest number");

        System.out.println(numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        System.out.println("top 3 highest number");

        numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);




    }
}
