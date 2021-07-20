package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = {5,2,4,6,1,3};

        // Insertion Sort
//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.printArray(array);
//        insertionSort.increasingSort(array);
//        insertionSort.printArray(array);
//        insertionSort.decreasingSort(array);
//        insertionSort.printArray(array);
//        System.out.println(insertionSort.linearSearch(array, 7));

        // Selection Sort
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.sort(array);
//        selectionSort.printArray(array);

        // Merge Sort
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array);
        mergeSort.printArray(array);
    }
}
