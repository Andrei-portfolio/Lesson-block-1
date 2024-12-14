package Лекция111411.FuncInterfaces;

/*
И последнее на сегодня, рассмотрим предикты. Это практически тоже самое, что и function, но
function принимает на вход какой то аргумент и возвращает нам измененый аргумент дважды. А
предикты тоже принимает на вход какой то аргумент один, а возвращает tru или false.
И ЕГО НА САМОМ ДЕЛЕ МЫ И БУДЕМ ЧАЩЕ ВСЕГО ИСПОЛЬЗОВАТЬ В АВТОТЕСТИРОВАНИИ
 */

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        List<String> carsColors = List.of("Красный", "Синий", "Зеленый", "Лиловый");

        Predicate<String> predicate = s -> {// Пишем 2 типа String, принимаемое и возвращаемое
           return s.equals("Красный");// Возвращает результат какого то сравнения. В нашем случае,
            // если "Красный", то tru. А так как в списке у нас ещё 3 других цвета, то в
            // терминале выдаст tru - за счёт одного совпадения и 3 false.
        };

        chooseBestCar(carsColors, predicate);
    }

    private static void chooseBestCar (List<String> carsColors, Predicate<String> predicate) {
        System.out.println("Список цветов автомобилей: ");

        for (String carsColor : carsColors) {
            System.out.println(predicate.test(carsColor));

        }
        System.out.println("Конец списка");
    }
}
