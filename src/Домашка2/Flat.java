package Домашка2;

public class Flat {
    private final Room room;
    String address; //Адрес
    String owner; //Владелец
    int floor; //Этаж
    int cadastralValue; //Кадастровая стоимость
    int totalArea; // Общая площадь
    boolean elevator; // Лифт
    boolean loggia; // Лоджия


    public Flat(Room room,
                String address,
                String owner,
                int floor,
                int cadastralValue,
                int totalArea,
                boolean elevator,
                boolean loggia) {
        this.room = room;
        this.address = address;
        this.owner = owner;
        this.floor = floor;
        this.cadastralValue = cadastralValue;
        this.totalArea = totalArea;
        this.elevator = elevator;
        this.loggia = loggia;
    }

    @Override
    public String toString() {
        return "Квартира{" +
                "room=" + room +
                ", address='" + address + '\'' +
                ", owner='" + owner + '\'' +
                ", floor=" + floor +
                ", cadastralValue=" + cadastralValue +
                ", totalArea=" + totalArea +
                ", elevator=" + elevator +
                ", loggia=" + loggia +
                '}';
    }
}




