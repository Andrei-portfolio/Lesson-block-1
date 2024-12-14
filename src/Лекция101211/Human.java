package Лекция101211;

// public и private - это модификатор доступа

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement // Напишем аннотацию "@XmlRootElement", чтобы отработал терминал в классе XmlToHumanAndHumanToXml
public class Human { // Делаем наши поля приватными, и теперь мы не можем нигде кроме этого класса к ним
    // обращаться. Только здесь мы сможем с ними работать. И поэтому тем самым мы убираем возможность работать
    // с данными классами, например в классе world. Чтобы работать с ними, с полями, нужно заменить
    // на public
    private String name; // Имя
    private int age; // Возраст
    private String phone; // Телефон
    private String email; // Эл. адрес

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() { // Создали пустой (дефолтный) конструктор
    }

    // При создании геттеров, они должны называться строго getName, getAge и т.д. Т.е. если они будут
    // называться как то по другому, getNameTo или getAgeTo, то опять будет ошибка

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

           //Создадим сеттеры

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

       // Создадим toString


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}















