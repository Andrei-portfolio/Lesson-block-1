package Лекция111411.Records;

public class HumanC {

    private String name; // Имя
    private String email; // Эл. адрес

    public HumanC(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
