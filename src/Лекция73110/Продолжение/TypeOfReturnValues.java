package Лекция73110.Продолжение;

// Sout нужен просто для того, чтобы вывести информацию в консоль (терминал)
// Void просто означает, что после выполнения тела метода нам никакой результат не возвращается

public class TypeOfReturnValues {

    public static void main(String[] args) {
        // Начальный вариант
        // Human alex = new Human("Alex", 5);
        // alex.summa();

        Human alex = new Human("Alex", 5);

        // Первый вариант
        int number2 = alex.summa();
        int y = number2 + 100;

        // Второй вариант
        int number = alex.summa(30, 20); // Означает место, где мы сохраним сумму двух чисел. Кроме того, теперь
        // мы этот number мыжем использовать где хотим и сколько раз захотим
        System.out.println(number);
        System.out.println(number + number);
        System.out.println(number + 60);

        // Третий вариант
        int salary = 1000;
        salary = alex.summa(salary, 200);
        System.out.println(salary);
        salary = alex.summa(salary, 500);
        System.out.println(salary);


    }
}

    // Задача этой лекции понять преимущество использования интерфейсов. Убедиться что код с ними будет
    // более гибким более расширяемым

    // Что входит в ООП - Класс, объект (экземпляр класса), состояние (значение) полей, т.е. чему они равны,
    // поведение объекта (методы, геттеры, сеттеры), инкапсуляция (т.е. скрытие состояния объектов и деталей
    // реализации)