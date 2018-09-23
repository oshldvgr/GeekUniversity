package ru.shadrina.se;

import java.util.*;

class UniqueArray {
    private Set<String> modifiedSet = new HashSet<>();
    private Map<String, Integer> frequency = new HashMap<>();

    UniqueArray(String[] input) {
        for (String string : input) {
            int count = (modifiedSet.add(string)) ? 1 : frequency.get(string) + 1;
            frequency.put(string, count);
        }
    }

    String getModifiedArray() {
        return modifiedSet.toString();
    }

    Set<Map.Entry<String,Integer>> getFrequency() {
        return (frequency).entrySet();
    }
}
