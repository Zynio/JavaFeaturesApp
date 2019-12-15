package com.zynis.knowladge.unit;

import com.zynis.knowladge.RemoveDuplicatesApp;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class RemoveDuplicatesAppTest {

    RemoveDuplicatesApp removeDuplicatesApp;

    List<String> list;

    @Before
    public void init() {
        this.removeDuplicatesApp = new RemoveDuplicatesApp();
        this.list =  new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "A", "V", "B", "C"));
    }

    @Test
    public void removeDuplicatesWithStreamTest() {
        this.removeDuplicatesApp.removeDuplicatesWithStream(this.list);

        assertEquals(this.list.size(), 6);
    }

    @Test
    public void removeDuplicatesWithSetTest() {
        this.removeDuplicatesApp.removeDuplicatesWithSet(this.list);

        assertEquals(this.list.size(), 6);
    }

    @Test
    public void removeDuplicatesWithIterationTest() {
        this.removeDuplicatesApp.removeDuplicatesWithIteration(this.list);

        assertEquals(this.list.size(), 6);
    }
}
