package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NhnMartShellTest {
    @Test
    @DisplayName("정상 결제")
    void marketUse1() {
        NhnMart mart = new NhnMart();
        mart.prepareMart();
        String list = "양파 2 계란 2 파 4";
        BuyList buyList = new BuyList();
        buyList.add(list);

        Customer LeeJungBum = new Customer(buyList);

        // 장바구니를 챙긴다.
        LeeJungBum.bring(mart.provideBasket());

        // 식품을 담는다.
        LeeJungBum.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        Assertions.assertEquals(6000, LeeJungBum.payTox(mart.getCounter()));

    }

    @Test
    @DisplayName("재고 부족")
    void marketUse2() {
        NhnMart mart = new NhnMart();
        mart.prepareMart();
        String list = "양파 3 계란 2 파 4";
        BuyList buyList = new BuyList();
        buyList.add(list);

        Customer LeeJungBum = new Customer(buyList);

        // 장바구니를 챙긴다.
        LeeJungBum.bring(mart.provideBasket());

        // 식품을 담는다.
        // 식품을 담는다.
        Assertions.assertThrows(IllegalArgumentException.class, () -> LeeJungBum.pickFoods(mart.getFoodStand()));

        // 카운터에서 계산한다.

        LeeJungBum.payTox(mart.getCounter());
    }

    @Test
    @DisplayName("판매하지 않는 상품")
    void marketUse3() {
        NhnMart mart = new NhnMart();
        mart.prepareMart();
        String list = "포도 3 계란 2 파 4";
        BuyList buyList = new BuyList();
        buyList.add(list);

        Customer LeeJungBum = new Customer(buyList);

        // 장바구니를 챙긴다.
        LeeJungBum.bring(mart.provideBasket());

        // 식품을 담는다.
        Assertions.assertThrows(IllegalArgumentException.class, () -> LeeJungBum.pickFoods(mart.getFoodStand()));

        // 카운터에서 계산한다.

        LeeJungBum.payTox(mart.getCounter());
    }

    @Test
    @DisplayName("돈을 초과")
    void marketUse4() {
        NhnMart mart = new NhnMart();
        mart.prepareMart();
        String list = "양파 1 사과 10";
        BuyList buyList = new BuyList();
        buyList.add(list);

        Customer LeeJungBum = new Customer(buyList);

        // 장바구니를 챙긴다.
        LeeJungBum.bring(mart.provideBasket());

        // 식품을 담는다.
        LeeJungBum.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        Assertions.assertThrows(IllegalArgumentException.class, () -> LeeJungBum.payTox(mart.getCounter()));
    }
}