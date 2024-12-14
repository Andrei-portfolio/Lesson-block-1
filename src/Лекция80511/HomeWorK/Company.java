package Лекция80511.HomeWorK;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;

    private int foundationYear;

    private List<String> films; // Тип переменной всегда храним в угловых скобках. Мы говорим, у нас будет список,
    //но мы не говорим какой имено интерфейс, класс: ArrayList или LinkedList. java ждет, чтобы мы это сказали.
    // А об этом нужно сказать в конструкторе ниже this.films = new ArrayList<>();

    // Далее делаем конструктор, но оставляем там всего 2 поля из трёх. Убираем List<String> films
    public Company(String name, int foundationYear) {

        this.name = name;
        this.foundationYear = foundationYear;
        this.films = new ArrayList<>(); // Третье поле мы не прокидываем, просто создаём его. Почему? Потому что
        //допустим, компании только образовались. У них есть год, название. Но пока не известно, есть ли фильмы,
        // а соответственно неизвестно какие. Поэтому мы создали, чтобы туда пока ничего не класть. Изначально
        // создали пустой массив, пустой список фильмов чтобы туда сохранить. А уже потом в другом классе туда
        // добавим.
    }

    public String getName() { // Создаём геттеры
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public List<String> getFilms() {
        return films;
    }


    public void setName(String name) { // Создаём сеттеры
        this.name = name;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                ", films=" + films +
                '}';
    }
}
