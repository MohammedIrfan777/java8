package org.example;

import java.util.Arrays;

public class PivotElementFromArray {

    public static void main(String[] args) {
        int[] arr = {8, 98, 99, 2, 3, 5};

        int pivot = findPivot(arr);

        System.out.println("pivot:" +pivot);

        sortArray(arr, 0, pivot-1);
        sortArray(arr, pivot, arr.length-1);
        sortArray(arr, 0, arr.length-1);
        System.out.println("sorted array:" + Arrays.toString(arr));
    }

    private static void sortArray(int[] arr, int start, int end) {
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static int findPivot(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left<right) {
            int mid = left + (right - left)/2;
            if(arr[mid] > arr[right]) {
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }


}
