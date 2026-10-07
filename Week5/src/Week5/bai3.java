package Week5;

import java.util.Scanner;

public class bai3 {
    public static void insertIntoSorted(int[] arr) {
        int n = arr.length;
        int valueToInsert = arr[n - 1];
        int i = n - 2;
        while (i >= 0 && arr[i] > valueToInsert) {
            arr[i + 1] = arr[i];
            printArray(arr);
            i--;
        }
        arr[i + 1] = valueToInsert;
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            insertIntoSorted(arr);
        }
        scanner.close();
    }
}
