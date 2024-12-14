package Лекция111411.FuncInterfaces;

import java.util.List;
import java.util.function.Supplier;

/* ПРОДОЛЖЕНИЕ ConsumerDemo4

В связи с тем, что мы не можем использовать Consumer когда хотим передать просто текст, то для этого
применим другой интерфейс: Supplier
 */

public class SupplierDemo {

    public static void main(String[] args) {
        List<String> names = List.of("Галина", "Александр", "Михаил", "Евгения");

        Supplier<String> supplier = () -> {// Здесь String это тип возвращаемого аргумента. Вместо "s" мы
                                           // пишем круглые скобки (). Пустой аргумент
            System.out.println("Это поставщик!!!");
            return "Это поставщик!!!";
        };

        printNameWithSupplier (names, supplier);
    }

     //Создадим отдельный метод для Supplier
    private static void printNameWithSupplier(List<String> names, Supplier<String> supplier) {
        System.out.println("Список имён: ");

        for (String name : names) {
            String something = supplier.get();// Ничего не принимает, только возвращает
            System.out.println(something);
        }
        System.out.println("Конец списка");

        /*Вот такой вот дурацкий пример получился, бесполезный метод. Но цель была показать как
        он работает. Он будет писать нам, "Это поставщик!!!, потом возвращать нам
        "Это поставщик!!!. Потом мы эту строку сохраняем в something и опять выводим.
        Вобщем он много раз должен выдать "Это поставщик!!!

        ДАЛЕЕ НА СЛЕДУЮЩЕМ ПРИМЕРЕ РАССМОТРИМ ЕЩЁ ОДИН ФУНКЦ. ИНТЕРФЕЙС FunctionDemo
        */
    }
}
