package com.zeroten.common.com.zeroten.common.util;

public class ArrayUtils {
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int index = 0; index < arr.length - i - 1; index++) {
                if (arr[index] > arr[index + 1]) {
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
        }
        return arr;
    }
}
