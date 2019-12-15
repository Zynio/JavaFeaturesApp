package com.zynis.knowladge.unit;

import helpers.CustomSetKey;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CustomSetKeyTest {

    Set<CustomSetKey> withCustomSetKeySet;

    @Before
    public void init() {
        this.withCustomSetKeySet = new HashSet<>();
        this.withCustomSetKeySet.add(new CustomSetKey("A"));
        this.withCustomSetKeySet.add(new CustomSetKey("B"));
        this.withCustomSetKeySet.add(new CustomSetKey("C"));
        this.withCustomSetKeySet.add(new CustomSetKey("D"));
        this.withCustomSetKeySet.add(new CustomSetKey("A"));
        this.withCustomSetKeySet.add(new CustomSetKey("B"));
    }

    @Test
    public void setWithCustomSetKeyTest() {
        assertEquals(this.withCustomSetKeySet.size(), 4);
    }
}
