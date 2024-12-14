package Лекция111411.FuncInterfaces;

import java.util.List;
import java.util.function.Consumer;

// ПРОДОЛЖЕНИЕ ConsumerDemo3

/*Обратим вниманее, что НИЖЕ при создании класса Consumer, у него "new Consumer<String>()"
подсвечено серым цветом. IDEA нам всегда показывает серым то, что мы можем упростить. Поэтому
в данном классе продемонстрировано каким образом. Для этого наведем во второй Consumer курсор
на new Consumer<String>() и нажмем на предложенный Replace with lambda. А первый Consumer оставим
тем же самым, чтобы было сравнить отличие кода. Но результат будет одинаковый. Код меньше
*/

public class ConsumerDemo4 {

    public static void main(String[] args) {
        List<String> names = List.of("Галина", "Александр", "Михаил", "Евгения");
        List<String> secondNames = List.of("Маруся", "Фёдор", "Яков", "Елена");

        Consumer<String> standartConsumer = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> consumerToLowerCase = s ->
                System.out.println(s.toLowerCase());

        printName(names, standartConsumer);
        printName(secondNames, consumerToLowerCase);
    }
    /*
    Полностью ушла new Consumer<String>(). А зачем писать это? Если и так понятно, что Consumer<String>,
    т.к. написано вначале. Далее зачем писать public void accept(String s), там же реализуется всего один
    метод. Ведь мы можем просто указать , что у нас есть аргумент "s", а "->" означает что далее
    идет сам метод
     */

    private static void printName(List<String> names, Consumer<String> consumer) {
        System.out.println("Список имён: ");
        for (String name : names) {
            consumer.accept(name);
        }
        System.out.println("Конец списка");


        /*
        НА САМОМ ДЕЛЕ СУЩЕСТВУЕТ МНОГО ФУНКЦ.ИНТЕРФЕЙСОВ. НО МЫ РАССМОТРИМ ТОЛЬКО ЕЩЁ ДВА ИЗ НИХ
        НАИБОЛЕЕ ВОСТРЕБОВАННЫХ. ПЕРВЫЙ ЭТО supplier.
         */
    }
}
