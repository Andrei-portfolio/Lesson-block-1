package Лекция90711.ToString;

public class Human {

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

    public Human(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getAge() { // int это тип возвращаемого значения
        return age;
    }

    public String getName() { // String это тип возвращаемого значения
        return name; //return означает вернуть значение. Что значит вернуть. Что этот метод делает?
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", reting=" + reting +
                '}';
    }
}
