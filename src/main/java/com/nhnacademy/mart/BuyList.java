package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    // TODO add 메서드 생성
    public void add(String line)
    {
        StringTokenizer stringTokenizer = new StringTokenizer(line);
        while(stringTokenizer.hasMoreTokens())
        {
            String name = stringTokenizer.nextToken();
            String amount = stringTokenizer.nextToken();
            items.add(new Item(name,Integer.parseInt(amount));
        }
    }
    public ArrayList<Item> getItems()
    {
        return items;
    }
    public static class Item {
        private final String name;
        private final int amount;
        public Item(String name,int amount){
            this.name=name;
            this.amount=amount;
        }


        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }
    }
}
