package Лекция132111.GenreEnums;

/*Патерны проектирования. Дженерики. Перечисляемые типы

 */

public class Movie {

    private String name;

    private GenreEnum genre;//String genre заменим на GenreClass genre. Заменили строку на свой жанр класс

    public Movie(String name, GenreEnum genre) {//String genre заменим на GenreClass genre. Заменили строку на свой жанр класс
        this.name = name;
        this.genre = genre;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }
}
