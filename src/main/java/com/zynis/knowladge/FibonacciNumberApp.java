package com.zynis.knowladge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FibonacciNumberApp {

    private Map<Integer, Integer> fibonacciResultCache = new HashMap<>();

    public int getFibonacciNumber(int value) {
        if (value <= 1) {
            return value;
        }

        return getFibonacciNumber(value - 1) + getFibonacciNumber(value - 2);
    }

    public int getFibonacciWithCacheNumber(int value) {
        if (value <= 1) {
            return value;
        }

        if (fibonacciResultCache.containsKey(value)) {
            return fibonacciResultCache.get(value);
        }

        int fibonacciNumber = getFibonacciWithCacheNumber(value - 1) + getFibonacciWithCacheNumber(value - 2);

        fibonacciResultCache.put(value, fibonacciNumber);

        return fibonacciNumber;
    }

}
