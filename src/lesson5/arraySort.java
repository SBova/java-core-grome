package lesson5;

import java.util.Arrays;

public class arraySort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        sortAscending(arr);
        System.out.println(Arrays.toString(arr));
        sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sortAscending(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortDescending(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}