package com.academy.kopats.lesson12;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 3, 1));
        Set<Integer> b = new TreeSet<>(Arrays.asList(9, 4, 5, 6, 4, 5, 1));
        System.out.println(a + " " + b);
        System.out.println(getCross(a, b));
        System.out.println(getUnion(a, b));
    }

    public static <T> Set<T> getCross(Set<T> a, Set<T> b) {
        Set<T> c = new HashSet<>(a);
        c.retainAll(b);
        return c;
    }

    public static <T> Set<T> getUnion(Set<T> a, Set<T> b) {
        Set<T> c = new HashSet<>(a);
        c.addAll(b);
        return c;
    }
}
