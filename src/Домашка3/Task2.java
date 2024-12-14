//2. Задача про массив чисел
//        ● Создайте массив
//        ● Массив хранит 3 дробных числа.
//        ● Положите в массив значение чисел Пи, е и единицу
//        ● Дробные числа с точностью в 5 знаков после запятой


package Домашка3;

public class Task2 {

    public static void main(String[] args) {
        double[] numbers = {Math.PI, Math.E, 1.0};

        System.out.format("Число Pi = " + "%.5f\n", numbers[0]);
        System.out.format("Число E = " + "%.5f\n", numbers[1]);
        System.out.format("Еденица = " + "%.5f\n", numbers[2]);


    }


}
