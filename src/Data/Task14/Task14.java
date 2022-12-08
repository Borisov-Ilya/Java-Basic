package Data.Task14;

/**
 * Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
 * 1. Выведите максимальный и минимальный элемент массива.
 * 2. Из максимального и минимального значения выведите наибольшее по модулю.
 */

public class Task14 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 41) - 20);
        }

        for (int number : arr) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.print("Наибольшее по модулю число: ");
        if (Math.abs(max) == Math.abs(min)) {
            System.out.println(max);
        } else if (Math.abs(max) > Math.abs(min)) {
            System.out.println(max);
        } else {
            System.out.println(min);
        }
    }
}