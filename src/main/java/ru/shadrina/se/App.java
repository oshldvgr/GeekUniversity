package ru.shadrina.se;


public class App {
    public static void main(String[] args) {
        testTask1();
        testTask2();
    }

    private static void testTask1() {
        String[] test = {"f", "r", "j", "a", "b", "g", "r", "r", "g", "d", "f", "a", "c"};
        UniqueArray a = new UniqueArray(test);
        System.out.println("Your array was modified " + a.getModifiedArray());
        System.out.println("Frequency of string occurrence in your array " + a.getFrequency());
    }

    private static void testTask2() {
        Phonebook test = new Phonebook();
        test.addNumber("Aaa", "7676");
        test.addNumber("Bbb", "9098");
        test.addNumber("Aaa", "4532");
        test.addNumber("Bbb", "3243");
        test.addNumber("Aaa", "6534");
        test.addNumber("Ccc", "1234");
        System.out.println(test.getNumber("Ccc"));
        System.out.println(test.getNumber("Aaa"));
    }

}
