package com.generics;

import java.util.Arrays;
import java.util.Collections;

public class GenericType <E> {

    public static  <E> E max(E[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        E max = arr[0];
        System.out.println(max);
        return max;
    }
    public static String maxOfString(String[] arr) {
        int maxLen = 0;
        String maxStr = arr[0];
        for (int i = 0; i< arr.length; i++){
            String str = arr[i];
            int len = str.length();
            if(len > maxLen){
                maxLen = len;
                maxStr = arr[i];
            }
        }
        System.out.println(maxStr);
        return maxStr;
    }
}
