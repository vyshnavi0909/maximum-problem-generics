package com.generics;

public class MaximumNumber {
    public static void main(String[] args) {
        Integer[] intArray = {4, 5, 6, 7, 1};
        System.out.println(GenericType.max(intArray));
        Float[] floatArray = {5.2f, 2.3f, 3.4f, 33.3f, 23.3f};
        System.out.println(GenericType.max(floatArray));
        String[] strArray = {"Peach", "Apple", "Banana", "HelloWorld"};
        System.out.println(GenericType.maxOfString(strArray));
    }

}
