package Operators.Converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу конвертер физических величин:
 * 1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
 * > Выберите что переводить: 1 - масса, 2 - расстояние
 * > 2
 * 2. Пользователю предлагается выбрать единицу измерения. Пример:
 * > Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
 * > 1
 * 3. Пользователю предлагается ввести количество выбранных единиц:
 * > Введите число
 * > 10
 * > Результат:
 * > Метры: 10
 * > Мили: 0.006
 * > Ярды: 10.94
 * > Футы: 32.81
 */
public class Converter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Выберите что переводить:\n1-масса\n2-расстояние");
        int physicalQuantities = Integer.parseInt(reader.readLine());

        if (physicalQuantities == 1) {
            System.out.println("Выберите единицу измерения:\n1-кг\n2-грамм\n3-фунт\n4-карат");
        } else {
            System.out.println("Выберите единицу измерения:\n1-метр\n2-миля\n3-ярд\n4-фут");
        }
        int unit = Integer.parseInt(reader.readLine());

        System.out.println("Введите число: ");
        double number = Double.parseDouble(reader.readLine());

        if (physicalQuantities == 1) {
            double kilogram = 0;
            double gram = 0;
            double lb = 0;
            double carat = 0;

            switch (unit) {
                case 1:
                    kilogram = number;
                    gram = number * 1000;
                    lb = number * 2.2046223302272;
                    carat = number * 5000;
                    break;
                case 2:
                    kilogram = number / 1000;
                    gram = number;
                    lb = number / 453.592;
                    carat = number * 5;
                    break;
                case 3:
                    kilogram = number / 2.205;
                    gram = number * 453.592;
                    lb = number;
                    carat = number * 2267.962;
                    break;
                case 4:
                    kilogram = number / 5000;
                    gram = number / 5;
                    lb = number / 2267.962;
                    carat = number;
                    break;
            }
            System.out.printf("Результат:\nКилограммы: %.2f\nГраммы: %.2f\nФунты: %.2f\nКараты: %.2f", kilogram, gram, lb, carat);
        } else {
            double meter = 0;
            double mile = 0;
            double yard = 0;
            double foot = 0;

            switch (unit) {
                case 1:
                    meter = number;
                    mile = number / 1609.34;
                    yard = number * 1.094;
                    foot = number * 3.281;
                    break;
                case 2:
                    meter = number * 1609.34;
                    mile = number;
                    yard = number * 1760;
                    foot = number * 5280;
                    break;
                case 3:
                    meter = number / 1.094;
                    mile = number / 1760;
                    yard = number;
                    foot = number * 3;
                    break;
                case 4:
                    meter = number / 3.281;
                    mile = number / 5280;
                    yard = number / 3;
                    foot = number;
                    break;
            }
            System.out.printf("Результат:\nМетры: %.2f\nМили: %.3f\nЯрды: %.2f\nФуты: %.2f", meter, mile, yard, foot);
        }
    }
}
