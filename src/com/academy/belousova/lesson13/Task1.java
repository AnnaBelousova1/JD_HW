package com.academy.belousova.lesson13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<FoodType> list = new ArrayList<>();
        list.add(FoodType.FISH);
        list.add(FoodType.MEAT);
        list.add(FoodType.UNKNOWN);
        System.out.println("list: " + list);


        List<FoodType> list2 = new ArrayList<>();
        list2.add(FoodType.FRUIT);
        list2.add(FoodType.VEGETABLE);
        list2.add(FoodType.MILK);
        System.out.println("list2: " + list2);

        List<FoodType> list3 = new ArrayList<>();
        list3.add(FoodType.FRUIT);
        list3.add(FoodType.MEAT);
        list3.add(FoodType.MILK);
        System.out.println("list3: " + list3);
        System.out.println("___________________________________");

        FoodChecker foodChecker = new FoodChecker();
        System.out.println("list is Vegetarian? " + foodChecker.isVegetarian(list));
        System.out.println("list2 is Vegetarian? " + foodChecker.isVegetarian(list2));
        System.out.println("list3 is Vegetarian? " + foodChecker.isVegetarian(list3));
    }
}
