package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int m = scanner.nextInt();

        int k = scanner.nextInt();

        if ((n * m) / 2 == k) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}