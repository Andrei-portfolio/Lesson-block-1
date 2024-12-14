package Домашка2;

public class Item {

    String name; // Название
    int article;  // Артикул
    int price;   // Цена
    int quantity; // Количество
    String colour; // Цвет
    String dimensions; // Габариты
    boolean delivery; // Доставка
    boolean credit; // Кредит


    public Item(String name, int article, int price, int quantity, String colour, String dimensions, boolean delivery, boolean credit) {
        this.name = name;
        this.article = article;
        this.price = price;
        this.quantity = quantity;
        this.colour = colour;
        this.dimensions = dimensions;
        this.delivery = delivery;
        this.credit = credit;

    }

    public Item(String name, int article, int quantity, String colour, String dimensions, boolean delivery, boolean credit) {
        this.name = name;
        this.article = article;
        this.quantity = quantity;
        this.colour = colour;
        this.dimensions = dimensions;
        this.delivery = delivery;
        this.credit = credit;
    }
}

