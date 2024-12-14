package Лекция132111.СonstantFinal;

/*Патерны проектирования. Дженерики. Перечисляемые типы

 */

public class Movie {

    private String name;

    private String genre;

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }
}
