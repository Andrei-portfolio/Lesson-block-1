package Лекция111411.XMLCollection;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement// Чтобы сохранить в XML, как и в файле User укажем аннотацию
@XmlAccessorType(XmlAccessType.FIELD)
public class Users {// Это нечто иное, как сборник User. Это просто класс, в котором можем хранить другие

    @XmlElement(name = "user")// Данная аннотация нужна, чтобы работать со списками, если не укажем ошибка
    private List<User> users;// Объявляем список в классе обёртки. Просто список. Мы говорим, из этого списка
    // users бери элементы и в XML файл сохраняй с таким вот именем "user". Если его поеняем, изменится и в
    // имя в XML файле

    //Далее создадим геттеры, сеттеры и обычный и дефолтный конструктор

    public Users() {
    }

    public Users(List<User> users) {//Можно передавать ч/з конструктор как и обычные переменные (int, string)
        this.users = users;             // и поля. Он принимает список юзеров
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
