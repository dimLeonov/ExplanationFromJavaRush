package com.TasksFromBook;


/* This program illustrates the differences between in and double */
public class Task1 {
    public static void main(String[] args) {
        int v;
        double x;

        //assign v the value 10
        v = 10;

        //assign x thhe value 10.0
        x = 10.0;

        System.out.println("Original value of v: " + v);
        System.out.println("Original value of x: " + x);

        //now divide both by 4
        v = v / 4;
        x = x / 4;

        System.out.println(v);
        System.out.println(x);
    }
}
