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

public class Task3and5 {

    public static void main(String[] args) {

        // РЕШЕНИЕ ЗАДАЧИ №3
        System.out.println("РЕШЕНИЕ ЗАДАЧИ №3");


        Movie[] films = new Movie[3];
        films[0] = new Movie("Москва слезам не верит", "1979", 9, "Комедия", "Россия", true);
        films[1] = new Movie("1+1", "2011", 10, "Драма, Комедия", "Франция", true);
        films[2] = new Movie("Холоп", "2019", 10, "Комедия", "Россия", false);


        System.out.println("Фильм: " + films[0].name + "; Год:" + films[0].year + "; Рейтинг: " + films[0].rating +
                "; Жанр: " + films[0].genre + "; Страна:" + films[0].country + "; Есть ли Оскар:" + films[0].oscar);

        System.out.println("Фильм: " + films[1].name + "; Год:" + films[1].year + "; Рейтинг: " + films[1].rating +
                "; Жанр: " + films[1].genre + "; Страна:" + films[1].country + "; Есть ли Оскар:" + films[1].oscar);

        System.out.println("Фильм: " + films[2].name + "; Год:" + films[2].year + "; Рейтинг: " + films[2].rating +
                "; Жанр: " + films[2].genre + "; Страна:" + films[2].country + "; Есть ли Оскар:" + films[2].oscar);


        // РЕШЕНИЕ ЗАДАЧИ №5 (1 способ)
        System.out.println("РЕШЕНИЕ ЗАДАЧИ №5 - 1 способ");

        for (int i = 0; i < films.length; i++) {
            System.out.println("Фильм: " + films[i].name + "; Год:" + films[i].year + "; Рейтинг: " + films[i].rating +
                    "; Жанр: " + films[i].genre + "; Страна:" + films[i].country + "; Есть ли Оскар:" + films[i].oscar);
        }
        // РЕШЕНИЕ ЗАДАЧИ №5 (2 способ)
        System.out.println("РЕШЕНИЕ ЗАДАЧИ №5 - 2 способ");

        for (Movie film : films) {
            System.out.println(film);
        }
    }
}








