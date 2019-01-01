import java.io.*;
import java.lang.*;

class InsertionSort {
    public static void InsertionSortX(int arr[]) {
        int i = 0;
        int j = 0;
        int key = 0;

        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while ((j >= 0) && (arr[j] > key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println();
        System.out.println("Array after Selction Sorting :");
        for (int k = 0; k < arr.length; k++) {
            System.out.print("  " + arr[k]);
        }
    }

    public static void main(String args[]) {
        int[] brr = { 2, 5, 8, 6, 46, 82, 3, 8, 12, 28, 20 };
        System.out.println("Input Array is :");
        for (int j = 0; j < brr.length; j++) {
            System.out.print("  " + brr[j]);
        }
        System.out.println();
        InsertionSortX(brr);

    }
}