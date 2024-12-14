package Лекция132111.СonstantFinal;

/*Патерны проектирования. Дженерики. Перечисляемые типы

 */

public class Movie2 {

    private String name;

    private GenreClass genre;//String genre заменим на GenreClass genre. Заменили строку на свой жанр класс

    public Movie2(String name, GenreClass genre) {//String genre заменим на GenreClass genre. Заменили строку на свой жанр класс
        this.name = name;
        this.genre = genre;
    }

    public GenreClass getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }
}
