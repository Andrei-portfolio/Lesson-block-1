package Лекция111411.XMLCollection;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement//Если мы его хотим сохранять в XML, то должны написать данную аннотацию
public class User {

    private String name; // Имя
    private String email; // Эл. адрес

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {// Создали пустой (дефолтный) конструктор
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
