package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringBased {

    public static void main(String[] args) {


        String str = "Welcometojava";

        Map<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(collect);

        Character c = collect.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).findFirst().get();

        System.out.println(c);


        String collect1 = IntStream.range(0, str.length()).
                mapToObj(value -> str.charAt(str.length() - 1 - value))
                .map(character -> String.valueOf((char) character))
                .collect(Collectors.joining());

        System.out.println(collect1);

        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println(reverse);

        String str1 = "There is String Object";

        String[] strArray = str1.split(" ");

        for(String s : strArray){
            System.out.print(new StringBuilder(s).reverse() + " ");
        }

        boolean palindrom = IntStream.range(0, str.length() / 2)
                .allMatch(value -> str.charAt(value) == str.charAt(str.length() - value - 1));

        System.out.println("\n" +palindrom);


    }
}
