package com.exception;

public class ExceptionExample1 {
    public static void main(String[] args) {
        System.out.println("Program Starts");

        try
        {
            System.out.println("Before method");
            method1();
            System.out.println("After method");
        }
        catch (Exception e)
        {
            System.out.println("Exception has been caught");
        }

        System.out.println("Program still working");
    }
    public static void method1()
    {
        int a = 100,b = 0;
        System.out.println(a / b );
    }
}
