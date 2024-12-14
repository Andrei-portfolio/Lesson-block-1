package Лекция121911.ClassesOOP1;

public class Moderator extends User {// Использовали принцип наследования (extends User), чтобы избавиться от повтора кода
                                    //КЛАСС НАСЛЕДНИК

    public String token;

    public Moderator(String name, int id) {
        super(name, id);
        System.out.println("Создан модератор");
    }

    public void sendAlert() {
        System.out.println(this.name);
        System.out.println("Я вам запрещаю нарушать правила");
        unBanMePlease();
        sendMessage("Привет");
    }
}
