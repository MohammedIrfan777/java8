package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class HtcTest {

    public static void main(String[] args) {


        // sum of natural number



//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        int sum = list.stream().mapToInt(Integer::intValue).sum();
//
//        System.out.println("sum:" +sum);


//        int n = 10;
//
//        long sum = LongStream.rangeClosed(1, n).reduce(0, Long::sum);
//
//        System.out.println(sum);

        int n = 5;

        long result = factorial(n);

        System.out.println(result);

    }

    private static long factorial(int n) {
        if(n==0 || n==1) {
            return 1;
        }

        return n*factorial(n-1);
    }
}
