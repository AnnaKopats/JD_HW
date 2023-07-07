package com.academy.kopats.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FractionTest {
    private Fraction fraction1 = new Fraction(5,6);
    private Fraction fraction2 = new Fraction(2,5);
    private int i = 2;

    @Test
    public void addTest() {
        assertEquals(new Fraction(37,30), fraction1.add(fraction2));
    }

    @Test
    public void divideTest() {
        assertEquals(new Fraction(5,12), fraction1.divide(i));
    }
    @Test
    public void multiplyTest() {
        assertEquals(new Fraction(10,6), fraction1.multiply(i));
    }
    @Test
    public void divideByZeroTest(){
        assertThrows(ArithmeticException.class, ()->fraction1.divide(0));
    }
}
