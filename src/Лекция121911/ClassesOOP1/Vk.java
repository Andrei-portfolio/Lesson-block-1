package Лекция121911.ClassesOOP1;

import java.util.ArrayList;
import java.util.List;

public class Vk {

    public static void main(String[] args) {
        User user1 = new User("John", 1);
        User user2 = new User("User123", 2);
        User user3 = new User("Boris", 3);
        Admin admin = new Admin("Moder4815", 4, "fhdghghgdjhfgjfjfhj");
        Moderator moderator = new Moderator("Moder234", 5);
        admin.sendMessage("Привет!!!");// Умеет общаться
        admin.ban();// Умеет банить

        moderator.sendMessage("Я модер, но я умею писать сообщения");

        List<User> users = new ArrayList<>();// Создадим список users, и положить в него сможем admin и moderator,
                                            //после того, как сделаем наследование
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(admin);// Данный объект класса admin сможем добавить только после того, как сделаем наследование, иначе ошибка будет
        users.add(moderator);// Данный объект класса moderator сможем добавить только после того, как сделаем наследование
        System.out.println(users.size());// Смотрим размер (количество) наших пользователей
    }
}