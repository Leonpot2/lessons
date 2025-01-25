package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();

        int res = 1;

        for (int i = 2; i <= n ; i++ ) {

            res = res * i;
        }

        System.out.println("n!=" + res);
    }
}