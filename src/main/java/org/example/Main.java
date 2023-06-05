package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void SorterInteger (Scanner scanner, String nameOfFile) throws FileNotFoundException {

        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String variable = scanner.next();
            try {
                list.add(Integer.parseInt(variable));
            } catch (NumberFormatException e){
                System.out.printf("%s is not a valid parameter. It will be skipped.%n", variable);
            }
        }
        scanner.close();

        if (!nameOfFile.equals("")) {
            File file = new File(nameOfFile);
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.printf("%nTotal numbers: %d.", list.size());
            }
        } else {
            System.out.printf("%nTotal numbers: %d.", list.size());
        }
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
        if (!nameOfFile.equals("")) {
            File file = new File(nameOfFile);
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.println("Sorted data: ");
            }
        } else {
            System.out.println("Sorted data: ");
        }
        for (int element : array
        ) {
            if (!nameOfFile.equals("")) {
                File file = new File(nameOfFile);
                try (PrintWriter printWriter = new PrintWriter(file)) {
                    printWriter.print(element + " ");
                }
            } else {
                System.out.print(element + " ");
            }

        }
    }
    public static void SorterWord (Scanner scanner, String nameOfFile) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        scanner.close();

        if (!nameOfFile.equals("")) {
            File file = new File(nameOfFile);
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.printf("%nTotal words: %d.", list.size());
            }
        } else {
            System.out.printf("%nTotal words: %d.", list.size());
        }
        String[] array = new String[list.size()];
        for (int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);

        }
        Arrays.sort(array);
        if (!nameOfFile.equals("")) {
            File file = new File(nameOfFile);
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.println("Sorted data: ");
            }
        } else {
            System.out.println("Sorted data: ");
        }
        for (String element : array
        ) {
            if (!nameOfFile.equals("")) {
                File file = new File(nameOfFile);
                try (PrintWriter printWriter = new PrintWriter(file)) {
                    printWriter.print(element + " ");
                }
            } else {
                System.out.print(element + " ");
            }
        }

    }
    public static void SorterLine (Scanner scanner, String nameOfFile) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        scanner.close();

        if (!nameOfFile.equals("")) {
            File file = new File(nameOfFile);
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.printf("%nTotal lines: %d.", list.size());
            }
        } else {
            System.out.printf("%nTotal lines: %d.", list.size());
        }
        String[] array = new String[list.size()];
        for (int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);

        }
        Arrays.sort(array);
        if (!nameOfFile.equals("")) {
            File file = new File(nameOfFile);
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.println("Sorted data: ");
            }
        } else {
            System.out.println("Sorted data: ");
        }
        for (String element : array
        ) {
            if (!nameOfFile.equals("")) {
                File file = new File(nameOfFile);
                try (PrintWriter printWriter = new PrintWriter(file)) {
                    printWriter.println(element);
                }
            } else {
                System.out.println(element);
            }
        }
    }
    public static void SorterIntegerByCount (Scanner scanner, String nameOfFile) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String variable = scanner.next();
            try {
                list.add(Integer.parseInt(variable));
            } catch (NumberFormatException e){
                System.out.printf("%s is not a valid parameter. It will be skipped.%n", variable);
            }
        }
        scanner.close();

        if (!nameOfFile.equals("")) {
            File file = new File(nameOfFile);
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.printf("%nTotal numbers: %d.", list.size());
            }
        } else {
            System.out.printf("%nTotal numbers: %d.", list.size());
        }
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
                    String form = String.format("%n%d: %d time(s), %d", entry.getKey(), entry.getValue(),
                            per);
                    if (!nameOfFile.equals("")) {
                        File file = new File(nameOfFile);
                        try (PrintWriter printWriter = new PrintWriter(file)) {
                            printWriter.printf(form);
                        }
                    } else {
                        System.out.printf(form);
                    }
                }
                if (counter == map.size()) {
                    counter = 0;
                    j ++;
                    i++;
                }
            }
        }

    }
    public static void SorterWordByCount (Scanner scanner, String nameOfFile) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        scanner.close();

        if (!nameOfFile.equals("")) {
            File file = new File(nameOfFile);
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.printf("%nTotal words: %d.", list.size());
            }
        } else {
            System.out.printf("%nTotal words: %d.", list.size());
        }
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
                    String form = String.format("%n%s: %d time(s), %d", entry.getKey(), entry.getValue(),
                            per);
                    if (!nameOfFile.equals("")) {
                        File file = new File(nameOfFile);
                        try (PrintWriter printWriter = new PrintWriter(file)) {
                            printWriter.printf(form);
                        }
                    } else {
                        System.out.printf(form);
                    }                }
                if (counter == map.size()) {
                    counter = 0;
                    j ++;
                    i++;
                }
            }
        }

    }
    public static void SorterLineByCount (Scanner scanner, String nameOfFile) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        if (!nameOfFile.equals("")) {
            File file = new File(nameOfFile);        scanner.close();

            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.printf("%nTotal lines: %d.", list.size());
            }
        } else {
            System.out.printf("%nTotal lines: %d.", list.size());
        }
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
                    String form = String.format("%n%s: %d time(s), %d", entry.getKey(), entry.getValue(),
                            per);
                    if (!nameOfFile.equals("")) {
                        File file = new File(nameOfFile);
                        try (PrintWriter printWriter = new PrintWriter(file)) {
                            printWriter.printf(form);
                        }
                    } else {
                        System.out.printf(form);
                    }
                }
                if (counter == map.size()) {
                    counter = 0;
                    j ++;
                    i++;
                }
            }
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String nameOfFile ="";
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-inputFile")) {
                nameOfFile = args[i + 1];
            }
        }
        if (!nameOfFile.equals("")) {
            File file = new File(nameOfFile);
            scanner = new Scanner(file);
        }
        String nameOfFileToSaveIn = "";
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-outputFile")) {
                nameOfFileToSaveIn= args[i + 1];
            }
        }
        if (args.length > 1) {
            if (args[0].equals("-sortingType")) {
                if (args[1].equals("natural")) {
                    switch (args[3]) {
                        case "line" -> SorterLine(scanner, nameOfFileToSaveIn);
                        case "long" -> SorterInteger(scanner, nameOfFileToSaveIn);
                        default -> SorterWord(scanner, nameOfFileToSaveIn);

                    }

                } else if (args[1].equals("byCount")) {
                    switch (args[3]) {
                        case "line" -> SorterLineByCount(scanner, nameOfFileToSaveIn);
                        case "long" -> SorterIntegerByCount(scanner, nameOfFileToSaveIn);
                        default -> SorterWordByCount(scanner, nameOfFileToSaveIn);
                    }
                }
            } else if (args[0].equals("-dataType")) {
                if (args.length > 3) {
                    if (args[3].equals("natural")) {
                        switch (args[1]) {
                            case "line" -> SorterLine(scanner, nameOfFileToSaveIn);
                            case "long" -> SorterInteger(scanner, nameOfFileToSaveIn);
                            default -> SorterWord(scanner, nameOfFileToSaveIn);
                        }
                    } else if (args[3].equals("byCount")) {
                        switch (args[1]) {
                            case "line" -> SorterLineByCount(scanner, nameOfFileToSaveIn);
                            case "long" -> SorterIntegerByCount(scanner, nameOfFileToSaveIn);
                            default -> SorterWordByCount(scanner, nameOfFileToSaveIn);
                        }
                    }
                } else {
                    switch (args[1]) {
                        case "line" -> SorterLine(scanner, nameOfFileToSaveIn);
                        case "long" -> SorterInteger(scanner, nameOfFileToSaveIn);
                        default -> SorterWord(scanner, nameOfFileToSaveIn);
                    }
                }
            }
        } else {
            if (args[0].equals("-sortingType")) {
                System.out.println("No sorting type defined!");
            } else if (args[0].equals("-dataType")) {
                System.out.println("No data type defined");
            }
        }
    }
}