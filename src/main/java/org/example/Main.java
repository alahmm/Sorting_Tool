package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void Sorter (Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        System.out.printf("%nTotal numbers: %d.", list.size());
        int i = 1;
        int j;
        int x;
        int[] array = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);

        }
        //Arrays.sort(array);
        while (i < list.size()) {
            x = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > x) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = x;
            i = i + 1;
        }


        System.out.println("Sorted data: ");
        for (int element : array
             ) {
            System.out.print(element + " ");
        }

    }

    public static void integerWriter (Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        System.out.printf("%nTotal numbers: %d.", list.size());
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
            System.out.printf("%nThe greatest number: %d (%d time(s), %d%%).", max, counter, counter*100/ list.size());
    }
    public static void lineWriter (Scanner scanner) {
        List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        System.out.printf("%nTotal lines: %d.", list.size());
        String max = "";
        for (String line : list
        ) {
            if (line.length() > max.length()) {
                max = line;
            }
        }
        int counter = 0;
        for (String line : list
        ) {
            if (line.length() == max.length()) {
                counter++;
            }
        }
        System.out.printf("%nThe greatest line:%n%s%n(%d time(s), %d%%).", max, counter, counter * 100 / list.size());
    }
    public static void wordWriter (Scanner scanner) {
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        System.out.printf("%nTotal words: %d.", list.size());
        String max  = "";
        for (String word : list
        ) {
            if (word.length() > max.length()) {
                max = word;
            }
        }
        int counter = 0;
        for (String line : list
        ) {
            if (line.length() == max.length()) {
                counter ++;
            }
        }
            System.out.printf("%nThe greatest word: %s (%d time(s), %d%%).", max, counter, counter*100/ list.size());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorter(scanner);

        if (args[0].equals("-dataType")) {
            if (args.length > 2) {
                Sorter(scanner);
            } else {
                switch (args[1]) {
                    case "line" -> lineWriter(scanner);
                    case "long" -> integerWriter(scanner);
                    default -> wordWriter(scanner);
                }
            }
        } else if (args[0].equals("-sortIntegers")) {
            Sorter(scanner);
        }

    }
}