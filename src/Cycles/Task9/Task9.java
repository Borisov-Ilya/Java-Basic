package Cycles.Task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Напишите программу:
 * 1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
 * 2. Посчитайте среднее арифметическое элементов массива.
 * 3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размер массива:");
        int sizeArray = Integer.parseInt(reader.readLine());
        double[] array = new double[sizeArray];
        System.out.println("Заполните массив числами:");
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(reader.readLine());
            total += array[i];
        }

        double average = total / sizeArray;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * average;
        }
        System.out.println(Arrays.toString(array));
    }
}