package Лекция111411.FuncInterfaces;

/*ДАЛЕЕ НА ПРИМЕРЕ РАССМОТРИМ ЕЩЁ ОДИН ФУНКЦ. ИНТЕРФЕЙС FunctionDemo. Это классный интерфейс.
Он принимает на вход значение и возвращает какое то значение. Как пример хотим подать на вход число 2,
а на выход получить 2 в квадрате
 */

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionDemo {

    public static void main(String[] args) {

        List<String> names = List.of("Галина", "Александр", "Михаил", "Евгения");

        Function<String, String> function = s -> {// Пишем 2 типа String, принимаемое и возвращаемое
            System.out.println("Это функц. интерфейс");
            return s.toLowerCase();
        };

        printName(names, function);
    }

    private static void printName(List<String> names, Function<String, String> function) {
        System.out.println("Список имён: ");

        for (String name : names) {
            String lowerName = function.apply(name);
            System.out.println(lowerName);
        }
        System.out.println("Конец списка");
    }
}
/*
И последнее на сегодня, рассмотрим предикты. Это практически тоже самое, что и function, но
function принимает на вход какой то аргумент и возвращает нам измененый аргумент дважды. А
предикты тоже принимает на вход какой то аргумент один, а возвращает tru или false.
И ЕГО НА САМОМ ДЕЛЕ МЫ И БУДЕМ ЧАЩЕ ВСЕГО ИСПОЛЬЗОВАТЬ В АВТОТЕСТИРОВАНИИ
 */