package src.main.java.org.example;

import java.util.Scanner;

public class Main2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        int x = 0;
        while (N >= Math.pow(2, x)) {
            x++;
            if (Math.pow(2, x) >= N) {
                break;
            }
        }
        System.out.println("x = " + x);
    }
}