package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    int start = scanner.nextInt();

    int end = scanner.nextInt();
    public List<Integer> Main(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(i);
        }
        return result;
    }


}