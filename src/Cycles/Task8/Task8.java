package Cycles.Task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число n.
 * А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */

public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите целое положительное число:");
        int n = Integer.parseInt(reader.readLine());
        int total = 0;

        if (n <= 0) {
            System.out.println("Попробуйте еще раз");
        }

        for (int i = 1; i <= n; i++) {
            if(!(i % 2 == 0)) {
                total += i;
            }
        }
        System.out.println("Сумма нечетных чисел: " + total);
    }
}
