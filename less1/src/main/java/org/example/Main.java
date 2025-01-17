package org.example;

public class Main {

    public static void main(String[] args) {

        //принимаем количество минут на вход, через параметр
        //System.out.println("n: " + args[0]);
        int n = Integer.parseInt(args[0]);

        //вычислим количество полных часов
        int hours = n / 60;
        //System.out.println("hours: " + hours);

        //вычислим количество минут, после вычета полных часов
        int mins = n - hours * 60;

        //если количество минут больше суток, вычислим количество полных суток
        int days = hours / 24;
        //System.out.println("days: " + days);

        //вычислим количество часов только в рамках последних суток
        hours = hours - 24 * days;
        //System.out.println("hours2: " + hours);

        //выведем результат
        String h = "";
        String m = "";

        if (hours < 10) {
            h = "0" + hours;
        } else {
            h = "" + hours;
        }

        if (mins < 10) {
            m = "0" + mins;
        } else {
            m = "" + mins;
        }
        System.out.println(h + ":" + m);

    }
}

