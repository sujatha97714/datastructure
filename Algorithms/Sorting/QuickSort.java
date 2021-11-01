package Algorithms.Sorting;

import Algorithms.ArrayUtils;

public class QuickSort {

    public static int partition(int arr[], int start, int end, int pivot) {
        // implement partition
        int i = start;
        for(int j = start; j <= end; j++) {
            if(arr[j] < pivot) {
                ArrayUtils.swap(arr, i, j);
                i++;
            }
        }
        return i;
    }

    public static void quickSortImplementation(int[] arr, int start, int end) {
        // implemennt quick sort
        if(start < end) {
            int pivotValue = arr[start];
            int pivotIndex = partition(arr, start, end, pivotValue);
            quickSortImplementation(arr, start, pivotIndex - 1);
            quickSortImplementation(arr, pivotIndex+1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 6, 1, 2, 10, 9};
        ArrayUtils.printArray(arr);
        quickSortImplementation(arr, 0, arr.length - 1);
        ArrayUtils.printArray(arr);
    }
}
