package com.academy.belousova.lesson22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FractionTest {

    int value = 2;

    Fraction fraction1 = new Fraction(4, 7);
    Fraction fraction2 = new Fraction(5, 9);
    Fraction temp = new Fraction(0, 0);

    @Test
    public void TestSum() {

        if (fraction1.getY() == fraction2.getY()) {
            temp.setX(fraction1.getX() + fraction2.getX());
            temp.setY(fraction1.getY());
        } else {
            temp.setX(fraction1.getX() * fraction2.getY() + fraction2.getX() * fraction1.getY());
            temp.setY(fraction1.getY() * fraction2.getY());
        }

        int expectedSum = 71 / 63;
        assertEquals(expectedSum, temp.getX() / temp.getY());
    }

    @Test
    public void TestMul() {

        int expectedMul = 8 / 7;
        assertEquals(expectedMul, fraction1.getX() * value, fraction1.getY());
    }

    @Test
    public void TestMulByZero() {

        Fraction fraction3 = new Fraction(0, 8);
        assertThrows(ArithmeticException.class, () -> fraction3.mul(value));
    }

    @Test
    public void TestDiv() {

        int expectedDiv = 4 / 14;
        assertEquals(expectedDiv, fraction1.getX(), fraction1.getY() * value);
    }

    @Test
    public void TestDivisionByZero() {

        Fraction fraction4 = new Fraction(5, 0);
        assertThrows(ArithmeticException.class, () -> fraction4.div(value));
    }
}