package com.generics;

public class GenericType <E extends Comparable> {
    E a, b, c;

    public GenericType(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static <E extends Comparable> E max(E a, E b, E c) {
        if(a.compareTo(b) > 0) {
            if(a.compareTo(c) > 0) {
                return a;
            }
        }
        if(b.compareTo(c) > 0) {
            return b;
        }
        return c;
    }
}
