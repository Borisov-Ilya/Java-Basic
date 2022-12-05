package Cycles.Task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу, где пользователь вводит данные с клавиатуры в матрицу, а после этого произведите вывод первой
 * строки матрицы на экран, где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество строк:");
        int lines = Integer.parseInt(reader.readLine());
        System.out.println("Введите количество столбцов:");
        int columns = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[lines][columns];

        System.out.println("Заполните матрицу");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(i + 1 + " строка:");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(reader.readLine());
            }
        }

        System.out.println("Первая строка, умноженная на 3:");
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[0][j] *= 3;
            System.out.print(matrix[0][j] + " ");
        }
    }
}