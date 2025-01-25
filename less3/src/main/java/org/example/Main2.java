package org.example;

import java.util.Scanner;

public class Main2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int l = 0; l < n; l++) {
            arr[l] = scanner.nextInt();
        }

        int sum = 0;
        int pr = 1;

        for( int i = 0; i < n; i++) {

           if (arr[i] > 9 && arr[i] < 100) {
               sum += arr[i];
           }
           if (arr[i] > 99 && arr[i] < 1000) {
               pr *= arr[i];
           }

        }

        System.out.println("sum=" + sum);
        System.out.println("pr=" + pr);
    }
}