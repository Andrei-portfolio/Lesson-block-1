package Лекция121911.ArraysDemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HasMapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Alex", 5);
        students.put("John", 2);
        students.put("Max", 3);

        // Если нам нужны ключи, то создадим список строк

        // Используем метод keySet и отсортируем с помощью reverseOrder студентов по алфавиту в
        // обратном порядке. Если просто по алфавиту, то naturalOrder
        System.out.println(students.keySet().stream().sorted(Comparator.reverseOrder()).toList());

        /* Или же пойдем по более сложному пути с помощью циклов */

        for (Map.Entry entry: students.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(students.values().stream().sorted(Comparator.naturalOrder()).toList());

        // Далее сравниваем, создаём отдельный HashMap.

        /*ОТЛОЖИЛИ ДАННОЕ ЗАДАНИЕ ПО СОРТИРОВКЕ HashMap НА ПОТОМ, ТАК КАК ТАМ НУЖНО ИСПОЛЬЗОВАТЬ СТРИМЫ,
        А МЫ ИХ НЕ ИЗУЧАЛИ ЕЩЁ. НЕОБХОДИМО НАПИСАТЬ НАСТАВНИКУ, ЧТОБЫ ОН НЕ СНИЖАЛ ОЦЕНКУ ЗА
        ОТСУТСТВИЕ СОРТИРОВКИ. МОЖНО В ДОМАШКЕ ЭТО ЗАДАНИЕ НЕ ДЕЛАТЬ ПОКА МЫ ЭТО НЕ РАЗБЕРЁМ


        НИЖЕ ПРЕДСТАВЛЕНО РЕШЕНИЕ КУЗНЕЦОВА АЛЕКСЕЯ ПО ДАННОМУ ВОПРОСУ:

        new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return a.getValue() - b.getValue();
            }
        });

            ДАЛЕЕ ПЕРЕЙДЕМ К ОСНОВНОЙ ТЕМЕ ЛЕКЦИИ ПРИНЦИПЫ ООП. КЛАССЫ - ЭТО ШАБЛОН (МОДЕЛЬ) ОБЪЕКТА С НАБОРОМ
            ЕГО СОСТОЯНИЙ И ПОВЕДЕНИЙ

             */

    }
}
