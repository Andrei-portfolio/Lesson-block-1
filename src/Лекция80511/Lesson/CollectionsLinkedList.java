package Лекция80511.Lesson;

import Лекция73110.Продолжение.Human;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsLinkedList {

    public static void main(String[] args) {

        List<String> fruits = new LinkedList<>();

        fruits.add("Яблоко");
        fruits.add("Аппельсин");
        fruits.add("Ананас");
        fruits.add("Бананы");
        fruits.add(0, "Мандарин");
        fruits.add(3, "Киви");

        //Создадим ещё один список фруктов и назовём его fruits2 и добавим туда apple

        List<String> fruits2 = new LinkedList<>(); // Создали новый список фруктов
        fruits2.add("Apple"); // Добавили в список яблоко
        fruits2.addAll(fruits); // Так же в наш список через addAll добавляем старый список с яблоками fruits.
        // Это удобный вариант, чтобы добавить целый список

        System.out.println(fruits2);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //Теперь посмотрим удаление и использование элементов (подсчет, обращение к элементу). Для начала сделаем
        // удаление с помощью REMOVE

        List<String> fruits3 = new ArrayList<>();
        fruits3.add("НеЯблоко");
        fruits3.add("НеАппельсин");
        fruits3.add("НеАнанас");
        fruits3.add("НеБананы");
        fruits3.remove(0); // Удаляем нулевой элемент, это будет наше "НеЯблоко"
        fruits3.remove("НеАппельсин"); // Пример удаления элемента не по индексу, а по названию
        System.out.println(fruits3.size()); //Данный метод size помогает нам подсчитать количество элементов списка
        System.out.println("Выведи нам самый первый элемент: " + fruits3.get(0)); //  Ну а обратиться,например к
        // нулевому элементу можем с помощью метода get

        for (String fruit : fruits3) {
            System.out.println(fruit);
        }

        // Рассмотрим ещё один LinkedList на примере класса Human, созданного в 5 лекции. НАПОДОБИЕ ЕСТЬ ЗАДАНИЕ
        // в домашнем задании про список объектов


        List<Human> humans = new LinkedList<>(); // Создали список, указали тип Human

        humans.add(new Human("John", 30)); // Добавили объект этого класса new Human с помощью add
        humans.add(new Human("Jack", 32));
        humans.add(new Human("Sam", 34));

        System.out.println(humans.get(0).getName()); //Говорим "Обратись к нулевому элементу списка и получи его имя"

        for (Human human : humans) {// Обратимся через цикл и выведем в терминал информацию по именам и возрасту
            System.out.println(human.getName() + " " + human.getAge());
        }
    }
}
