package Cycles.Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу:
 * 1. Пользователь вводит размер массива и данные с клавиатуры в массив
 * 2. Сравнить элементы массива с заранее заданными константами x, y, z.
 * 3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
 */

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int X = 1;
        final int Y = 2;
        final int Z = 3;

        System.out.println("Введите размер массива:");
        int sizeArray = Integer.parseInt(reader.readLine());
        int[] array = new int[sizeArray];
        System.out.println("Заполните массив числами:");

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int number : array) {
            if (number == X || number == Y || number == Z) {
                System.out.println("Данное значение имеется в константах");
                return;
            }
        }
    }
}
