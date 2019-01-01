import java.io.*;
import java.lang.*;

class SelectionSort {
    public static void SelectionSortX(int arr[]) {
        int i = 0;
        int mini = 0;
        int pass = 0;
        int temp = 0;
        for (pass = 0; pass < arr.length; pass++) {
            mini = pass;
            for (i = pass + 1; i < arr.length; i++) {
                if (arr[i] < arr[mini]) {
                    mini = i;
                }
            }
            temp = arr[pass];
            arr[pass] = arr[mini];
            arr[mini] = temp;
        }
        System.out.println();
        System.out.println("Array after Selction Sorting :");
        for (int j = 0; j < arr.length; j++) {
            System.out.print("  " + arr[j]);
        }
    }

    public static void main(String args[]) {
        int[] brr = { 2, 5, 8, 6, 46, 82, 3, 8, 12, 28, 20 };
        System.out.println("Input Array is :");
        for (int j = 0; j < brr.length; j++) {
            System.out.print("  " + brr[j]);
        }
        System.out.println();
        SelectionSortX(brr);

    }
}