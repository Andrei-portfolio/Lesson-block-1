package Лекция132111.simpleEnums;

public class MapRussia {

    public static void main(String[] args) {
        go(Sides.West);//В качестве аргумента передаём West
        go(Sides.East);// //В качестве аргумента передаём East
    }

    private static void go(Sides side) {// Говорим, принимаем класс Sides и вызываем наш метод. Чтобы не было разночтений,
        // мы вместо строки принимаеим на вход объект класса Sides. Это как Human у нас был и мы писали Human human,
        // а здесь пишем Sides side. Enums принято писать с большой буквы и во множественном числе, так как там
        // идёт перечисление
        System.out.println(side);
        if (side == Sides.West) {
            System.out.println("Идем на запад");
        }
            else if (side == Sides.East) {
                System.out.println("Идем восток");

            //В методе мы говорим, если side == Sides.West, то мы идём на запад. Если side == Sides.East, то
            // Идем восток.
        }
    }
}
