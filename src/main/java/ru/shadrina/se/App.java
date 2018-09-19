package ru.shadrina.se;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String[][] variable = new String[][]{{"0", "0", "0", "0"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"},
                {"0", "0", "0", "0"}};
        try {
            System.out.println("Total counting is " + arrayToNumber(variable));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int arrayToNumber(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int counting = 0;
        if (array.length != 4) throw new MyArraySizeException();
        for (int i = 0; i <= (array.length - 1); i++) {
            if (array[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j <= (array[i].length - 1); j++) {
                try {
                    counting += Integer.valueOf(array[i][j]);
                } catch (NumberFormatException e) {
                    int[] position = new int[]{i, j};
                    throw new MyArrayDataException(position);
                }
            }
        }
        return counting;
    }
}


