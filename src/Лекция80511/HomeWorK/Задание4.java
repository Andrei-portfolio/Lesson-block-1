package Лекция80511.HomeWorK;

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


        // Как сказано в задании, ниже создадим список компаний и положим туда список. Делаем это точно также,
        // как и создавали список людей на предыдущей лекции

        List<Company> companies = new ArrayList<>(); // Создали и объявили список companies. Положим в туда 3 комп
        companies.add(new Company("Warner Bros", 1918));
        companies.add(new Company("20th Century Fox", 1935));
        companies.add(new Company("Columbia Pictures", 1919));

        System.out.println(companies);

        // В терминале получили страшный ответ: [Лекция80511.HomeWorK.Company@65ab7765, ...........]. Поэтому
        // делаем toString. В ответ получаем [Company{name='Warner Bros', foundationYear=1918, films=[]}, .........
        // Круто. Далее каждой кинокомпании запишем в портфолио по 3 фильма. Т.е. нам необходимо обратиться к
        // списку films. Так как он private обратимся через гетр (get). Получается теперь мы работаем

        // Что мы делаем далее? Пишем код  companies.get(0).getFilms().add("Гарри Поттер"); Обозначает он
        // следующее: Нам нужно взять из списка компаний первую компанию Warner Bros, т.е. get(0). Далее, чтобы
        // работать со списком, мы его должны получить методом getFilms(). Ну а далее получается мы работаем со
        // списком Films компании Warner Bros, где с помощью метода add можно добавить фильмы

        companies.get(0).getFilms().add("Гарри Поттер");
        companies.get(0).getFilms().add("День независимости");
        companies.get(0).getFilms().add("Планета обезьян");

        companies.get(1).getFilms().add("Титаник");
        companies.get(1).getFilms().add("Зеленая миля");
        companies.get(1).getFilms().add("Сияние");

        companies.get(2).getFilms().add("Побег из Шоушенка");
        companies.get(2).getFilms().add("Джуманджи");
        companies.get(2).getFilms().add("Остров проклятых");

//        System.out.println(companies.get(0).getFilms()); // Проверим, добавились ли фильмы. Аналогично для
                                                          // следующей
//        System.out.println(companies.get(1).getFilms());
//        System.out.println(companies.get(2).getFilms());

        // Далее с помощью цикла напечатаем информацию о всех компаниях в формате {название компании}:
        // {названия всех фильмов}. Для этого используем цикл.

        for (Company company : companies){
            System.out.println(company.getName() + " " + company.getFilms());
        }

        //Так как код по добавлению фильмов кинокомпаниям оказался идентичным и большим, попробуем сократить
        // его с помощью списков

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

        for (Company company : companies){
            System.out.println(company.getName() + " " + company.getFilms());
        }

        // В терминале выдал кинокомпании и их фильмы написаны два раза. Чтобы были по одному, это надо
        // закомитить верхний код, который показался нам длинным и мы его заменили на более короткий.
        // Warner Bros [Гарри Поттер, День независимости, Планета обезьян, Гарри Поттер, День независимости.....]

    }
}
