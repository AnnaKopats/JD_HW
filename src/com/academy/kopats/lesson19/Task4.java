package com.academy.kopats.lesson19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Set<Integer>> initialMap = new HashMap<>() {{
            put("123", Set.of(1, 2, 3, 4));
            put("234", Set.of(2, 3, 4, 5));
            put("345", Set.of(3, 4, 5, 6));
            put("456", Set.of(4, 5, 6, 7));
        }};
        Map<Integer, Set<String>> collect = initialMap.entrySet().stream()
                .collect(HashMap::new, (a, b) -> b.getValue().forEach(v -> a.computeIfAbsent(v, ignore -> new HashSet<>()).add(b.getKey())), (a1, a2) -> a2.forEach((k, v) -> a1.merge(k, v, (s1, s2) -> {
                    s1.addAll(s2);
                    return s1;
                })));
        System.out.println(collect);
    }
}
