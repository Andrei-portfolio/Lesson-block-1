package Домашка8;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

    public class PlayerServiceJSON implements PlayerService {
        private List<Player> players = new ArrayList<>();
        private int nextId = 1; // Для генерации уникальных ID
        private final String filePath = "src/Домашка8/players.json/players.json";

        public PlayerServiceJSON() {
            loadPlayers();
        }

        @Override
        public Player getPlayerById(int id) {
            return players.stream().filter(player -> player.getId() == id).findFirst().orElse(null);
        }

        @Override
        public Collection<Player> getPlayers() {
            return players;
        }

        @Override
        public int createPlayer(String nickname) {
            Player newPlayer = new Player(nextId++, nickname, 0, true);
            players.add(newPlayer);
            savePlayers();
            return newPlayer.getId();
        }

        @Override
        public Player deletePlayer(int id) {
            Player playerToRemove = getPlayerById(id);
            if (playerToRemove != null) {
                players.remove(playerToRemove);
                savePlayers();
            }
            return playerToRemove;
        }

        @Override
        public int addPoints(int playerId, int points) {
            Player player = getPlayerById(playerId);
            if (player != null) {
                player.setPoints(player.getPoints() + points);
                savePlayers();
                return player.getPoints();
            }
            return -1; // Если игрок не найден
        }

        private void loadPlayers() {
            try {
                if (Files.exists(Paths.get(filePath))) {
                    BufferedReader reader = new BufferedReader(new FileReader(filePath));
                    players = new Gson().fromJson(reader, new TypeToken<List<Player>>() {}.getType());
                    reader.close();
                    if (!players.isEmpty()) {
                        nextId = players.stream().mapToInt(Player::getId).max().orElse(0) + 1; // Обновляем следующий ID
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void savePlayers() {
            try (Writer writer = new FileWriter(filePath)) {
                new Gson().toJson(players, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



