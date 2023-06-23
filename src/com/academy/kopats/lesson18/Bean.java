package com.academy.kopats.lesson18;

public class Bean {
    @Param(a = 6, b = 8)
    public double sum(int a, int b) {
        return a + b;
    }
    @Param(a = 9, b = 2)
    public double max(int a, int b) {
        return Math.max(a, b);
    }
    @Param(a = 7, b = 4)
    public double min(int a, int b) {
        return Math.min(a, b);
    }

    public double avg(int a, int b) {
        return sum(a, b) / 2;
    }
}
