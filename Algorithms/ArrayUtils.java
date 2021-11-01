package Algorithms;

public class ArrayUtils {
    public static void swap(int[] arr, int i, int j) {
        // int tmp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = tmp;
        // or
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
