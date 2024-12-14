package Лекция121911.ArraysDemo;

/*
В предыдущем уроке мы потихоньку шли к такому, как сортировать коллекции. Рассмотрем данную тему. А можем
сортировать, а точнее обязаны это делать с помощью функциональных интерфейсов
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args) {

        Item iphone = new Item("Iphone", 1000, 100);
        Item samsung = new Item("Samsung", 800, 85);
        Item redmi = new Item("Redmi", 900, 70);

        List<Item> items = new ArrayList<>();
        items.add(iphone);
        items.add(samsung);
        items.add(redmi);

        System.out.println(items);
        /* Перед тем как проводить сортировку, запустим в терминал наш список.
        В терминале видно, что наши объекты расположенны именно в таком порядке, в котором мы их записали
        выше. Ну а теперь мы хотим их отсортировать по цене, рейтингу, по алфавиту и т.д. Поэтому мы и
        напишем свой собственный алгоритм
        */
        //items.sort(new Comparator<Item>() {// закомитил, так как ниже написали тоже самое с помощью лямбды
                                            // поднес курсор на (new Comparator<Item>() и он сам передложил
        //@Override
        //public int compare(Item o1, Item o2) {// Видно что на вход 2 аргумента, а возвращает число
        //return 0;

            /* Сложно понять, что же мы должны передать в скобках. А передать нужно один из функциональных
            интерфейсов - Сomparator, который принимает по 2 аргумента и поочередно сравнивает какое число
            вернулось. Логика такая, если число положительное, значит первое число больше второго,
            если отрицательное, значит второй больше первого. Если числа равны 0, значит они равны
            */

        //items.sort((o1, o2) -> o1.price() - o2.price() );

        /*Видно что на вход 2 аргумента, а возвращает число. Здесь мы говорим, возьми первый предмет, возьми
        его цену и вычти из второго предмета его цену. Т.е. получается мы взяли цену price и отсортировали
        по возрастанию. Наша задача, вот после стрелочки "o1.price() - o2.price()" расписать свой алгоритм,
        при котором у нас будет получаться всегда положительное либо всегда отрицательное число, либо ноль.
        И от этого будет зависеть, какое число больше другого. Т.е. что должно пойти вперед, а что назад*/

        //items.sort(Comparator.comparingInt(Item::price));// Idea предложила изменить код. Написаный выше
        /* После того, как нажали на Replace with....., получили в терминале тоже самое. В скобках
        обязательно указываем, по какому параметру идём. Два двоеточия ::, это обращение к полю Item*/

        System.out.println(items);

        /* items.sort((o1, o2) ->{
        System.out.println(o1.price() + " " + o2.price());
        return o1.price() - o2.price();// должно возвращаться число
        });
        С помощью данного кода мы в терминале можем посмотреть, кто с кем сравнивался на каждом этапе
        800 1000
        900 800
        900 1000
        900 800
        */

        // Был вопрос по сортировке HasMap. Т.к. это коллекция, мы сортировать её не можем. В нем даже
        // нет такого метода сортировки sort. Самый простой вариант, получить из него ключи или значения
        // и с ними работать.
    }
}
