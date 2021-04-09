package com.generics;

public class MaximumNumber {
    public Integer maxOfIntegers(Integer a, Integer b, Integer c) {
        if (a.compareTo(b) == 1) {
            if (a.compareTo(c) == 1){
                return a;
            }
        }if (b.compareTo(c) == 1){
            return b;
        }
        return c;
    }
    public Float maxOfFloats (Float a, Float b, Float c){
        if (a.compareTo(b) == 1) {
            if (a.compareTo(c) == 1){
                return a;
            }
        }if (b.compareTo(c) == 1){
            return b;
        }
        return c;
    }
}
