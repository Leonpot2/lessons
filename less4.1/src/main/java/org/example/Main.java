package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        int x = 1;
        Math.pow(2, x);
        while (N > Math.pow(2, x)) {
            x = x + 1;
        }

        System.out.println("x = " + (x-1));
    }
}