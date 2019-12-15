package com.zynis.knowladge.efficiency;

import com.zynis.knowladge.FibonacciNumberApp;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.time.temporal.ChronoUnit.MILLIS;
import static java.time.temporal.ChronoUnit.MINUTES;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FibonacciNumberAppTest {

    private final Logger logger = Logger.getLogger(getClass().getName());

    FibonacciNumberApp fibonacciNumberApp;

    @Before
    public void init() {
        this.fibonacciNumberApp = new FibonacciNumberApp();
    }

    @Test
    public void compareGetFibonacciNumberVoidAndGetFibonacciWithCacheNumberTest() {
        LocalTime startGetFibonacciNumberTime = LocalTime.now();
        this.fibonacciNumberApp.getFibonacciNumber(40);
        LocalTime endGetFibonacciNumberTime = LocalTime.now();

        LocalTime startGetFibonacciWithCacheNumberTime = LocalTime.now();
        this.fibonacciNumberApp.getFibonacciWithCacheNumber(40);
        LocalTime endGetFibonacciWithCacheNumberTime = LocalTime.now();

        long firstMethodDuration = MILLIS.between(startGetFibonacciNumberTime, endGetFibonacciNumberTime);
        long secondMethodDuration = MILLIS.between(startGetFibonacciWithCacheNumberTime, endGetFibonacciWithCacheNumberTime);

        logger.log(Level.INFO, "FIRST METHOD DURATION: {0}",  firstMethodDuration);
        logger.log(Level.INFO, "SECOND METHOD DURATION: {0}",  secondMethodDuration);

        assertTrue(firstMethodDuration > secondMethodDuration);
    }
}
