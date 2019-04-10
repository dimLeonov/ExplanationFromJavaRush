package com.tasks.arithmetical;

public class Task3 {
    public static double addTenPercent(int i) {
        double Ten = (double) i / 10;
        return i + Ten;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(100));
    }
}
//adding 10 % to a value
