package com.company;

public class MergeSort {
    public void sort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return;
        }
        mergeSort(array,0,n);
    }

    private void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex < 2) {
            return;
        }

        int middleIndex = (rightIndex + leftIndex) / 2;
        mergeSort(array,leftIndex,middleIndex);
        mergeSort(array,middleIndex,rightIndex);
        merge(array,leftIndex,middleIndex,rightIndex);
    }

    private void merge(int[] array, int leftIndex, int middleIndex, int rightIndex) {
        if (array[middleIndex - 1] <= array[middleIndex]) {
            return;
        }
        int i = leftIndex;
        int j = middleIndex;
        int tempIndex = 0;

        int[] temp = new int[rightIndex-leftIndex];
        while (i < middleIndex && j < rightIndex) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array,i,array,leftIndex+tempIndex,middleIndex-i);
        System.arraycopy(temp,0,array,leftIndex,tempIndex);
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
