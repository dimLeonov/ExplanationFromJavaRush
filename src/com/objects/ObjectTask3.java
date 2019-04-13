package com.objects;

public class ObjectTask3 {
    public static void main(String[] args) {
        Orange orange = new Orange();
        orange.addPrice(100);
        Orange orangeTwo = new Orange();
        orangeTwo.addPrice(100);
        System.out.println("OrangeCosts: " + Orange.orangePrice);
    }


    public static class Orange {
        public static int orangePrice = 0;

        public static void addPrice(int orangePrice) {
            Orange.orangePrice += orangePrice;
        }
    }
}