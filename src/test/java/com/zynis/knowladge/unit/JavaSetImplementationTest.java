package com.zynis.knowladge.unit;

import com.zynis.knowladge.utils.CollectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class JavaSetImplementationTest {

    private final Logger logger = Logger.getLogger(getClass().getName());

    HashSet<String> hashSet;
    TreeSet<String> treeSet;
    LinkedHashSet<String> linkedHashSet ;

    @Before
    public void init() {
        this.hashSet =  new HashSet<>();
        //W własnym comperatorem
        this.treeSet = new TreeSet<>((s, t1) -> s.length() - t1.length());
        this.linkedHashSet =  new LinkedHashSet<>();

        this.setDataToSet(this.hashSet);
        this.setDataToSet(this.treeSet);
        this.setDataToSet(this.linkedHashSet);
    }

    private void setDataToSet(Set<String> set) {
        set.add("Test");
        set.add("Test22");
        set.add("Test1");
        set.add("Test333");
        set.add("test55555");
        set.add("Test4444");
        set.add("Test666666");
        set.add("Test999999999");
        set.add("Test88888888");
        set.add("Test7777777");
    }

    @Test
    public void hashSetTest() {
        assertEquals(this.hashSet.size(), 10);
    }

    @Test
    public void treeSetTest() {
        assertEquals(this.treeSet.size(), 10);

        assertEquals(CollectionUtils.getIndex(this.treeSet, "Test"), 0);
        assertEquals(CollectionUtils.getIndex(this.treeSet, "Test1"), 1);
        assertEquals(CollectionUtils.getIndex(this.treeSet, "Test22"), 2);
        assertEquals(CollectionUtils.getIndex(this.treeSet, "Test333"), 3);
        assertEquals(CollectionUtils.getIndex(this.treeSet, "Test4444"), 4);
        assertEquals(CollectionUtils.getIndex(this.treeSet, "test55555"), 5);
        assertEquals(CollectionUtils.getIndex(this.treeSet, "Test666666"), 6);
        assertEquals(CollectionUtils.getIndex(this.treeSet, "Test7777777"), 7);
        assertEquals(CollectionUtils.getIndex(this.treeSet, "Test88888888"), 8);
        assertEquals(CollectionUtils.getIndex(this.treeSet, "Test999999999"), 9);

        assertEquals(this.treeSet.first(), "Test");
        assertEquals(this.treeSet.last(), "Test999999999");
        assertEquals(this.treeSet.headSet("Test4444").size(), 4);
        assertEquals(this.treeSet.tailSet("Test4444").size(), 6);
    }

    @Test
    public void linkedHashSetTest() {
        assertEquals(this.linkedHashSet.size(), 10);

        assertEquals(CollectionUtils.getIndex(this.linkedHashSet, "Test"), 0);
        assertEquals(CollectionUtils.getIndex(this.linkedHashSet, "Test22"), 1);
        assertEquals(CollectionUtils.getIndex(this.linkedHashSet, "Test1"), 2);
        assertEquals(CollectionUtils.getIndex(this.linkedHashSet, "Test333"), 3);
        assertEquals(CollectionUtils.getIndex(this.linkedHashSet, "test55555"), 4);
        assertEquals(CollectionUtils.getIndex(this.linkedHashSet, "Test4444"), 5);
        assertEquals(CollectionUtils.getIndex(this.linkedHashSet, "Test666666"), 6);
        assertEquals(CollectionUtils.getIndex(this.linkedHashSet, "Test999999999"), 7);
        assertEquals(CollectionUtils.getIndex(this.linkedHashSet, "Test88888888"), 8);
        assertEquals(CollectionUtils.getIndex(this.linkedHashSet, "Test7777777"), 9);
    }
}
