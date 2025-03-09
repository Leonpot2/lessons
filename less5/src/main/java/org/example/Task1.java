package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        int count = scanner.nextInt();

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int n = random.nextInt(1001);
            result.add(n);
        }
        result.add(0);

        System.out.println(result);
        int n;
        int max = Math.max(n);
        System.out.println("Наибольшее число: " + n);
    }
}



