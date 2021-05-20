package com.bl.demo;

import java.util.Optional;
import java.util.Comparator;

import static java.util.Arrays.stream;

public class Max<E extends Comparable<E>> {

    E a, b, c;

    public Max(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Max(){}

    public Optional<E> findMaximum(E...element) {
        Optional<E> max;
        max = stream(element).
                sorted(Comparator.reverseOrder()).findFirst();
        printMaximum(max,element);
        return max;
    }

    public void printMaximum(Optional<E> max,E...elements) {
        for (E element : elements)
            System.out.print(element+" ");
        System.out.println("Maximum element:" +max);
    }
}
