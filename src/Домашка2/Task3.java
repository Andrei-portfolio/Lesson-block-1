package Домашка2;

public class Task3 {

    public static void main(String[] args) {

        Item product = new Item(
                "book",
                12345,
                2,
                "Red",
                "100*100",
                true,
                false);

        Item product2 = new Item(
                "Luminaire",
                67890,
                5000,
                3,
                "black",
                "120*80",
                false,
                false);

        Item product3 = new Item(
                "fridge",
                102313,
                2,
                "green",
                "2000*1000",
                false,
                true);

        Item product4 = new Item(
                "engine oil",
                678366,
                9000,
                3,
                "pink",
                "90*90",
                true,
                false);

        Item product5 = new Item(
                "jelly",
                987523,
                3000,
                60,
                "orange",
                "30*30",
                false,
                false);

        System.out.println("Артикул:" + " " + product.article + ", " + "Название:" + " " + product.name + ", " +
                "Цена:" + " " + product.price + ", " + "Количество:" + " " + product.quantity + ", " + "Цвет:" + " "
                + product.colour);

        System.out.println("Артикул:" + " " + product2.article + ", " + "Название:" + " " + product2.name + ", " +
                "Цена:" + " " + product2.price + ", " + "Количество:" + " " + product2.quantity + ", " + "Цвет:" + " "
                + product2.colour);

        System.out.println("Артикул:" + " " + product3.article + ", " + "Название:" + " " + product3.name + ", " +
                "Цена:" + " " + product3.price + ", " + "Количество:" + " " + product3.quantity + ", " + "Цвет:" + " "
                + product3.colour);

        System.out.println("Артикул:" + " " + product4.article + ", " + "Название:" + " " + product4.name + ", " +
                "Цена:" + " " + product4.price + ", " + "Количество:" + " " + product3.quantity + ", " + "Цвет:" + " "
                + product4.colour);

        System.out.println("Артикул:" + " " + product5.article + ", " + "Название:" + " " + product5.name + ", " +
                "Цена:" + " " + product5.price + ", " + "Количество:" + " " + product5.quantity + ", " + "Цвет:" + " "
                + product5.colour);
    }

}

