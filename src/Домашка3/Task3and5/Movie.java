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


package Домашка3.Task3and5;

public class Movie {

    String name;// название
    String year;// год
    double rating;// рейтинг
    String genre; // жанр
    String country; // страна
    boolean oscar; // есть ли оскар

    public Movie(String name, String year, double rating, String genre, String country, boolean oscar) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.oscar = oscar;


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




