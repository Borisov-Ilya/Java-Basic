package Operators.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число x:");
        double x = Double.parseDouble(reader.readLine());
        System.out.println("Введите число y:");
        double y = Double.parseDouble(reader.readLine());
        System.out.println("Введите один из символов '+', '-', '*' или '/'");
        String symbol = reader.readLine();

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
}
