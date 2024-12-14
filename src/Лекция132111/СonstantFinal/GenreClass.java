package Лекция132111.СonstantFinal;

import java.util.Objects;

public class GenreClass {

    // public static String SCI_FI = "SCI_FI";
    // public static String СOMEDY = "Сomedy";
    /*
    Что нам даёт static? Если мы НЕ пишем static, то чтобы обратиться к полю "SCI_FI", нам в классе "Kinopoisk"
    нужно  создать экземпляр класс "GenreClass genreClass = new GenreClass();". Только после этого можем написать
    код "System.out.println(GenreClass.SCI_FI);". Иначе выдаёт ошибку. Так вот, очень долго получается из за
    ради одного поля SCI_FI, ради одной константы. Поэтому проще всего написать  public static String SCI_FI = "SCI_FI";
    И в этом случае данное поле принадлежит самому классу, не объекту, не экземпляру. Т.е. мы можем напрямую
    обратиться к полю, не создавая экземпляр класса

    Чтобы никто не смог изменить наш жанр, мы в данном методе допишем final. ПОДРОБНЕЕ см. во
    */

    public static final String SCI_FI = "SCI_FI";
    public static final String СOMEDY = "Сomedy";

    /*ВАЖНО!!! КОГДА МЫ ДЕЛАЕМ СТАТИЧНОЕ ФИНАЛЬНОЕ ПОЛЕ, ТО ЕГО НАЗЫВАЕМ НЕ В CamelCas, а БОЛЬШИМИ БУКВАМИ
    С НИЖНИМ ПОДЧЕРКИВАНИЕМ МЕЖДУ СЛОВАМИ. ЭТО ОЧЕНЬ СЕРЬЁЗНАЯ РЕКОМНДАЦИЯ СРЕДИ РАЗРАБОТИЧИКОВ

    Со временем жанров у нас может стать ещё больше*/

    public static final String ACTION = "Action";
    public static final String HORROR = "Horror";

    /*
    Но чем больше у нас жанров, тем больше надо будет их id. Но как же мы будем хранить данные id. HasMap
    не подойдет, так как помимо id жанра, может быть и id например рейтинга и т.д. Поэтому временно комитим
    наши публичные статичные финальные жанры в данном классе. Ниже делаем, два поля name и id. А если у нас
    более одного поля, то делаем конструктор, гетеры, иквелс, хэшкод, ту стринг. После их создания переходим
    в класс Kinopoisk.
    */

    private String name;

    private int id;

    public GenreClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreClass that = (GenreClass) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }


    @Override
    public String toString() {
        return "GenreClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
