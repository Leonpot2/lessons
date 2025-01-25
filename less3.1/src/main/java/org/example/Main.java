package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int l = 0; l < n; l++) {
            arr[l] = scanner.nextInt();
        }

        int r = 3;

        int f = 4;

        int res = scanner.nextInt();

//        int sum = 0;
//        int pr = 0;

        for( int i = 0; i < n; i++) {

//            if (arr[i] > 9 && arr[i] < 100) {
//                sum += arr[i];
//            }
//
//            if (arr[i] > 99 && arr[i] < 1000) {
//                pr *= arr[i];
//            }


            if(9 < res && res < 100 || -100 < res && res < -9) {

               System.out.println(f *= res);

            } else if (99 < res && res < 1000) {

                System.out.println(r += res);
            }
        }

    }
}