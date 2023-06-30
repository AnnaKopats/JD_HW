package com.academy.kopats.lesson11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MySetExample {
    public static void main(String[] args) {
        MySet<String> mySet1 = new MySet<>();
        mySet1.add("Anna");
        mySet1.add("Kirill");
        mySet1.add("Olga");
        mySet1.add("Ivan");
        System.out.println(mySet1);
        System.out.println("Size: " + mySet1.size() + "\n");

        System.out.println("IsEmpty: " + mySet1.isEmpty() + "\n");

        MySet<String> mySet2 = new MySet<>();
        mySet2.add("Anna");
        mySet2.add("Kirill");
        mySet2.add("Olga");
        mySet2.add("Ivan");

        System.out.println("Set contains all mySet1: " + mySet2.containsAll(mySet1)+ "\n");

        System.out.println("Remove all: " + mySet2.removeAll(mySet1) + "\n");

        System.out.println("Add all mySet1 + mySet2: " + mySet1.addAll(mySet2) + "\n");

        mySet1.remove("Kirill");
        System.out.println(mySet1);
        System.out.println("Size: " + mySet1.size() + "\n");

        System.out.println(mySet1.contains("Anna"));

    }
}
