package Домашка6;

//2. Список дел
//● Создайте список строк (List)
//● Положите в список 5 дел на день
//● в цикле выведите список в формате:
//        ○ Задача 1: {текст задачи}
//        ○ Задача 2: {текст задачи}
//        ○ ...
//        ○ Задача 5: {текст задачи}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Задание2 {


    public static void main(String[] args) {

        List<String> toDoList = new ArrayList<>();
        toDoList.add(0, "Постричься");
        toDoList.add(1, "Побриться");
        toDoList.add(2, "Повесить светильник");
        toDoList.add(3, "Переобуть колеса");
        toDoList.add(4, "Сходить в магазин");

        int index = 1;
        for (String toDo : toDoList) {
            System.out.println("Задание " + index++ + " " + toDo);
        }
    }
}



