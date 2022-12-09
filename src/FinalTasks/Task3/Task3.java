package FinalTasks.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
 * Среди данных строк найти строку с максимальным количеством различных символов.Если таких строк будет много, то вывести первую.
 * Пример для теста работы программы:
 * Количество строк: 3
 * Строка 1: привет
 * Строка 2: анализ
 * Строка 3: 111111111111
 * Ответ: привет
 */

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<String> stringLinkedList = new LinkedList<>();
        LinkedList<Integer> amount = new LinkedList<>();
        int n;
        int i = 0;
        int x = 0;
        int maxIndex = 0;

        System.out.print("Количество строк: ");
        while (true) {
            try {
                n = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели что-то другое. Попробуйте еще раз ввести число: ");
            }
        }

        while (i < n) {
            System.out.printf("Строка %d: ", (i + 1));
            String str = reader.readLine();
            if (!str.isEmpty()) {
                stringLinkedList.add(str);
                i++;
            } else {
                System.out.println("Вы ввели пустую строку. Попробуйте еще раз.");
            }
        }

        for (String s : stringLinkedList) {
            amount.add((int) s.chars().distinct().count());
        }

        for (i = 0; i < amount.size(); i++) {
            if (amount.get(i) > x) {
                x = amount.get(i);
                maxIndex = i;
            }
        }
        System.out.println("Ответ: " + stringLinkedList.get(maxIndex));
    }
}