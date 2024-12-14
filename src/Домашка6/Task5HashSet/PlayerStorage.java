package Домашка6.Task5HashSet;

import java.util.HashSet;
import java.util.Set;

public class PlayerStorage {

    private Set<Player> players;

    // Конструктор
    public PlayerStorage() {
        players = new HashSet<>(); // Инициализируем хранилище игроков
    }

    // Метод для добавления игрока
    public boolean addPlayer(Player player) {
        return players.add(player); // Возвращает true, если игрок был добавлен, и false, если дубликат
    }

    // Метод для получения количества игроков
    public int getPlayerCount() {
        return players.size();
    }

    // Метод для вывода всех игроков
    public void displayPlayers() {
        for (Player player : players) {
            System.out.println(player.getname());
        }
    }
}
