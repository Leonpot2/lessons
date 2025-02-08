package org.example;

import java.util.Scanner;

public class Main3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();

        int res = 1;
        System.out.println();
        int sum = 0;

        for (int i = 2; i <= n ; i++ ) {
            res = res + i;
            sum += res;
        }

        System.out.println("sum=" + sum);
    }
}