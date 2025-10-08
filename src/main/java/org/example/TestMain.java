package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMain {

    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(2,2,3,3,4,44,6,5,3,6);

        list1.stream().filter(n -> n % 2 == 0).forEach(System.out::println);


    }
}
