package Домашка6.Task3;

        //3. Список объектов
        //● создайте класс Movie (можно использовать тот, что создавали ранее)
        //● в классе создайте поля:
        //      ○ название
        //      ○ рейтинг (от 0 до 10)
        //      ○ жанр
        //      ○ страна
        //      ○ есть ли оскар (да/нет)
        //● создайте в другом классе метод psvm.
        //● в этом методе объявите список films
        //● положите в список 3 любимых фильма
        //● выведите на экран информацию о фильме по индексу 1

import java.util.ArrayList;
import java.util.List;

public class Задание3 {

    public static void main(String[] args) {

        List<Movie> films = new ArrayList<>();
        films.add(new Movie ("Москва слезам не верит ","1979", 9.0, "Комедия", "Россия", true));
        films.add(new Movie ("1+1","2011", 10.0, "Драма.Комедия", "Франция", true));
        films.add(new Movie ("Холоп","2019", 9.8, "Комедия", "Россия", false));

        System.out.println(films.get(1));
    }
}


