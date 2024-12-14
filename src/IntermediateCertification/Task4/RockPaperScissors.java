package IntermediateCertification.Task4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;// Очки пользователя
        int computerScore = 0;// Очки компьютера
        int rounds = 5;// Общее количество раундов

        System.out.println("Добро пожаловать в игру Камень - Ножницы - Бумага");

        // Игровой цикл на 5 раундов
        for (int round = 1; round <= rounds; round++) {
            System.out.println("\nРаунд " + round + ":");
            System.out.print("Введите ваш выбор (К - Камень, Н - Ножницы, Б - Бумага): ");
            String userChoice = scanner.next().toUpperCase();// Считываем выбор пользователя

            //Генерация случайного выбора компьютера
            String[] choices = {"К", "Н", "Б"};
            String computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("Компьютер выбрал: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("Ничья!");
            } else if ((userChoice.equals("К") && computerChoice.equals("Н")) ||
                    (userChoice.equals("Н") && computerChoice.equals("Б")) ||
                    (userChoice.equals("Б") && computerChoice.equals("К"))) {

                userScore = userScore + Score.computeUserScore(userChoice);
                System.out.println("Вы выиграли раунд. Всего очков : " + userScore + " !!!");
            } else {
                computerScore = computerScore + Score.computeUserScore(computerChoice);
                System.out.println("Компьютер выиграл раунд. Всего очков у компьютера: " + computerScore + " !!!");
            }
        }

        System.out.println("\nИгра окончена!");
        System.out.println("Ваши очки: " + userScore);
        System.out.println("Очки компьютера: " + computerScore);
        if (userScore > computerScore) {
            System.out.println("Поздравляем, прекрасная игра!!! Вы победили!");
        } else if (userScore < computerScore) {
            System.out.println("Не отчаивайтесь, КОМПЬЮТЕР победил. Попробуйте снова!");
        } else {
            System.out.println("Ничья!");
        }
        scanner.close();
    }
}