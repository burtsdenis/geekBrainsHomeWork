package ru.geekbrains.quarter1.java2.lesson5;


public class Main {
    private static final int SIZE = 1_000_000;
    private static final int h = SIZE / 2;

    public static void main(String[] args) {
        System.out.println(fillArrayWithoutThreads());
        System.out.println(fillArrayWithThreads());

    }

    public static String fillArrayWithoutThreads() {
        float[] checkedArray = new float[SIZE];
        System.out.print("Starting calculate in single thread!\n");

        for (int i = 0; i < SIZE; i++) {
            checkedArray[i] = 1;
        }
        long startCalculating = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            checkedArray[i] = (float) (checkedArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        return "Calculated in: " + (System.currentTimeMillis() - startCalculating) + "ms\n";
    }

    public static String fillArrayWithThreads() {
        System.out.print("Starting calculate in two threads!\n");

        final int[] calcResults = new int[2];

        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        float[] array1 = new float[h];
        float[] array2 = new float[h];

        long startCopyTime = System.currentTimeMillis();

        System.arraycopy(arr, 0, array1, 0, h);
        System.arraycopy(arr, h, array2, 0, h);

        System.out.println("Arrays copied in: " + (System.currentTimeMillis() - startCopyTime) + "ms");


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                long startCalc = System.currentTimeMillis();
                for (int i = 0; i < array1.length; i++) {
                    array1[i] = (float) (array1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                calcResults[0] = (int) (System.currentTimeMillis() - startCalc);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long startCalc = System.currentTimeMillis();
                for (int i = 0; i < array2.length; i++) {
                    array2[i] = (float) (array2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                calcResults[1] = (int) (System.currentTimeMillis() - startCalc);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long copyStart = System.currentTimeMillis();
        System.arraycopy(array1, 0, arr, 0, h);
        System.arraycopy(array2, 0, arr, h, h);
        System.out.println("Arrays united in: " + (System.currentTimeMillis() - copyStart) + "ms");



        return String.format("Calculated in: \nThread 1: %dms\nThread 2: %dms\n", calcResults[0], calcResults[1]);
    }
}
