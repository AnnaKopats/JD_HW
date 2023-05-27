package com.academy.kopats.lesson12;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValidBrackets(s));

    }

    private static boolean isValidBrackets(String input) {
        Map<Character, Character> mapBrackets = new HashMap<>();
        mapBrackets.put(')', '(');
        mapBrackets.put('}', '{');
        mapBrackets.put(']', '[');
        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            if (mapBrackets.containsValue(ch)) {
                deque.push(ch);
            } else if (mapBrackets.containsKey(ch)) {
                if (deque.isEmpty() || deque.pop() != mapBrackets.get(ch)) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
