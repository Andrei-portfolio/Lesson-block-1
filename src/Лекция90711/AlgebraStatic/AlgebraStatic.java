package Лекция90711.AlgebraStatic;

public class AlgebraStatic {

    public static int sum(int a, int b) { // В отличие от класса  Algebra допишем здесь static. После этого
                                         // я имеюя имею возможность вызвать данный метод без создания объекта
        return a + b;

    }

    public static double pi = 3.14; // Создадим статичную переменную Pi

}
