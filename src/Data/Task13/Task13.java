package Data.Task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
 * Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
 * 1. Выведите слова, состоящие только из латиницы.
 * 2. Выведите количество этих слов.
 */

public class Task13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        while (true) {
            System.out.println("Введите строку из слов, разделенных пробелами:");
            String str = reader.readLine();
            String[] splitStr = str.split(" ");

            if (!str.isEmpty()) {
                System.out.println("Слова на латинице: ");
                for (String word : splitStr) {
                    if (word.matches("^[A-Za-z]+$")) {
                        count++;
                        System.out.println(word);
                    }
                }
                System.out.println("Количество слов: " + count);
                break;
            } else {
                System.out.println("Вы ввели пустую строку. Попробуйте еще раз.");
            }
        }
    }
}