package Лекция132111.СonstantFinal;

/*Патерны проектирования. Дженерики. Перечисляемые типы

 */

public class Movie3 {

    private String name;

    private GenreClass3 genre;//String genre заменим на GenreClass genre. Заменили строку на свой жанр класс

    public Movie3(String name, GenreClass3 genre) {//String genre заменим на GenreClass genre. Заменили строку на свой жанр класс
        this.name = name;
        this.genre = genre;
    }

    public GenreClass3 getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }
}
