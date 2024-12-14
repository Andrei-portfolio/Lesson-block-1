package Домашка4;
//          4. Проверка пароля
//● Переменная String с именем password
//● Опишите алгоритм проверки пароля. Требования к паролю:
//        ○ длина пароля не меньше 8 символов. Иначе написать ошибку
//"Пароль не менее 8 символов"
//        ○ пароль должен содержать минимум одну цифру. Иначе написать
//ошибку "Пароль должен содержать минимум 1 цифру"
//        ○ пароль должен содержать минимум 1 из символов [ !, @, #, $, %, ^,
//        &, *, №]. Иначе написать ошибку "Пароль должен содержать
//минимум 1 спецсимвол"
//        ● если пароль подходит по всем критериям, написать "пароль принят"

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Задание4 {

//    public static void hello(String reg, String text){
//        Pattern pattern = Pattern.compile(reg);
//        Matcher matcher = pattern.matcher(text);
//
//        if (matcher.find()){
//            System.out.println("");
//        }else System.out.println("");
//    }

    public static void main(String[] args) {

//        String reg = "[0-9 !@#$%^&*№]";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль");

        String password = scanner.nextLine();
        System.out.println(password);

        if (password.length() < 8) {
            System.out.println("Ошибка:Пароль не менее 8 символов");
        }
       else {
            System.out.println("Пароль принят");
        }
    }
}