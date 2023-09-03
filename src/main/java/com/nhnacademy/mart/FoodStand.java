package com.nhnacademy.mart;

import java.util.ArrayList;

public class FoodStand {

    private final ArrayList<Food> foods = new ArrayList<>();

    // TODO add 메서드 구현
    public void add(Food food) {
        foods.add(food);
    }

    // TODO 장바구니에 담은 Food 삭제 구현
    public Food putBasket(String name) {
        for (Food food : foods) {
            if (food.getName().equals(name)) {
                foods.remove(food);
                return food;
            }
        }
        throw new IllegalArgumentException("식품 매데에 없거나 재고가 부족합니다");
    }

}
