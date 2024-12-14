package Домашка6.Task5HashSet;

//5. Турнир игроков
//● В задании 1 вы создали класс Player
//● Создайте хранилище игроков. Его будет использовать программа, которая описывает турнир.
// Требования:
//      ○ Количество игроков неизвестно заранее. Может быть 2, а может 100
//      ○ В турнир каждый игрок может записаться только 1 раз (не может быть дублей)
//● создайте 10 игроков и поместите их в хранилище.
//● убедитесь, что если один игрок помещен в хранилище дважды, дубликат не запишется

public class Tournament {

    public static void main(String[] args) {

        PlayerStorage playerStorage = new PlayerStorage();

        // Создаем 10 игроков
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Player player3 = new Player("Charlie");
        Player player4 = new Player("David");
        Player player5 = new Player("Eve");
        Player player6 = new Player("Frank");
        Player player7 = new Player("Grace");
        Player player8 = new Player("Heidi");
        Player player9 = new Player("Ivan");
        Player player10 = new Player("Judy");

        // Добавляем игроков в хранилище
        System.out.println("Добавление игроков:");
        System.out.println(playerStorage.addPlayer(player1)); // true
        System.out.println(playerStorage.addPlayer(player2)); // true
        System.out.println(playerStorage.addPlayer(player3)); // true
        System.out.println(playerStorage.addPlayer(player4)); // true
        System.out.println(playerStorage.addPlayer(player5)); // true
        System.out.println(playerStorage.addPlayer(player6)); // true
        System.out.println(playerStorage.addPlayer(player7)); // true
        System.out.println(playerStorage.addPlayer(player8)); // true
        System.out.println(playerStorage.addPlayer(player9)); // true
        System.out.println(playerStorage.addPlayer(player10)); // true

        // Попытка добавить дубликаты
        System.out.println("\nПопытка добавить дубликаты:");
        System.out.println(playerStorage.addPlayer(player1)); // false (дубликат)
        System.out.println(playerStorage.addPlayer(new Player("Alice"))); // false (дубликат)

        // Выводим всех игроков в хранилище
        System.out.println("\nСписок игроков в турнире:");
        playerStorage.displayPlayers();

        // Выводим количество игроков
        System.out.println("\nКоличество уникальных игроков: " + playerStorage.getPlayerCount());
    }
}