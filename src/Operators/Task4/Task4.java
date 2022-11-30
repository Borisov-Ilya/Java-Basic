package Operators.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число x:");
        double x = Double.parseDouble(reader.readLine());
        System.out.println("Введите число y:");
        double y = Double.parseDouble(reader.readLine());
        System.out.println("Введите число z:");
        double z = Double.parseDouble(reader.readLine());

        double average = (x + y + z) / 3;
        System.out.printf("Среднее арифметическое чисел = %.2f\n", average);

        double roundAverage = Math.floor(average / 2);
        System.out.println("Разделенное среднее арифметическое на 2 и округленное в меньшую сторону = " + roundAverage);

        if (roundAverage > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
