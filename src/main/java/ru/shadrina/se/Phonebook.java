package ru.shadrina.se;

import java.util.HashMap;
import java.util.ArrayList;

class Phonebook {
    private HashMap<String, ArrayList<String>> book = new HashMap<>();

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

    String getNumber(String lastName) {
        return ("Phone number of "+lastName+ " is " + book.get(lastName).toString());
    }
}
