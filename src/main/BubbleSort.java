package main;

import java.util.Random;

public class BubbleSort {

    public static void main1(String[] args) {
        int[] arr = {8, 4, 6, 1, 3};
        printArray(arr);
        //1 3 4 6 8 - sorted: 3 > 1, 4 > 3, ..

        /*
        8 4 6 1 3   -> 8 > 4 => swap
        4 6 1 3 8
        4 1 3 6 8
        1 3 4 6 8
        1 3 4 6 8 -> nothing changed => finish
        * */

        sort(arr);
        printArray(arr);
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1000);
        }
        printArray(array);
        sort(array);
        printArray(array);
    }

    static void sort(int[] arr) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 1; i < arr.length; i++) {
                int current = arr[i];
                int previous = arr[i - 1];
                if (current < previous) {  // swap arr[i] and arr[i-1]
                    arr[i] = previous;
                    arr[i - 1] = current;
                    changed = true;
                }
            }
//            printArray(arr);
        }
    }

    static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
