package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int m = scanner.nextInt();

        int k = scanner.nextInt();

        if (k % n ==0) {
            System.out.println("Yes");
        } else if (k % m==0)
            System.out.println("Yes");
        else {
            System.out.println("No");
        }
    }
}