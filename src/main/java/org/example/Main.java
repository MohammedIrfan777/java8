package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //[1,2,3,4]

        //lenght: 4
        //nums[24, 12,8,6]

        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] result = new int[n];

        Arrays.fill(result, 1);

        int left=1, right=1;

        for(int i=0; i<n; i++) {


            result[i] =result[i]*left; // 1
            left=left*nums[i]; //

            int j=n-1-i;
            //result[j]*=right;

            result[j]=result[j]*right;
            right=right*nums[j];
        }

        System.out.println(Arrays.toString(result));

    }
}