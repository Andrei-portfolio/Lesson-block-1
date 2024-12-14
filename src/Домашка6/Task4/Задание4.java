package Домашка6.Task4;

//4. Вложенный список
//● создайте класс Company (кинокомпания)
//● в классе создайте поля:
//      ○ название
//      ○ год основания
//      ○ список фильмов, которые компания выпустила (по 3 штуки)
//● создайте в другом классе метод psvm.
//● в этом методе объявите список companies
//● положите в список 3 кинокомпании
//● каждой кинокомпании запишите в портфолио по 3 фильма
//● напечатайте информацию о всех компаниях в формате {название компании}: {названия всех фильмов}

import java.util.ArrayList;
import java.util.List;

public class Задание4 {

    public static void main(String[] args) {

        // ВАРИНТ №1
        List<Company> companies = new ArrayList<>(); // Создали и объявили список companies. Положим туда 3 компании
        companies.add(new Company("Warner Bros", 1918));
        companies.add(new Company("20th Century Fox", 1935));
        companies.add(new Company("Columbia Pictures", 1919));

        companies.get(0).getFilms().add("Гарри Поттер");
        companies.get(0).getFilms().add("День независимости");
        companies.get(0).getFilms().add("Планета обезьян");

        companies.get(1).getFilms().add("Титаник");
        companies.get(1).getFilms().add("Зеленая миля");
        companies.get(1).getFilms().add("Сияние");

        companies.get(2).getFilms().add("Побег из Шоушенка");
        companies.get(2).getFilms().add("Джуманджи");
        companies.get(2).getFilms().add("Остров проклятых");

        // Далее с помощью цикла напечатаем информацию о всех компаниях в формате {название компании}:
        // {названия всех фильмов}. Для этого используем цикл.

        for (Company company : companies) {
            System.out.println(company.getName() + " " + company.getFilms());
        }

        //ВАРИАНТ №2 с более коротким кодом

        List<String> warnerFilm = companies.get(0).getFilms();
        warnerFilm.add("Гарри Поттер");
        warnerFilm.add("День независимости");
        warnerFilm.add("Планета обезьян");

        List<String> foxFilm = companies.get(1).getFilms();
        foxFilm.add("Титаник");
        foxFilm.add("Зеленая миля");
        foxFilm.add("Сияние");

        List<String> columbiaFilm = companies.get(2).getFilms();
        columbiaFilm.add("Побег из Шоушенк");
        columbiaFilm.add("Джуманджи");
        columbiaFilm.add("Остров проклятых");

        for (Company company : companies) {
            System.out.println(company.getName() + " " + company.getFilms());
        }
    }
}
