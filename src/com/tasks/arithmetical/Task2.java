package com.tasks.arithmetical;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(41,15));
        System.out.println(convertEurToUsd(42,12));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = eur * course;
        return usd;
    }
}
                //return type means that with this keyword we can finish the execution of a method and can be used to
                //return value from a method.