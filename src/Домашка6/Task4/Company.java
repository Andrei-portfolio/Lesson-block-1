package Домашка6.Task4;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;

    private int foundationYear;

    private List<String> films;

    // Далее делаем конструктор, но оставляем там всего 2 поля из трёх. Убираем List<String> films

    public Company(String name, int foundationYear) {

        this.name = name;
        this.foundationYear = foundationYear;
        this.films = new ArrayList<>();
    }

    public String getName() { // Создаём геттеры
        return name;
    }

    public int getFoundationYear() {// Создаём геттеры
        return foundationYear;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setName(String name) { // Создаём сеттеры
        this.name = name;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                ", films=" + films +
                '}';
    }
}
