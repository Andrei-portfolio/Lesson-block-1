package Лекция73110.Interfases;

// public и private - это модификатор доступа

public class Human { // Делаем наши поля приватными, и теперь мы не можем нигде кроме этого класса к ним
    // обращаться.     // Только здесь мы сможем с ними работать. И поэтому тем самым мы убираем возможность
    // работать с данными классами, например в классе world. Чтобы работать с ними, с полями, нужно заменить
    // на public
    private String name; // Имя
    private int age; // Возраст
    private String phone; // Телефон
    private String email; // Эл. адрес
    private double reting; // Рейтинг

    public Human(String name, int age, String phone, String email, double reting) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.reting = reting;
    }

    public Human(String name, int age) {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public double getReting() {
        return reting;
    }
}
