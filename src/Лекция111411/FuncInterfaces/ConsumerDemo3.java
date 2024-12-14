package Лекция111411.FuncInterfaces;

import java.util.List;
import java.util.function.Consumer;

// ПРОДОЛЖЕНИЕ ConsumerDemo2

public class ConsumerDemo3 {

    public static void main(String[] args) {
        List<String> names = List.of("Галина", "Александр", "Михаил", "Евгения"); // Создадим список строк:имена
        //и напишем метод, который будет выводить эти имена на экран
        List<String> secondNames = List.of("Маруся", "Фёдор", "Яков", "Елена");

        Consumer<String> standartConsumer = new Consumer<String>() {
            /*Принимает на вход, но на выходе пусто void. Мы прям на месте создали класс от этого интерфейса
            и внутри метод этого интерфейса (см.ниже). Это называется анонимный класс. Мы создали его здесь,
            так как не хотим его больше нигде использовать.  Чисто один раз и от него создали объект
            standartConsumer. Это не имя, а объект. У нашего класса нет имени, а new Consumer<String>()
            это его интерфейс*/

            @Override // эту анотацию можно удалить, она для читабельности, обозначает что взяли из
            // интерфейса и перезаписали
            public void accept(String s) {// принимет строку accept, а возвращает ничего. И в этом методе
                // мы ниже выполним нашу задачу
                System.out.println(s);//тут мы пишем свои действия, что хотим сделать
            }
        };

        Consumer<String> consumerToLowerCase = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());
            }
        };

        printName(names, standartConsumer);
        printName(secondNames, consumerToLowerCase);
        // Только послесоздания метода private static void printName (List<String> names)
        // (ниже) мы можем вывести список в терминал
    }

    private static void printName(List<String> names, Consumer<String> consumer) {//метод, который будет
        // выводить  имена на экран. Через запятую напишем что передаём: будет параметр names и
        // будет метод consumer
        System.out.println("Список имён: ");
        for (String name : names) {// с помощью for красиво оформим данный список в терминале
            consumer.accept(name);
        }
        System.out.println("Конец списка");

/*В этом методе мы говорим, сначала выведи слова в списке, потом прогони через цикл весь список, примени
к нему consumer. По окончанию работы он говорит "Конец списка"

Обратим вниманее, что выше при создании класса Consumer, у него "new Consumer<String>()"
подсвечено серым цветом. IDEA нам всегда показывает серым то, что мы можем упростить. Поэтому
в следующем классе ConsumerDemo4 продемонстрировано каким образом
*/


    }
}