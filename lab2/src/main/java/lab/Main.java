package lab;

import org.apache.log4j.BasicConfigurator;

public class Main {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Tasks.task1withFile();
        Tasks.task2withFile();
        Tasks.task3withFile();
        Tasks.task4withFile();
        Tasks.task5withFile();
        Tasks.task6withFile();
        Tasks.task7withFile();
        Tasks.task8withFile();
        Tasks.task1withScanner();
        Tasks.task2withScanner();
        Tasks.task3withScanner();
        Tasks.task4withScanner();
        Tasks.task5withScanner();
        Tasks.task6withScanner();
        Tasks.task7withScanner();
        Tasks.task8withScanner();
    }
}
