package Лекция132111.ClassesOOP2;

public class User {

    protected String name;

    private String surname;

    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Это конструктор юзера");
    }

    public void sendMessage(String messageText) {// Написали метод, согласно которого User и наследованные классы могут писать.
                                                // Т.е. написали его единожды. В Admin и Moderator его писать не надо
        System.out.println(messageText);
        unBanMePlease();
    }

    protected void unBanMePlease() {// В методе дадим возможность просить разбанить
        System.out.println("Пожалуйста, разбаньте, я больше так не буду!");
    }
}

