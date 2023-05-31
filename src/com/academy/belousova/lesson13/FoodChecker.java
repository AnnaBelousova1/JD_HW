package com.academy.belousova.lesson13;

import java.util.List;

public class FoodChecker {
    public boolean isVegetarian(List<FoodType> foods) {
        if ((foods.contains(FoodType.FISH)) || (foods.contains(FoodType.MEAT)) || (foods.contains(FoodType.UNKNOWN))) {
            return false;
        }
        return true;
    }
}
