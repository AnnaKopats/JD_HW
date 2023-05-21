package com.academy.kopats.lesson8;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        letter("Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text. 14 ");

    }

    public static void letter(String s) {
        String s1 = s.toLowerCase();
        String[] arr = s1.split("[\\s,\\.\\!\\-]+");
        System.out.println(Arrays.toString(arr));
        ArrayList<String> listArr = new ArrayList<>(List.of(arr));
        HashSet<String> setArr = new HashSet<>(listArr);
        System.out.println(setArr.size());
    }
}
