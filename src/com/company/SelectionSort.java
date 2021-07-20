package com.company;

public class SelectionSort {
    void sort(int[] array) {
        int n = array.length;
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            int newMin = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[newMin]) {
                    newMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[newMin];
            array[newMin] = temp;
        }

    }

    void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
