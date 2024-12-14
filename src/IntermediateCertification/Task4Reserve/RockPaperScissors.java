package IntermediateCertification.Task4Reserve;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0; // Очки пользователя
        int computerScore = 0;// Очки компьютера
        //int rounds = 5;// Общее количество раундов

        System.out.println("Добро пожаловать в игру");

        // Игровой цикл на 5 раундов
        for (int round = 1; round <= 5; round++) {
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
                userScore +=1;
                System.out.println("Вы выиграли раунд и получили "  + " очков!");
            } else {
                computerScore +=1;
                System.out.println("Компьютер выиграл раунд и получил " + " очков!");
            }
//                userScore = userScore + computeUserScore(userChoice);
//            System.out.println("Вы выиграли раунд и получили " + " очков!");
//            } else {
//                computerScore = computerScore + computeUserScore(computerChoice);
//                System.out.println("Компьютер выиграл раунд и получил " + " очков!");
}

                System.out.println("\nИгра окончена!");
                System.out.println("Ваши очки: " + userScore);
                System.out.println("Очки компьютера: " + computerScore);
                if (userScore > computerScore) {
                    System.out.println("Поздравляем! Вы победили!");
                } else if (userScore < computerScore) {
                    System.out.println("Компьютер победил. Попробуйте снова!");
                } else {
                    System.out.println("Ничья!");
                }
                scanner.close();
            }
        }

