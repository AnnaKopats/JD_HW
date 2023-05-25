package com.academy.kopats.lesson11;

import java.util.ArrayList;
import java.util.List;

public class MyClassExample {
    public static void main(String[] args) {
        List<String> list = new MyList<>();
        list.add("morning");
        list.add("day");
        list.add("evening");
        list.add("night");

        list.remove(1);
        String s = list.get(2);
        System.out.println(list.size());
        System.out.println(list);

        list.set(1, "123");
        System.out.println(list);

        list.add(2,"8");
        System.out.println(list);

        list.add(1,"00");
        System.out.println(list);

        List<String> list2 = new MyList<>();
        list.add("8");
        list.add("12");
        list.add("20");
        list.add("23");
        list.addAll(list2);
        System.out.println(list);



    }
}
