package ru.shadrina.se;

import java.util.*;

class Phonebook {
    private Map<String, ArrayList<String>> book = new HashMap<>();

    public String getPhonebook() {
        return book.toString();
    }

    void addNumber(String lastName, String phoneNumber) {
        if (book.containsKey(lastName)) {
            book.get(lastName).add(phoneNumber);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            book.put(lastName, numbers);
        }
    }

    ArrayList<String> getNumber(String lastName) {
        return ( book.get(lastName));
    }
}
