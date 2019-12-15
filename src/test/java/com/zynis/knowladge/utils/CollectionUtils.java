package com.zynis.knowladge.utils;

import java.util.Set;

public class CollectionUtils {

    public static int getIndex(Set<String> set, Object value) {
        int result = 0;
        for (Object entry:set) {
            if (entry.equals(value)) return result;
            result++;
        }
        return -1;
    }
}
