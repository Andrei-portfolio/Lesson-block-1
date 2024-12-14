package Домашка6.Task1;

import java.util.Objects;

public class Player { // Игрок

    private int id;
    private String nickname;
    private boolean isOnline;

    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }

    public Player(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public int getId() {    //Геттеры
        return id;
    }
    public String getNickname() {

        return nickname;
    }
    public boolean isOnline() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Уникальный номер=" + id +
                ", Виртуальное имя='" + nickname + '\'' +
                ", Доступность хоста=" + isOnline +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return
                id == player.id &&
                        isOnline == player.isOnline &&
                        Objects.equals(nickname, player.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, isOnline);
    }
}


