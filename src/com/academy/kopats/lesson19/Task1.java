package com.academy.kopats.lesson19;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Collection<String> col = Arrays.asList(
                "If you were able to connect, then a window will appear in front of you to enter your login and password.",
                "Due to inexperience, at first it is very difficult to type the login and password correctly.",
                "Registration is required to enter the site.",
                "To work with the application, you will need a password.",
                "Hello");

        boolean collect = col.stream()
                .anyMatch((s) -> s.contains("login"));
        System.out.println(collect);

        Optional<String> max = col.stream()
                .max(Comparator.comparing(String::length));
        System.out.println(max.orElse("0"));

        Optional<String> min = col.stream()
                .min(Comparator.comparing(String::length));
        System.out.println(min.orElse("0"));

        List<String> collect1 = col.stream()
                .filter(s -> !s.contains(" "))
                .filter(s -> !s.contains(","))
                .collect(Collectors.toList());
        System.out.println(collect1);

        List<List<String>> collect2 = col.stream()
                .map((s) -> Arrays.asList(s.split("[\\s,.!-]+")))
                .collect(Collectors.toList());
        System.out.println(collect2);

    }
}
