package FinalTasks.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
 * Ответ: “Заархивированный вирус”.
 * 1. У пользователя есть 3 попытки, чтобы отгадать загадку.
 * 2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
 * 3. Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
 * 4. Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
 * 5. Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
 * Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
 * 6. Если пользователь, использовавший подсказку, ошибется,
 * вывести “Обидно, приходи в другой раз” и завершить работу.
 */

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String correctAnswer = "Заархивированный вирус";
        int attempt = 0;
        boolean prompt = true;

        while (attempt < 3) {
            System.out.print((attempt + 1) +  " попытка\nОтвет: ");
            String currentAnswer = reader.readLine();

            if (currentAnswer.equals("Подсказка")) {
                if (prompt) {
                    System.out.println("Какая-то подсказка");
                    attempt = 1;
                    prompt = false;
                } else {
                    System.out.println("Подсказка уже недоступна");
                }
            } else if (currentAnswer.equals(correctAnswer)) {
                System.out.println("Правильно!");
                break;
            } else if (attempt < 2) {
                if (!prompt) {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                } else {
                    System.out.println("Подумай еще");
                    attempt++;
                }
            } else {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}