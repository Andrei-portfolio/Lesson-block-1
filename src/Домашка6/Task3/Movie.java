//3. Задача про массив объектов
//        ● создайте класс Movie
//        ● в классе создайте поля:
//              ○ название
//              ○ рейтинг (от 0 до 10)
//              ○ жанр
//              ○ страна
//              ○ есть ли оскар (да/нет)
//        ● создайте в другом классе метод psvm.
//        ● в этом методе объявите массив films
//        ● положите в массив 3 любимых фильма


package Домашка6.Task3;

public class Movie {

    private String name;// название
    private String year;// год
    private double rating;// рейтинг
    private String genre; // жанр
    private String country; // страна
    private boolean oscar; // есть ли оскар

    public Movie(String name, String year, double rating, String genre, String country, boolean oscar) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.oscar = oscar;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public boolean isOscar() {
        return oscar;
    }

    @Override
    public String toString() {
        return "Фильм: " + name + ", " +
                "Год: " + year + ", " +
                "Рейтинг: " + rating + ", " +
                "Жанр: " + genre + ", " +
                "Страна: " + country + ", " +
                "Есть ли оскар: " + oscar;
    }
}




