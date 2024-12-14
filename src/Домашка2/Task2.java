package Домашка2;

public class Task2 {

    public static void main(String[] args) {

        Flat flat1 = new Flat(new Room(

                "Детская",
                "Губина Нина",
                2,
                27,
                true,
                false),
                "г.Самара, ул.Свободы д.14., кв.2",
                "Иванов Иван Иванович",
                4,
                7000000,
                78,
                true,
                true
        );


        System.out.println(flat1);

        System.out.println(flat1.owner + " проживает по адресу " + flat1.address + " на " + flat1.floor + " этаже. " +
                "Кадастровая стоимость квартиры " + flat1.cadastralValue + "руб.," + " общая площадь " + flat1.totalArea + " кв.м");


    }
}


