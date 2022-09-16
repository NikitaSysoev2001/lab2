package lab;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {

    private static final Logger LOGGER = Logger.getLogger(Tasks.class);

    public static List<Double> readFromFile(String fileName){
        var inputList = new ArrayList<Double>();
        try (FileReader fileReader = new FileReader("./src/main/resources/" + fileName);
              BufferedReader bufferedReader = new BufferedReader(fileReader)){
            while (bufferedReader.ready()) {
                inputList.add(Double.parseDouble(bufferedReader.readLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.error("Could not read data from file!");
        }
        return inputList;
    }

    public static void task1withFile() {
        var inputList = readFromFile("task1.txt");
        double x = inputList.get(0);
        double y = inputList.get(1);
        double answer = (Math.pow(Math.E, x) - (Math.pow(y, 2) + 12 * x * y - 3 * Math.pow(x, 2)) / (18 * y - 1));
        LOGGER.info("answer from 1st task is: " + answer);
    }

    public static void task2withFile() {
        var inputList = readFromFile("task2.txt");
        double a = inputList.get(0);
        double b = inputList.get(1);
        int g = (int)(double)inputList.get(2);
        double S = 0.5 * a * b * Math.sin(g);
        LOGGER.info("the area of the triangle = " + S);
    }

    public static void task3withFile() {
        var inputList = readFromFile("task3.txt");
        double A = inputList.get(0);
        double B = inputList.get(1);
        double C = inputList.get(2);
        int n = (int)(double)inputList.get(3);
        double p;
        if(n <= A){
            p = B;
        }
        else {
            p = B + C * (n - A);
        }
            LOGGER.info("phone charges = " + p);
    }

    public static void task4withFile() {
        var inputList = readFromFile("task4.txt");
        int a = (int)(double)inputList.get(0);
        int b = a % 10;
        int c = b * b;
        int d = c % 10;
        LOGGER.info("the last digit of the square =" + d);
    }

    public static void task5withFile() {
        var inputList = readFromFile("task5.txt");
        int a = (int)(double)inputList.get(0);
        int b = a % 10;
        switch(b) {
            case 0 -> {
                LOGGER.info("The last digit of the cube = 0");
            }
            case 1 -> {
                LOGGER.info("The last digit of the cube = 1");
            }
            case 2 -> {
                LOGGER.info("The last digit of the cube = 8");
            }
            case 3 -> {
                LOGGER.info("The last digit of the cube = 7");
            }
            case 4 -> {
                LOGGER.info("The last digit of the cube = 4");
            }
            case 5 -> {
                LOGGER.info("The last digit of the cube = 5");
            }
            case 6 -> {
                LOGGER.info("The last digit of the cube = 6");
            }
            case 7 -> {
                LOGGER.info("The last digit of the cube = 3");
            }
            case 8 -> {
                LOGGER.info("The last digit of the cube = 2");
            }
            case 9 -> {
                LOGGER.info("The last digit of the cube = 9");
            }
            default -> LOGGER.error("No matches");
        }
    }

    public static void task6withFile() {
        var inputList = readFromFile("task6.txt");
        int n = (int)(double)inputList.get(0);
        for (int i = 2; i <= n; i++) {
            int a = i;
            LOGGER.info(a + " ");
        }
    }

    public static void task7withFile() {
        var inputList = readFromFile("task7.txt");
        int n = (int)(double)inputList.get(0);
        int x = (int)(double)inputList.get(1);
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S = S + (Math.pow(-1, i - 1) * (Math.sin(i * x)) / i);
        }
            LOGGER.info("amount = " + S);
    }

    public static void task8withFile() {
        var inputList = readFromFile("task8.txt");
        int n = (int)(double)inputList.get(0);
        for (int i = 1; i <= 10; i++){
            int a = i * i;
            LOGGER.info(a + " ");
        }
    }

    public static void task1withScanner() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double answer = (Math.pow(Math.E, x) - (Math.pow(y, 2) + 12 * x * y - 3 * Math.pow(x, 2)) / (18 * y - 1));
        LOGGER.info("answer from 1st task is: " + answer);
    }

    public static void task2withScanner() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int g = scanner.nextInt();
        double S = 0.5 * a * b * Math.sin(g);
        LOGGER.info("the area of the triangle = " + S);
    }

    public static void task3withScanner() {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        int n = scanner.nextInt();
        double p;
        if(n <= A){
            p = B;
        }
        else {
            p = B + C * (n - A);
        }
        LOGGER.info("phone charges = " + p);
    }

    public static void task4withScanner() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a % 10;
        int c = b * b;
        int d = c % 10;
        LOGGER.info("the last digit of the square =" + d);
    }

    public static void task5withScanner() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a % 10;
        switch(b) {
            case 0 -> {
                LOGGER.info("Последняя цифра куба = 0");
            }
            case 1 -> {
                LOGGER.info("Последняя цифра куба = 1");
            }
            case 2 -> {
                LOGGER.info("Последняя цифра куба = 8");
            }
            case 3 -> {
                LOGGER.info("Последняя цифра куба = 7");
            }
            case 4 -> {
                LOGGER.info("Последняя цифра куба = 4");
            }
            case 5 -> {
                LOGGER.info("Последняя цифра куба = 5");
            }
            case 6 -> {
                LOGGER.info("Последняя цифра куба = 6");
            }
            case 7 -> {
                LOGGER.info("Последняя цифра куба = 3");
            }
            case 8 -> {
                LOGGER.info("Последняя цифра куба = 2");
            }
            case 9 -> {
                LOGGER.info("Последняя цифра куба = 9");
            }
            default -> LOGGER.error("No matches");
        }
    }

    public static void task6withScanner() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            int a = i;
            LOGGER.info(a + " ");
        }
    }

    public static void task7withScanner() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S = S + (Math.pow(-1, i - 1) * (Math.sin(i * x)) / i);
        }
            LOGGER.info("amount = " + S);
    }

    public static void task8withScanner() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int a = i * i;
            LOGGER.info(a + " ");
        }
    }
}
