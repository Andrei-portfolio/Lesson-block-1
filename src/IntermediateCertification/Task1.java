package IntermediateCertification;

/*
Мальчик хочет написать на заборе признание в любви девочке из пятнадцати букв и трех пробелов.
На каждые три буквы мальчик тратит по 62 см длины забора, а на каждый пробел - 12 см.
Напишите программу, которая поможет по длине забора (введенной пользователем) выяснить,
поместится ли на забор такой длины надпись мальчика.
*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int lettersCount = 15;// Количество букв
        int spacesCount = 3;// Количество пробелов
        double lengthThreeLetters = 62.0;// Длина трёх букв
        double lengthSpace = 12.0;//Длина одного пробела

        double labelLength = lettersCount / 3.0 * lengthThreeLetters + spacesCount * lengthSpace;// Длина надписи

        Scanner scanner = new Scanner(System.in);// Сканер сканирует данные из системы
        System.out.println("Введите длинну забора, см : ");// Выводится в терминал
        double fenceLength = scanner.nextDouble();//Запускаем скканер для ввода длины забора и просим его сохранить в
                                                 // переменную fenceLength то значение которое введем, а потом вывести
                                                // на экран.
        System.out.println(fenceLength);

        if (fenceLength <= labelLength) {
            System.out.println("Надпись поместится");
        } else {
            System.out.println("Надпись НЕ поместится");
        }
    }
}