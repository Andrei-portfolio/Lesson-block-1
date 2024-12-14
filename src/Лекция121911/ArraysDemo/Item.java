package Лекция121911.ArraysDemo;
// Сначала сделали класс с помощью геттеров и конструктора, а потом заменили на record,
// который в себе их уже содержит


public record Item(String name, int price, int rating) {

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
