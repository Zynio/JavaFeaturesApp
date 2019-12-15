package com.zynis.knowladge.unit;

import com.zynis.knowladge.FibonacciNumberApp;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FibonacciNumberAppTest {

    FibonacciNumberApp fibonacciNumberApp;

    @Before
    public void init() {
        this.fibonacciNumberApp = new FibonacciNumberApp();
    }

    @Test
    public void getFibonacciNumberTest() {
        int fibonacciNumber = this.fibonacciNumberApp.getFibonacciNumber(12);

        assertEquals(fibonacciNumber, 144);
    }

    @Test
    public void getFibonacciWithCacheNumberTest() {
        int fibonacciNumber = this.fibonacciNumberApp.getFibonacciWithCacheNumber(12);

        assertEquals(fibonacciNumber, 144);
    }
}
