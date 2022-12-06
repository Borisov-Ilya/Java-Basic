package Data.Task12;

/**
 * Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
 * 1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
 * 2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
 * 3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
 * 4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
 * 5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
 */

public class Task12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        programToString(str);
    }
    private static void programToString(String str) {
        if (str.startsWith("I like") && str.contains("Java") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
        }
        System.out.println(str.replaceAll("a", "o").substring(7, 11));
    }
}
