package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestJava {

    public static void main(String[] args) {


        String str = "Java Interview to Natwest java Interview Java   Interview $Interview #@Welcome";

        String removeSpecial = removeSpecialCharacter(str);

        System.out.println("removed Special character"+ removeSpecial);

        Map<String, Long> duplicatesWord = findDuplicatesWord(removeSpecial);

        System.out.println(duplicatesWord);

    }

    private static Map<String, Long>  findDuplicatesWord(String removeSpecial) {

         return Arrays.stream(removeSpecial.split(" "))
                .filter(s -> !s.isEmpty())
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static String removeSpecialCharacter(String str) {

        return str.replaceAll("[^a-zA-Z0-9\\s]", "");
    }
}
