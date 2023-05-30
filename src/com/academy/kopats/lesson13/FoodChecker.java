package com.academy.kopats.lesson13;

import java.util.List;

public class FoodChecker {
    public boolean isVegetarian(List<FoodType> foods) {
        if (foods.contains(FoodType.FISH) || foods.contains(FoodType.UNKNOWN) || foods.contains(FoodType.MEAT))
            return false;
        return true;
    }

}
