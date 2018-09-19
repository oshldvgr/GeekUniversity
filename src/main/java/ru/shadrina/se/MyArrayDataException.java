package ru.shadrina.se;

import java.util.Arrays;

class MyArrayDataException extends Exception {
    MyArrayDataException(int[] position) {
        super("Invalid data format at position" + Arrays.toString(position));
    }
}