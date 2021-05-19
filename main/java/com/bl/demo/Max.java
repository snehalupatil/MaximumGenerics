package com.bl.demo;

public class Max {

    public static Integer findMaximum(Integer a, Integer b, Integer c){
        Integer max;
        max = a;
        if (b.compareTo(max) == 1)
            max = b;
        if (c.compareTo(max) == 1)
            max = c;
        return max;
    }

    public static void printMaximum(Integer m){
        System.out.println("Maximum Number is: "+m);
    }
}
