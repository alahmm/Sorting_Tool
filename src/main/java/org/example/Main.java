package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        System.out.printf("%nTotal numbers: %d", list.size());
        int max = 0;
        for (int number : list
             ) {
            if (number > max) {
                max = number;
            }
        }
        int counter = 0;
        for (int number : list
             ) {
            if (number == max) {
                counter ++;
            }
        }
        System.out.printf("%nThe greatest number: %d (%d time(s)).", max, counter);
    }
}