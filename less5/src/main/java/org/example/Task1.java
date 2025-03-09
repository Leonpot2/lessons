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
        int max = Integer.MIN_VALUE;
        int Max = 0;
        for (int i = 0; i < count; i++) {
            int n = random.nextInt(101);
            result.add(n);

            if (n > max) {
                max = n;
                Max = 1;
            }   else if (n == max) {
                Max++;
            }

        }
        result.add(0);

        System.out.println(result);
        System.out.println("Максимальное число: " + max);
        System.out.println("Количество максимальных чисел: " + Max);
    }
}





