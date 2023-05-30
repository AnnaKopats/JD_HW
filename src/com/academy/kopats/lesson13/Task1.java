package com.academy.kopats.lesson13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<FoodType> list1 = new ArrayList<>();
        list1.add(FoodType.MEAT);
        list1.add(FoodType.FISH);
        list1.add(FoodType.UNKNOWN);

        List<FoodType> list2 = new ArrayList<>();
        list2.add(FoodType.MILK);
        list2.add(FoodType.FRUIT);
        list2.add(FoodType.VEGETABLE);

        List<FoodType> list3 = new ArrayList<>();
        list3.add(FoodType.UNKNOWN);
        list3.add(FoodType.MILK);
        list3.add(FoodType.VEGETABLE);

        FoodChecker foodChecker = new FoodChecker();
        System.out.println(foodChecker.isVegetarian(list1));
        System.out.println(foodChecker.isVegetarian(list2));
        System.out.println(foodChecker.isVegetarian(list3));
    }
}
