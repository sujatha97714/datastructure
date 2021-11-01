package Algorithms.Sorting;

import Algorithms.ArrayUtils;
public class BubbleSort {

    static void BubbleSort(int[] arr) {
        for(int i =0; i< arr.length - 1; i++) {
            for(int j =0; j< arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    ArrayUtils.swap(arr, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 6, 10, 9, 7};
        System.out.println("Array before sorting...");
        ArrayUtils.printArray(arr);
        BubbleSort(arr);
        System.out.println("Array after sorting...");
        ArrayUtils.printArray(arr);
    }
}
