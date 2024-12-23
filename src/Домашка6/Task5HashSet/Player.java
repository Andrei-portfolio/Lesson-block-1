package Домашка6.Task5HashSet;

import java.util.Objects;

public class Player { // Игрок

    private String name;

    public Player(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                ", Виртуальное имя='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}


