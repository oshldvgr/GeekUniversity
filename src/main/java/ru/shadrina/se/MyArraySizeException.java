package ru.shadrina.se;

class MyArraySizeException extends Exception {
    MyArraySizeException() {
        super("Invalid input. It should be a 4x4 array");
    }
}
