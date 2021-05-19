package com.bl.demo;

public class Max {

    public static <E extends Comparable<E>> E findMaximum(E a, E b, E c) {
        E max;
        max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        printMaximum(max);
        return max;
    }

    public static void printStringMaximum(String m) {
        System.out.println("Maximum String is: " + m);
    }

}
