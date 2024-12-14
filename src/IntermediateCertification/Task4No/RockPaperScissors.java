package IntermediateCertification.Task4No;

import java.util.Scanner;

public class RockPaperScissors {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] options = {"Камень", "Ножницы", "Бумага"};
            int computerChoice = (int) (Math.random() * 3);
            System.out.println("Выберите: 0 - Камень, 1 - Ножницы, 2 - Бумага");
            int userChoice = scanner.nextInt();
            System.out.println("Вы выбрали: " + options[userChoice]);
            System.out.println("Компьютер выбрал: " + options[computerChoice]);
            if (userChoice == computerChoice) {
                System.out.println("Ничья!");
            } else if (userChoice == 0 && computerChoice == 1 || userChoice == 1 && computerChoice == 2 || userChoice == 2 && computerChoice == 0) {
                System.out.println("Вы победили!");
            } else {
                System.out.println("Вы проиграли!");
            }
        }
    }





