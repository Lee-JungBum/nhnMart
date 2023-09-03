package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private static final Logger loger = LoggerFactory.getLogger(Customer.class);

    // 고객 구매 목록
    private final BuyList buyList;
    private int money = 20_000;
    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
        for (BuyList.Item item : buyList.getItems()) {
            for (int i = 0; i < item.getAmount(); i++) {
                basket.add(foodStand.putBasket(item.getName()));
            }
        }

    }

    // TODO payTox 메서드 구현
    public int payTox(Counter counter) {
        money = counter.pay(money, basket);
        loger.info("잔돈 : " + money);
        System.out.println("고객님 결제 후 잔액 : " + money);
        return money;
    }

}
