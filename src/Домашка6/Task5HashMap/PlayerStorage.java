package Домашка6.Task5HashMap;


import Домашка6.Task5HashMap.Player;

import java.util.HashMap;
import java.util.Map;

public class PlayerStorage {

    private Map<Integer, Player> players;

    public PlayerStorage() {
        players = new HashMap<>();
    }

    public boolean addPlayer(Player player) {
        if (players.containsKey(player.getId())) {
            System.out.println("Дубликат игрока: " + player.getNickname());
            return false; // Игрок не добавлен, так как дубликат
        }
        players.put(player.getId(), player);
        return true; // Игрок успешно добавлен
    }

    public void displayPlayers() {
        for (Player player : players.values()) {
            System.out.println(player);
        }
    }
}
