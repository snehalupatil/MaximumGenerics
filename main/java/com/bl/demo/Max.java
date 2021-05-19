package com.bl.demo;

public class Max {

     /*
            Maximum Integer
    */

    public static Integer findMaximumInt(Integer a, Integer b, Integer c)
    {
        Integer max;
        max = a;
        if (b.compareTo(max) == 1)
            max = b;
        if (c.compareTo(max) == 1)
            max = c;
        printMaximum(max);
        return max;
    }

    public static void printIntMaximum(Integer m)
    {
        System.out.println("Maximum Number is: "+m);
    }

    /*
            Maximum Float
    */

    public static Float findMaximumFloat(Float a, Float b, Float c)
    {
        Float max;
        max = a;
        if (b.compareTo(max) == 1)
            max = b;
        if (c.compareTo(max) == 1)
            max = c;
        printFloatMaximum(max);
        return max;
    }
    public static void printFloatMaximum(Float m)
    {
        System.out.println("Maximum float Number is: " + m);
    }

    /*
    public static void main(String[] args){
        Max genericFloat = new Max();
        genericFloat.findMaximumFloat(6.4f,2.2f,4.5f);
    }*/
}
