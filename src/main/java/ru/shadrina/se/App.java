package ru.shadrina.se;


public class App {
    public static void main(String[] args) {
        String[] test = {"g", "r", "g", "a", "b", "g", "r", "r", "g", "d", "f", "a", "c"};
        UniqueArray a = new UniqueArray(test);
        System.out.println("Your array was modified " + a.getModifiedArray());
        System.out.println("Frequency of string occurrence in your array " + a.getFrequency());
    }
}
