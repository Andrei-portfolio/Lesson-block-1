package IntermediateCertification;

/*Второй элемент
Напишите программу, которая находит в массиве чисел второй по величине элемент.
Например, для массива [1,5,7,3,2,0,4,9,6], программа выведет 7, потому что
самый большой элемент - 9, а, после него, 7.
 */

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

    int[] numbers = {24, 28, 100, 1, 654, 18, 6, 56, 90, 111};
    Arrays.sort(numbers); // Сортируем массив
//    for (int i=0; i< numbers.length; i++) {
//        for (int number : numbers) {
//            System.out.println(number);
//        }
        System.out.println("В данном массиве чисел, второй по величине элемент: " + numbers[numbers.length-2]);
    }
}

