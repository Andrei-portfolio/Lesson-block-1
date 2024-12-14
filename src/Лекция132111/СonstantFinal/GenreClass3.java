package Лекция132111.СonstantFinal;

import java.util.Objects;

public class GenreClass3 {

    public static final GenreClass3 SCI_FI = new GenreClass3("SCI_FI", 2);
    public static final GenreClass3 СOMEDY = new GenreClass3("Сomedy", 1);

    /*Мы здесь сделали следующее, что вместо строки String нас интересует GenreClass3, и его я хочу создавать.
    Далее справа создали объект жанра GenreClass3. И можем потом к нему обратиться. А для этого перейдем в класс
    Kinopoisk.*/

    public static final GenreClass3 ACTION = new GenreClass3("Action", 3);
    public static final GenreClass3 HORROR = new GenreClass3("Horror", 4);

    private String name;

    private int id;

    private GenreClass3(String name, int id) {// Чтобы разраб не смог написать собственный жанр, например "Каля-баля".
                                            //изменим наш конструктор, с public на private.
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreClass3 that = (GenreClass3) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "GenreClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
