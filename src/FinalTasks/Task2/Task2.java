package FinalTasks.Task2;

/**
 * Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
 * Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
 * Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
 * Нужно найти неизвестное.
 * Пример для теста работы программы:
 * - Ввод: x+5=7
 * - Вывод: 2
 * - Ввод: 3-x=9
 * - Вывод: -6
 * - Ввод: 3-3=x
 * - Вывод: 0
 */

public class Task2 {
    public static void main(String[] args) {
        program("x+5=7");
        program("3-x=9");
        program("3-3=x");
    }

    private static void program(String str) {
        System.out.println("Ввод: " + str);
        String[] splitStr = str.split("");

        if (splitStr[0].equals("x")) {
            if (splitStr[1].equals("+")) {
                System.out.println("Вывод: " + (Integer.parseInt(splitStr[4]) - Integer.parseInt(splitStr[2])));
            } else if (splitStr[1].equals("-")) {
                System.out.println("Вывод: " + (Integer.parseInt(splitStr[4]) + Integer.parseInt(splitStr[2])));
            }
        } else if (splitStr[2].equals("x")) {
            if (splitStr[1].equals("+")) {
                System.out.println("Вывод: " + (Integer.parseInt(splitStr[4]) - Integer.parseInt(splitStr[0])));
            } else if (splitStr[1].equals("-")) {
                System.out.println("Вывод: " + (-Integer.parseInt(splitStr[4]) + Integer.parseInt(splitStr[0])));
            }
        } else if (splitStr[4].equals("x")) {
            if (splitStr[1].equals("+")) {
                System.out.println("Вывод: " + (Integer.parseInt(splitStr[0]) + Integer.parseInt(splitStr[2])));
            } else if (splitStr[1].equals("-")) {
                System.out.println("Вывод: " + (Integer.parseInt(splitStr[0]) - Integer.parseInt(splitStr[2])));
            }
        }
    }
}