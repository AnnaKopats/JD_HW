package com.academy.kopats.lesson19;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Collection<Integer> col = Arrays.asList(2, 1, 7, 15, 3, 8, 4, 65);
        Optional<Integer> min = col.stream()
                .min(Integer::compareTo);
        System.out.println("Минимальный элемент: " + min.orElse(0));

        Optional<Integer> max = col.stream()
                .max(Integer::compareTo);
        System.out.println("Максимальный элемент: " + max.orElse(0));

        double v = col.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Среднее арифметическое элементов: " + v);

        long product = col.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Произведение элементов: " + product);

        Integer sum = col.stream()
                .reduce(0, Integer::sum);
        System.out.println("Сумма элементов: " + sum);

        int sumNumbers = col.stream()
                .map(String::valueOf)
                .map((s) -> Arrays.asList(Arrays.stream(s.split("")).toArray()))
                .mapToInt((s)->Integer.parseInt(String.valueOf(s)))
                .reduce(Integer::sum).orElse(0);

        System.out.println(sumNumbers);
//      col.stream().flatMapToInt((p) -> Arrays.asList(p.split(",").stream()).toArray(Integer[]::new));
    }
}
