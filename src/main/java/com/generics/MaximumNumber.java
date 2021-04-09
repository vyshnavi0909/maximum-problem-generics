package com.generics;

public class MaximumNumber {
    public <E extends Comparable>E max(E a, E b, E c){
        if (a.compareTo(b) > 0) {
            if (a.compareTo(c) > 0){
                return a;
            }
        }if (b.compareTo(c) > 0){
            return b;
        }
        return c;
    }

}
