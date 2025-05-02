package org.example;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        try {
            startGame();
        } catch (InputMismatchException exc) {
            System.out.println("Некорректный ввод уровня сложности");
        }
    }

    private static void startGame() {
    }
}