package Домашка4;

//5. Задание со звездочкой. FizzBuzz
//Это – классическое задание с собеседования.
//        ● выведите на экран числа 1 до 100. При этом:
//        ○ если число кратно 3, напечатайте Fizz
//○ если число кратно 5, напечатайте Buzz
//○ если число кратно и 3, и 5, напечатайте FizzBuzz

//Результат будет выглядеть так:
//        1
//        2
//Fizz
//4
//Buzz
//...
//        13
//        14
//FizzBuzz
//16
//        ...
//        98
//Fizz
//        Buzz


public class Задание5 {

    public static void main(String[] args) {

        for (int number = 1; number <= 100; number++) {
            String toPrint = "";
            if (number % 3 == 0) {
                toPrint += "Fizz";
            }
            if (number % 5 == 0) {
                toPrint += "Buzz";
            }
            if (toPrint.isEmpty()) {
                toPrint = Integer.toString(number);
            }
            System.out.println(toPrint);
        }
    }
}









