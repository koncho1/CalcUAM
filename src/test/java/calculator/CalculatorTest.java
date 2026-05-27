package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testPower() {
        assertEquals(4.0, c.powerTwoNumbers(2, 2));
    }

    @Test
    void testSqrt() {
        assertEquals(4.0, c.sqrt(16));
    }


    @Test
    void testSquareArea() {
        assertEquals(1.0, c.CalculateSquareArea(1));
    }

    @Test
    void testRectArea() {
        assertEquals(1.0, c.CalculateRectArea(1, 1));
    }

    @Test
    void testTriangleArea() {
        assertEquals(10.0, c.CalculateTriangleArea(4, 5));
    }


    @Test
    void testSquareCirc() {
        assertEquals(20, c.CalculateSquareCirc(5));
    }

    @Test
    void testRectCirc() {
        assertEquals(18, c.CalculateRectCirc(4, 5));
    }

    @Test
    void testTriangleCirc() {
        assertEquals(12.0, c.CalculateTriangleCirc(3, 4, 5));
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, c.convertCelsiusToFarenheit(0));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, c.convertFarenheitToCelsius(32));
    }

    @Test
    void testMphToKph() {
        assertEquals(16.1, c.convertFromMphToKph(10));
    }



    @Test
    void testFactorial() {
        assertEquals(120, c.factorial(5));
        assertEquals(1, c.factorial(0));
    }


    @Test
    void testFibonacci() {
        assertEquals(0, c.fibbonacci(0));
        assertEquals(1, c.fibbonacci(1));
        assertEquals(8, c.fibbonacci(6));
    }



    @Test
    void testGCD() {
        assertEquals(1, c.findGCD(5, 7));
    }

    @Test
    void testLCM() {
        assertEquals(0, c.findLCM(10, 0));
    }


    @Test
    void testPrime() {
        assertFalse(c.isPrime(1));
        assertFalse(c.isPrime(4));
        assertTrue(c.isPrime(2));
        assertTrue(c.isPrime(7));
    }
}