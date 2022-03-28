package com.android.s19110270;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Calculator mCalculator = new Calculator();
    //ADD
    @Test
    public void addTwoNumbers() {
        double result = mCalculator.add(2d,4d);
        assertEquals(result, 6d,0);
    }

    @Test
    public void addTwoNumbersNegative() {
        double result = mCalculator.add(-1d, 2d);
        assertEquals(result, 1d,0);
    }

    @Test
    public void addTwoNumbersFloats() {
        double result = mCalculator.add(3.111f, 2.222d);
        assertEquals(result, 5.333d,0.01d);
    }

    @Test
    public void addTwoNumbersInfinity() {
        double result = mCalculator.add(Double.POSITIVE_INFINITY, 2.222d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void addTwoNumbersNegativeResult() {
        double result = mCalculator.add(-22d, 10d);
        assertEquals(result, -12d,0);
    }
///////////////////////////////////////////////////////////////////////////////
    //SUB
    @Test
    public void subTwoNumbers() {
        double result = mCalculator.sub(4d,2d);
        assertEquals(result, 2d,0);
    }

    @Test
    public void subTwoNumbersNegative() {
        double result = mCalculator.sub(-1d, -2d);
        assertEquals(result, 1d,0);
    }

    @Test
    public void subTwoNumbersFloats() {
        double result = mCalculator.sub(3.111f, 2.222d);
        assertEquals(result, 0.89d,0.001d);
    }

    @Test
    public void subTwoNumbersInfinity() {
        double result = mCalculator.sub(Double.POSITIVE_INFINITY, 2.222d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void subTwoNumbersNegativeResult() {
        double result = mCalculator.sub(-22d, 10d);
        assertEquals(result, -32d,0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    //Mul
    @Test
    public void mulTwoNumbers() {
        double result = mCalculator.mul(4d,2d);
        assertEquals(result, 8d,0);
    }

    @Test
    public void mulTwoNumbersNegative() {
        double result = mCalculator.mul(-1d, -2d);
        assertEquals(result, 2d,0);
    }

    @Test
    public void mulTwoNumbersFloats() {
        double result = mCalculator.mul(3.111f, 2.222d);
        assertEquals(result, 6.912d,0.001d);
    }

    @Test
    public void mulTwoNumbersInfinity() {
        double result = mCalculator.mul(Double.POSITIVE_INFINITY, 2.222d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void mulTwoNumbersNegativeResult() {
        double result = mCalculator.mul(-22d, 10d);
        assertEquals(result, -220d,0);
    }
    @Test
    public void mulTwoNumbersZero() {
        double result = mCalculator.mul(22d, 0d);
        assertEquals(result, 0,0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    // DIV
    @Test
    public void divTwoNumbers() {
        double result = mCalculator.div(4d,2d);
        assertEquals(result, 2d,0);
    }

    @Test
    public void divTwoNumbersNegative() {
        double result = mCalculator.div(-1d, -2d);
        assertEquals(result, 0.5d,0);
    }

    @Test
    public void divTwoNumbersFloats() {
        double result = mCalculator.div(3.111f, 2.222d);
        assertEquals(result, 1.4d,0.001d);
    }

    @Test
    public void divTwoNumbersInfinity() {
        double result = mCalculator.div(2.222d,Double.POSITIVE_INFINITY);
        assertEquals(result, 0,0);
    }
    @Test
    public void divTwoNumbersNegativeResult() {
        double result = mCalculator.div(-22d, 10d);
        assertEquals(result, -2.2d,0);
    }
    @Test
    public void divTwoNumbersZero() {
        double result = mCalculator.div(22d, 0d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    //POW
    @Test
    public void powTwoNumbers() {
        double result = mCalculator.pow(4d,2d);
        assertEquals(result, 16d,0);
    }

    @Test
    public void powTwoNumbersNegative() {
        double result = mCalculator.pow(-1d, -2d);
        assertEquals(result, 1d,0);
    }

    @Test
    public void powTwoNumbersFloats() {
        double result = mCalculator.pow(3.111f, 2.222d);
        assertEquals(result, 12.451d,0.001d);
    }

    @Test
    public void powTwoNumbersInfinity() {
        double result = mCalculator.pow(2.222d,Double.POSITIVE_INFINITY);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void powTwoNumbersNegativeResult() {
        double result = mCalculator.pow(-2d, 3d);
        assertEquals(result, -8d,0);
    }
    @Test
    public void powTwoNumbersZero() {
        double result = mCalculator.pow(22d, 0d);
        assertEquals(result, 1,0);
    }
    @Test
    public void powTwoNumbers0AndNegativeOne() {
        double result = mCalculator.pow(0, -1d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    //FAC
    @Test
    public void facNumber() {
        double result = mCalculator.factorial(4d);
        assertEquals(result, 24d,0);
    }

    @Test
    public void facNumbersNegative() {
        double result = mCalculator.factorial(-4d);
        assertEquals(result, -24d,0);
    }

    @Test
    public void facNumberFloats() {
        Double result = mCalculator.factorial(3.111f);
        assertEquals(String.valueOf(result), "null");
    }


    @Test
    public void facNumberNegativeResult() {
        double result = mCalculator.factorial(-2d);
        assertEquals(result, -2d,0);
    }
    @Test
    public void facNumberZero() {
        double result = mCalculator.factorial(0);
        assertEquals(result, 1, 0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    //LOG
    @Test
    public void logTwoNumbers() {
        double result = mCalculator.logarith(4d,2d);
        assertEquals(result, 0.5d,0);
    }

    @Test
    public void logTwoNumbersNegative() {
        double result = mCalculator.logarith(-1d, -2d);
        assertEquals(result, Double.NaN,0);
    }

    @Test
    public void logTwoNumbersFloats() {
        double result = mCalculator.logarith(3.111f, 2.222d);
        assertEquals(result, 0.7034d,0.001d);
    }

    @Test
    public void logTwoNumbersInfinity() {
        double result = mCalculator.logarith(2.222d,Double.POSITIVE_INFINITY);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }

    @Test
    public void logTwoNumbersZero() {
        double result = mCalculator.logarith(22d, 0d);
        assertEquals(result, Double.NEGATIVE_INFINITY,0);
    }
    @Test
    public void logTwoNumbers0AndNegativeOne() {
        double result = mCalculator.logarith(0, 3d);
        assertEquals(result, 0,0);
    }
}