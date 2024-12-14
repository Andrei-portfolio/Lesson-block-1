//1. Задача про массив строк
//        ● Создайте массив
//        ● Массив хранит 5 строк.
//        ● Массив должен называться todoList
//        ● Положите в массив 5 дел на день


package Домашка3;

public class Task1 {

    public static void main(String[] args) {
        ;

        String[] todoList1 = new String[5];
        todoList1[0] = "Выкинуть мусор";
        todoList1[1] = "Покрасить потолок";
        todoList1[2] = "Сменить моторное масло";
        todoList1[3] = "Повесить картину";
        todoList1[4] = "Починить смеситель";

        String[] todoList2 = new String[]{"Приготовить ужин", "Купить продукты", "Поклеять обои", "Помыть машину",
                "Повесить светильник"};

        String[] todoList3 = {"Постричься", "Побриться", "Сходить в магазин", "Заплатить за квартиру",
                "Позвонить родителям"};


        System.out.println("Пример массива todoList №1:" + " 1." + todoList1[0] + "; 2." + todoList1[1] + "; 3."
                + todoList1[2] + "; 4." + todoList1[3] + "; 5." + todoList1[4]);

        System.out.println("Пример массива todoList №2:" + " 1." + todoList2[0] + "; 2." + todoList2[1] + "; 3."
                + todoList2[2] + "; 4." + todoList2[3] + "; 5." + todoList2[4]);

        System.out.println("Пример массива todoList №3:" + " 1." + todoList3[0] + "; 2." + todoList3[1] + "; 3."
                + todoList3[2] + "; 4." + todoList3[3] + "; 5." + todoList3[4]);
    }


}
