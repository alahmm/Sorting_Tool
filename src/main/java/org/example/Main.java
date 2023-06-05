package org.example;

import java.util.*;

public class Main {

    public static void SorterInteger (Scanner scanner) {
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
        public static void SorterWord (Scanner scanner) {
            List<String> list = new ArrayList<>();
            while (scanner.hasNext()) {
                list.add(scanner.next());
            }
            System.out.printf("%nTotal words: %d.", list.size());
            String[] array = new String[list.size()];
            for (int k = 0; k < list.size(); k++) {
                array[k] = list.get(k);

            }
            Arrays.sort(array);

        System.out.println("Sorted data: ");
        for (String element : array
             ) {
            System.out.print(element + " ");
        }

    }
        public static void SorterLine (Scanner scanner) {
            List<String> list = new ArrayList<>();
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            System.out.printf("%nTotal lines: %d.", list.size());
            String[] array = new String[list.size()];
            for (int k = 0; k < list.size(); k++) {
                array[k] = list.get(k);

            }
            Arrays.sort(array);
            System.out.println("Sorted data: ");
            for (String element : array
            ) {
                System.out.println(element);
            }
        }
    public static void SorterIntegerByCount (Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        System.out.printf("%nTotal numbers: %d.%n", list.size());
        int[] array = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);

        }
        Arrays.sort(array);

        Map<Integer, Integer> map = new TreeMap<>();
        int count;
        for (int j : array) {
            if (map.get(j) == null) {
                map.put(j, 1);
            } else {
                count = map.get(j);
                count++;
                map.put(j, count);
            }
        }
        int i = 0;
        int j = 1;
        int counter = 0;
        while (i < map.size()) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                counter ++;
                if (entry.getValue() == j) {
                    double percentage = entry.getValue() * 100.0 / list.size();
                    percentage = Math.round(percentage);
                    int per = (int) percentage;
                    String form = String.format("%d: %d time(s), %d%%", entry.getKey(), entry.getValue(),
                            per);
                    System.out.println(form);
                }
                if (counter == map.size()) {
                    counter = 0;
                    j ++;
                    i++;
                }
            }
        }

    }
    public static void SorterWordByCount (Scanner scanner) {
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        System.out.printf("%nTotal numbers: %d.%n", list.size());
        String[] array = new String[list.size()];
        for (int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);

        }
        Arrays.sort(array);

        Map<String, Integer> map = new TreeMap<>();
        int count;
        for (String j : array) {
            if (map.get(j) == null) {
                map.put(j, 1);
            } else {
                count = map.get(j);
                count++;
                map.put(j, count);
            }
        }
        int i = 0;
        int j = 1;
        int counter = 0;
        while (i < map.size()) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                counter ++;
                if (entry.getValue() == j) {
                    double percentage = entry.getValue() * 100.0 / list.size();
                    percentage = Math.round(percentage);
                    int per = (int) percentage;
                    String form = String.format("%s: %d time(s), %d%%", entry.getKey(), entry.getValue(),
                            per);
                    System.out.println(form);
                }
                if (counter == map.size()) {
                    counter = 0;
                    j ++;
                    i++;
                }
            }
        }

    }
    public static void SorterLineByCount (Scanner scanner) {
        List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        System.out.printf("%nTotal numbers: %d.%n", list.size());
        String[] array = new String[list.size()];
        for (int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);

        }
        Arrays.sort(array);

        Map<String, Integer> map = new TreeMap<>();
        int count;
        for (String j : array) {
            if (map.get(j) == null) {
                map.put(j, 1);
            } else {
                count = map.get(j);
                count++;
                map.put(j, count);
            }
        }
        int i = 0;
        int j = 1;
        int counter = 0;
        while (i < map.size()) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                counter ++;
                if (entry.getValue() == j) {
                    double percentage = entry.getValue() * 100.0 / list.size();
                    percentage = Math.round(percentage);
                    int per = (int) percentage;
                    String form = String.format("%s: %d time(s), %d%%", entry.getKey(), entry.getValue(),
                            per);
                    System.out.println(form);
                }
                if (counter == map.size()) {
                    counter = 0;
                    j ++;
                    i++;
                }
            }
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
/*        Sorter(scanner);

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
        }*/
       if (args[0].equals("-sortingType")) {
            if (args[1].equals("natural")) {
                switch (args[3]) {
                    case "line" -> SorterLine(scanner);
                    case "long" -> SorterInteger(scanner);
                    default -> SorterWord(scanner);

                }

            } else if (args[1].equals("byCount")) {
                switch (args[3]) {
                    case "line" -> SorterLineByCount(scanner);
                    case "long" -> SorterIntegerByCount(scanner);
                    default -> SorterWordByCount(scanner);

                }
            }
        } else if (args[0].equals("-dataType")) {
            if (args.length > 2) {
                if (args[3].equals("natural")) {
                    switch (args[1]) {
                        case "line" -> SorterLine(scanner);
                        case "long" -> SorterInteger(scanner);
                        default -> SorterWord(scanner);

                    }

                } else if (args[3].equals("byCount")) {
                    switch (args[1]) {
                        case "line" -> SorterLineByCount(scanner);
                        case "long" -> SorterIntegerByCount(scanner);
                        default -> SorterWordByCount(scanner);

                    }
                }
            } else {
                switch (args[1]) {
                    case "line" -> SorterLine(scanner);
                    case "long" -> SorterInteger(scanner);
                    default -> SorterWord(scanner);

                }
            }
        }

    }
}