package com.TasksFromBook;

public class ShortLogicDemo {
    public static void main(String[] args) {
        int n, d , q;

        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0)
            System.out.println(d + "is a factor of " + n);

        d = 0;

        if (d != 0 && (n & d) == 0)
            System.out.println(d + "is a factor of " + n);

        //Now without a short - circuit operator
        // this will cause Divide by zero exception
     /*   if (d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    */
}
}
