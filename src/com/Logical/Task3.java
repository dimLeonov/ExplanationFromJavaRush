package com.Logical;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();

        int q = Integer.parseInt(a);
        int w = Integer.parseInt(b);
        int e = Integer.parseInt(c);

        if (q > w && q < e || q<w && q > e){
            System.out.println(q);
        }
        else if (w > q && w < e || w < q && w > e){
            System.out.println(w);
        }
        else if (e > q && e < w || e < q && e > w){
            System.out.println(e);
        }
        else if (e==q){
            System.out.println(e);
        }
        else if (q==w){
            System.out.println(q);
        }
        else if (e==w){
            System.out.println(e);
        }
    }
}
// Enter three numbers from the keyboard, display the average of them.