package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = sc.nextInt();

        System.out.println("Введите второе число:");
        int b = sc.nextInt();

        System.out.println("Введите операцию (+, -, *, /):");
        char op = sc.next().charAt(0);

        int result = solve(a, b, op);
        System.out.println("Результат: " + result);
    }

    public static int solve(int a, int b, char op) {
        int result = 0;

        switch(op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if(b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                    return 0;
                }
                break;
            default:
                System.out.println("Введена некорректная операция");
                return 0;
        }

        return result;
    }
}