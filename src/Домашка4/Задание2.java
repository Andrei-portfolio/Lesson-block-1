package Домашка4;

//2. if-else

//Создайте переменную типа int и присвойте ей любое значение
//Если число четное (делится на 0 без остатка), напишите "Четное число."
//Если число нечетное, напишите "Нечетное число."
//Чтобы проверить, что число четное, нужно выяснить, делится ли оно на 2 без остатка.
//Для этого существует оператор % – он возвращает остаток от деления. Например:

// в переменную запишется 1. Потому что 16:3 = 5 и один в остатке.
//int result = 16 % 3;

// в переменную запишется 0. Потому что 16:4 = 4 и ноль в остатке.
//int result = 16 % 4;

// в переменную запишется 0. Потому что 10:2 = 5 и ноль в остатке.
//int result = 10 % 2;

// в переменную запишется 1. Потому что 11:2 = 5 и один в остатке.
//int result = 11 % 2;


public class Задание2 {

    public static void main(String[] args) {

        int number = 234;

        if (number % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }
}