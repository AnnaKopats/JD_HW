package com.academy.kopats.lesson19;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        List<String> collect = myList.stream()
                .filter(s -> !s.contains("3"))
                .sorted((s1, s2) -> {
                    if (s1.charAt(1) == s2.charAt(1))
                        return s1.compareTo(s2);
                    else if (s1.charAt(1) > s2.charAt(1))
                        return 1;
                    else return -1;
                })
                .sorted(Collections.reverseOrder())
                .skip(1)
                .toList();
        List<String> list = collect.stream()
                .limit(collect.size() - 1)
                .map(String::toUpperCase)
                .toList();
        System.out.println(list);
        long count = list.stream()
                .count();
        System.out.println("В коллекции осталось " + count + " элементa");
    }
}
