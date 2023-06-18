package com.academy.kopats.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
     for (int i = 0; i < a; i++) {
         System.out.print(fibonacci(i)+ " ");
     }

    }


    public static int fibonacci(int f) {

        if (f == 0) {
            return 0;
        } else if (f == 1 || f == 2) {
            return 1;
        } else
            return fibonacci(f - 1) + fibonacci(f - 2);
    }


}
