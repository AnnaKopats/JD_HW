package com.academy.kopats.lesson3;

public class Task9 {
    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            System.out.print(i);
            if (i == 9) {
                for (i = 0; i <= 9; i++) {
                    System.out.print(i + "" + i);
                    if (i == 9) {
                        for (i = 0; i <= 9; i++) {
                            System.out.print(i + "" + i + "" + i);
                            if (i == 9) {
                                for (i = 0; i <= 9; i++) {
                                    System.out.print(i + "" + i + "" + i + "" + i);
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
