package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Барсик";
        Cat.count++;

        Cat vasya = new Cat();
        vasya.age = 5;
        vasya.name = "Вася";
        Cat.count++;

        System.out.println("Мы создали кота по имени " + barsik.name + " , его здоровье " + barsik.age + " года!");
        System.out.println("Мы создали кота по имени " + vasya.name + " , ему " + vasya.age + " лет!");
        System.out.println("Всего котов: " + Cat.count);

    }
}