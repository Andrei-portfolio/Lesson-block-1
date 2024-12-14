package Домашка6.Task1;
    //1. data-класс
    //● Опишите класс Player (игрок)
    //● У игрока есть поля:
    //        ○ id (int)
    //        ○ nickname (String)
    //        ○ isOnline (boolean)
    //● Все поля должны быть приватными
    //● Переопределите для класса методы equals(), hashCode() и toString()
    //● В отдельном классе создайте двух игроков с одинаковыми значениями полей.
    //● Убедитесь, что player1 == player2 ==> false
    //● Убедитесь, что player1.equals(player2) ==> true


import java.util.ArrayList;
import java.util.List;

public class Задание1 {


    public static void main(String[] args) {


                   // Cоздание двух игроков с помощью ArrayList (МЕТОД1)

                List<Player> players = new ArrayList<>();

                players.add(new Player(6, "Борис", true));
                players.add(new Player(6, "Борис", true));

                System.out.println(players.get(0)); // Результат метода toString
                System.out.println(players.get(1)); // Результат метода toString

                System.out.println(players.get(0).hashCode() == players.get(1).hashCode());// Вернёт число, которое
                // высчитает исходя из того, какие значения лежат в полях. Т.е.
                // если поля заполнены одинаковыми значениями, значит ответ true
                System.out.println(players.get(0) == players.get(1));// Сравнивает ссылки ответ false
                System.out.println(players.get(0).equals(players.get(1))); // Сравнивает поля ответ true

                // Cоздание двух игроков (МЕТОД2)

                Player player1 = new Player(7, "Фёдор", false);
                Player player2 = new Player(7, "Фёдор", false);

                System.out.println(player1.hashCode() == player2.hashCode());
                System.out.println(player1 == player2);
                System.out.println(player1.equals(player2));
            }
        }










