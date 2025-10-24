package org.login;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class TestJava {

    public static void main(String[] args) {

//        Input: abcabcbb
//        Longest substring without repeating characters: abc
//        Length: 3

        String str = "pwwkew";




        String str1 = IntStream.range(0, str.length())
                .mapToObj(value -> {
                    Set<Character> set = new HashSet<>();
                    return IntStream.range(value, str.length())
                            .takeWhile(value1 -> set.add(str.charAt(value1)))
                            .mapToObj(value1 -> str.substring(value, value1+1))
                            .max(Comparator.comparingInt(String::length))
                            .orElse("");
                }).max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(str1);

    }
}
