package Домашка8;

import java.util.Collection;

public interface PlayerService {
    Player getPlayerById(int id);
    Collection<Player> getPlayers();
    int createPlayer(String nickname);
    Player deletePlayer(int id);
    int addPoints(int playerId, int points);
}
