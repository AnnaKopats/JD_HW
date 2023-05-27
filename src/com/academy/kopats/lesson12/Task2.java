package com.academy.kopats.lesson12;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String stop = "end";
        boolean equals;
        do {
            System.out.println("Введите строку: ");
            String s = sc.nextLine();
            equals = s.equalsIgnoreCase(stop);
                if (!equals) {
                    list.add(s);
                }
        } while (!equals);
        System.out.println(listToMap(list));
    }

    public static <K> Map<K, Integer> listToMap(List<K> ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K s : ks) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<K, Integer> next : map.entrySet()) {
            System.out.println(next.getKey() + " - " + next.getValue());
        }
        return map;
    }
}
