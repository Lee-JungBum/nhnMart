package com.nhnacademy.mart;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Food> foods = new ArrayList<>();

    public void add(Food food) {
        foods.add(food);
    }

    public int sum() {
        int reslut = 0;
        for (Food food : foods) {
            reslut += food.getPrice();
        }
        return reslut;
    }
}
