package Data.Task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу:
 * 1. Ввести первое число с клавиатуры и записать его в строковую переменную.
 * 2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
 * 3. Сравнить 2 числа и вывести большее на экран
 * 4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */

public class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число:");
        String number1Str = reader.readLine();
        System.out.println("Введите второе число:");
        int number2 = Integer.parseInt(reader.readLine());

        int max = Math.max(Integer.parseInt(number1Str), number2);
        System.out.println("Большее число - " + max);
        double min = Math.min(Integer.parseInt(number1Str), number2);
        System.out.println("Меньшее число - " + min);
    }
}
