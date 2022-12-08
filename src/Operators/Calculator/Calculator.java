package Operators.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите простой калькулятор:
 * 1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
 * 2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */
public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x = 0;
        double y = 0;
        int step = 0;
        String symbol = "";

        System.out.println("Введите число x:");
        while (step < 3) {
            String tmp = reader.readLine();
            if (step == 0) {
                if (isNumber(tmp)) {
                    x = Double.parseDouble(tmp);
                    step++;
                    System.out.println("Введите число y:");
                } else {
                    System.out.println("Вы ввели что-то другое. Попробуйте еще раз ввести число: ");
                }
            } else if (step == 1) {
                if (isNumber(tmp)) {
                    y = Double.parseDouble(tmp);
                    step++;
                    System.out.println("Введите один из символов '+', '-', '*' или '/'");
                } else {
                    System.out.println("Вы ввели что-то другое. Попробуйте еще раз ввести число: ");
                }
            } else {
                if (tmp.matches("^[+]|-|[*]|/$")) {
                    symbol = tmp;
                    step++;
                } else {
                    System.out.println("Вы ввели что-то другое. Попробуйте еще раз ввести символ: ");
                }
            }
        }

        switch (symbol) {
            case "+":
                System.out.println("Результат: " + (x + y));
                break;
            case "-":
                System.out.println("Результат: " + (x - y));
                break;
            case "*":
                System.out.println("Результат: " + (x * y));
                break;
            case "/":
                System.out.println("Результат: " + (x / y));
                break;
        }
    }
    private static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
