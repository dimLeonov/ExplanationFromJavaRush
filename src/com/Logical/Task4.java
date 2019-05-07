package com.Logical;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код\
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            sum = sum + number;
            if (number == -1) {
                break;
            }

        }
        System.out.println(sum);
    }
}
//Enter numbers from the keyboard.
//If the user entered -1, display the sum of all entered numbers and terminate the program.