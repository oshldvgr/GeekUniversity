package ru.shadrina.se;

import java.util.*;

class UniqueArray {
    private HashSet<String> modifiedSet = new HashSet<>();
    private Map<String, Integer> frequency = new HashMap<>();

    UniqueArray(String[] input) {
        for (String string : input) {
            int count = (modifiedSet.add(string)) ? 1 : frequency.get(string) + 1;
            frequency.put(string, count);
        }
    }

    String getModifiedArray() {
        return (modifiedSet.toString());
    }

    String getFrequency() {
        return (frequency.toString());
    }
}
