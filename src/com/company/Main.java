package com.company;

public class Main {

    public static void main(String[] args) {

        // Insertion Sort
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {5,2,4,6,1,3};
        insertionSort.printArray(array);
        insertionSort.sort(array);
        insertionSort.printArray(array);
    }
}
