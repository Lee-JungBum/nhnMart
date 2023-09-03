package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {
    private static final Logger logger = LoggerFactory.getLogger(Counter.class);

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)
    public int pay(int money, Basket basket) {
        int sum = basket.sum();
        if (money < sum) {
            logger.warn("돈을 초과하는 상품 구매");
            throw new IllegalArgumentException("돈을 초과하는 상품 구매");
        }
        logger.info("총 " + sum + "원");
        System.out.println("총 가격은 " + sum + "원 입니다");

        return money - sum;
    }

}
