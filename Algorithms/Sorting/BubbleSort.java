package Algorithms.Sorting;

public class BubbleSort {

    static void swap(int[] arr, int i, int j) {
        // int tmp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = tmp;
        // or
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];

    }

    static void BubbleSort(int[] arr) {
        for(int i =0; i< arr.length - 1; i++) {
            for(int j =0; j< arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 6, 10, 9, 7};
        System.out.println("Array before sorting...");
        printArray(arr);
        System.out.println("Array after sorting...");
        printArray(arr);
    }
}
