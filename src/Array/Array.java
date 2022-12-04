package Array;

/**
 * Выполните следующие действия с массивом:
 * 1. Задайте массив из 5 любых целых чисел
 * 2. Поменяйте местами первый и последний элемент в массиве
 * 3. Вывести в консоль результат суммы первого и среднего элемента
 * Примечание: Для получения последнего и среднего элементов в массиве используйте свойство length.
 */
public class Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int temp = nums[0];

        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        int sum = nums[0] + nums[nums.length / 2];
        System.out.println(sum);
    }
}
