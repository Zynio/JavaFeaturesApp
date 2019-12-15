package com.zynis.knowladge;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesApp {

    public void removeDuplicatesWithStream(List<String> stringList) {
        List<String> noDuplicatesList = stringList.stream().distinct().collect(Collectors.toList());
        stringList.clear();

        stringList.addAll(noDuplicatesList);
    }

    public void removeDuplicatesWithSet(List<String> stringList) {
        Set<String> set = new HashSet<>(stringList);

        stringList.clear();
        stringList.addAll(set);
    }

    public void removeDuplicatesWithIteration(List<String> stringList) {
        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext()) {
            String nextValue = iterator.next();
            int amount =  Collections.frequency(stringList, nextValue);

            if (amount > 1) {
                iterator.remove();
            }
        }
    }

}
