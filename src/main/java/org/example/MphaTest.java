package org.example;

import java.util.HashSet;
import java.util.Set;

public class MphaTest {

    public static void main(String[] args) {
        // find longest substring without repeating char

        // String str = "abcabcbb";

        // result = "3";

        String str = "abcbbbbbcccc";
        Set<Character> set = new HashSet<>();

        int maxLen = 0;
        int j=0;
        for (int i=0; i<str.length();i++) {
            if(set.contains(str.charAt(i))) {
                set.remove(str.charAt(j));
                j++;
            }
            set.add(str.charAt(i));
            maxLen = Math.max(maxLen, i-j+1);
        }
        System.out.println(maxLen);
    }
}
