package src.main.java.org.example;

import java.util.Random;
import java.util.Scanner;

public class Middle1 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру!\nУ тебя будет 4 попытки для того, чтобы угадать число в промежутке.\nВыбери уровень сложности:\n1.Простой от 5 до 10\n2.Средний от 10 до 50\n3.Сложный от 50 до 150 " + "\nНапиши то число уровня какое выбираешь: ");
        int level = scanner.nextInt();
        if (level == 1) {
            int correct_number = random.nextInt(5, 11);
            System.out.println("Ты выбрал простой уровень от 5 до 10");
            boolean user_won = false;
            for (int i = 0; i < 4; i++) {
                int answer = scanner.nextInt();
                if (answer == correct_number) {
                    System.out.println("Правильно! Ты выиграл. Количество оставшихся попыток: " + (4 - i - 1));
                    user_won = true;
                    break;
                } else {
                    System.out.println("Неправильно, попробуй ещё раз. Количество оставшихся порпыток: " + (4 - i - 1));
                    if (answer > correct_number) {
                        System.out.println("Загаданное число меньше");
                    } else {
                        System.out.println("Загаданное число больше");
                    }
                }
            }
            if (!user_won) {
                System.out.println("К сожалению, ты проиграл. Загаданное число: " + correct_number);
            }
            System.out.println("Хочешь сыграть ещё раз?\n1.Да\n2.Нет");
            int play_again = scanner.nextInt();
            if (!(play_again == 1)) {
                return;
            }
            } else if (level == 2) {
            System.out.println("Ты выбрал средний уровень от 10 до 50");
                int correct_number = random.nextInt(10, 51);
                boolean user_won = false;
                for (int i = 0; i < 4; i++) {
                    int answer = scanner.nextInt();
                    if (answer == correct_number) {
                        System.out.println("Правильно! Ты выиграл. Количество оставшихся попыток: " + (4 - i - 1));
                        user_won = true;
                        break;
                    } else {
                        System.out.println("Неправильно, попробуй ещё раз. Количество оставшихся порпыток: " + (4 - i - 1));
                        if (answer > correct_number) {
                            System.out.println("Загаданное число меньше");
                        } else {
                            System.out.println("Загаданное число больше");
                        }
                    }
                }
                if (!user_won) {
                    System.out.println("К сожалению, ты проиграл. Загаданное число: " + correct_number);
                }
                System.out.println("Хочешь сыграть ещё раз?\n1.Да\n2.Нет");
                int play_again = scanner.nextInt();
                if (!(play_again == 1)) {
                    return;
                }
                } else if (level == 3) {
                System.out.println("Ты выбрал сложный уровень от 50 до 150");
                    int correct_number = random.nextInt(50, 151);
                    boolean user_won = false;
                    for (int i = 0; i < 4; i++) {
                        int answer = scanner.nextInt();
                        if (answer == correct_number) {
                            System.out.println("Правильно! Ты выиграл. Количество оставшихся попыток: " + (4 - i - 1));
                            user_won = true;
                            break;
                        } else {
                            System.out.println("Неправильно, попробуй ещё раз. Количество оставшихся порпыток: " + (4 - i - 1));
                            if (answer > correct_number) {
                                System.out.println("Загаданное число меньше");
                            } else {
                                System.out.println("Загаданное число больше");
                            }
                        }
                    }
                    if (!user_won) {
                        System.out.println("К сожалению, ты проиграл. Загаданное число: " + correct_number);
                    }
                    System.out.println("Хочешь сыграть ещё раз?\n1.Да\n2.Нет");
                    int play_again = scanner.nextInt();
                    if (!(play_again == 1)) {
                        return;
                    } else {
                        System.out.println("Выбрано некорректное число уровня");
                    }
                }
    }
}