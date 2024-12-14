package Домашка6.Task5HashMap;

//5. Турнир игроков
//● В задании 1 вы создали класс Player
//● Создайте хранилище игроков. Его будет использовать программа, которая описывает турнир.
// Требования:
//      ○ Количество игроков неизвестно заранее. Может быть 2, а может 100
//      ○ В турнир каждый игрок может записаться только 1 раз (не может быть дублей)
//● создайте 10 игроков и поместите их в хранилище.
//● убедитесь, что если один игрок помещен в хранилище дважды, дубликат не запишется


import Домашка6.Task5HashMap.Player;

public class Tournament {

    public static void main(String[] args) {

        PlayerStorage storage = new PlayerStorage();

        // Создание и добавление 10 игроков
        for (int i = 1; i <= 10; i++) {
            Player player = new Player("Player" + i, i);
            storage.addPlayer(player);
        }

        // Попытка добавить дубликат игрока
        Player duplicatePlayer = new Player("Player1", 1);
        storage.addPlayer(duplicatePlayer);

        // Вывод всех игроков в хранилище
        System.out.println("Список игроков в турнире:");
        storage.displayPlayers();
    }
}