package Домашка2;

public class Room {
    String purpose; //Назначение
    String nameDesigner; // Дизайнер интерьера
    int residents; // Жильцов
    int square; //Площадь
    boolean renovation; //Евроремонт
    boolean dressingRoom; //Гардеробная
    public Room(String purpose,
                String nameDesigner,
                int residents,
                int square,
                boolean renovation,
                boolean dressingRoom) {
        this.purpose = purpose;
        this.nameDesigner = nameDesigner;
        this.residents = residents;
        this.square = square;
        this.renovation = renovation;
        this.dressingRoom = dressingRoom;
    }

    @Override
    public String toString() {
        return "Комната {" +
                "Purpose='" + purpose + '\'' +
                ", NameDesigner='" + nameDesigner + '\'' +
                ", Residents=" + residents +
                ", Square=" + square +
                ", Renovation=" + renovation +
                ", DressingRoom=" + dressingRoom +
                '}';
    }
}








