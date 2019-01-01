import java.io.*;
import java.lang.*;

class BubbleSort {
    public static void BubbleSortX(int arr[], int option) {
        int x = 0, y = 0;
        int i = 0, j = 0;
        int pass = 0;
        int sorted = 0;
        int temp = 0;
        int iCnt = 0;

        if (option == 1) {
            x = 0;
            y = 1;
        } else {
            x = 1;
            y = 0;
        }
        sorted = 1;

        for (pass = 0; (pass < arr.length) && (sorted == 1); pass++) {
            sorted = 0;
            for (i = 0; i < arr.length - pass - 1; i++) {
                if (arr[i + x] > arr[i + y]) {
                    temp = arr[i + x];
                    arr[i + x] = arr[i + y];
                    arr[i + y] = temp;
                    sorted = 1;
                }
                iCnt++;
            }
            System.out.println("Array after pass " + pass + 1);
            for (j = 0; j < arr.length; j++) {
                System.out.print("  " + arr[j]);
            }
            System.out.println();
        }
        System.out.println("Number of elements :" + arr.length);
        System.out.println("Number of passes :" + pass + 1);
        System.out.println("number of itration :" + iCnt);
    }

    public static void main(String args[]) {
        int[] brr = { 2, 5, 8, 6, 46, 82, 3, 8, 12, 28, 20 };
        System.out.println("Input Array is :");
        for (int j = 0; j < brr.length; j++) {
            System.out.print("  " + brr[j]);
        }
        System.out.println();

        // second parameter of BubbleSort
        // if you want array sort in assending order enter 1
        // if you wand array sort in decending order enter 2
        BubbleSortX(brr, 2);

    }
}
