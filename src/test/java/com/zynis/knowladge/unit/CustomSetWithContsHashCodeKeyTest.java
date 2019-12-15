package com.zynis.knowladge.unit;

import helpers.CustomSetWithConstantHashCodeKey;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CustomSetWithContsHashCodeKeyTest {

    Set<CustomSetWithConstantHashCodeKey> withCustomSetWithContsHashCodeKeySet;

    @Before
    public void init() {
        this.withCustomSetWithContsHashCodeKeySet = new HashSet<>();
        this.withCustomSetWithContsHashCodeKeySet.add(new CustomSetWithConstantHashCodeKey("A"));
        this.withCustomSetWithContsHashCodeKeySet.add(new CustomSetWithConstantHashCodeKey("B"));
        this.withCustomSetWithContsHashCodeKeySet.add(new CustomSetWithConstantHashCodeKey("C"));
        this.withCustomSetWithContsHashCodeKeySet.add(new CustomSetWithConstantHashCodeKey("D"));
        this.withCustomSetWithContsHashCodeKeySet.add(new CustomSetWithConstantHashCodeKey("A"));
        this.withCustomSetWithContsHashCodeKeySet.add(new CustomSetWithConstantHashCodeKey("B"));
    }

    @Test
    public void setWithCustomSetWithContsHashCodeKeyTest() {
        assertEquals(this.withCustomSetWithContsHashCodeKeySet.size(), 1);
    }
}
