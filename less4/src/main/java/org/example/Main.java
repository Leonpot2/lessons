package src.main.java.org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int day = 1;
        while (x <= y) {
            x += (x * 1.1);
            day++;
        }
        System.out.println("days = " + day);

    }
}