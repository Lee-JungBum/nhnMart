package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void bring() {
    }

    @Test
    void pickFoods() {
        BuyList buyList = new BuyList();
        buyList.add("apple 5 grace 4");
        Customer customer = new Customer(buyList);
    }
}