package ru.shadrina.se;

import java.util.*;

public class UniqueArray {
    private String[] input;
    private HashSet<String> modifiedSet = new HashSet<>();
    private Map<String, Integer> frequency = new HashMap<>();

    public UniqueArray(String[] input) {
        this.input = input;
        for (String string : input) {
            int count = (modifiedSet.add(string)) ? 1 : frequency.get(string) + 1;
            frequency.put(string, count);
        }
    }

    public String getModifiedArray() {
        return (modifiedSet.toString());
    }

    public String getFrequency() {
        return (frequency.toString());
    }
}
