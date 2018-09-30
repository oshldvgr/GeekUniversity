package ru.shadrina.se;

public class App {
    public static void main(String[] args) {
        final int size = 1000000;
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        System.out.println("Method 1 run time: " + method1(arr) + " ms");
        System.out.println("Method 2 run time: " + method2(arr) + " ms");
    }

    private static long method1(float[] arr) {
        long startTime = System.currentTimeMillis();
        transformation(arr, 0);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);

    }

    private static long method2(float[] arr) {
        final int h = arr.length / 2;
        long startTime = System.currentTimeMillis();
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread thread1 = new Thread(() -> transformation(a1, 0));
        Thread thread2 = new Thread(() -> transformation(a2, h));
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);

    }

    private static void transformation(float[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + index) / 5) * Math.cos(0.2f + (i + index) / 5) *
                    Math.cos(0.4f + (i + index) / 2));

        }
    }

}
