package com.nhnacademy.mart;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NhnMartShell {
    private static final Logger logger = LoggerFactory.getLogger(NhnMart.class);

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList buyList = inputBuyListFromShell();

        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer LeeJungBum = new Customer(buyList);

        // 장바구니를 챙긴다.
        LeeJungBum.bring(mart.provideBasket());

        // 식품을 담는다.
        LeeJungBum.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        LeeJungBum.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력을 받아 buyList 만들기
        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.\n");
        Scanner scanner = new Scanner(System.in);
        BuyList buyList = new BuyList();

        buyList.add(scanner.nextLine());
        for (BuyList.Item item : buyList.getItems()) {
            logger.info(item.getName() + ": " + item.getAmount());
        }
        return buyList;
    }
}
