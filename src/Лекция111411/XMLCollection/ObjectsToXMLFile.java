package Лекция111411.XMLCollection;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

// Пример как добавить в XML файл несколько объектов

public class ObjectsToXMLFile {

    public static void main(String[] args) throws JAXBException {

        User user1 = new User("SuperUser", "superUser@mail.ru");
        User user2 = new User("admin", "admin@mail.ru");

//        List<User> users = new ArrayList<>();// Создаём чтобы положить более 1 user
//        users.add(user1); // Добавим user1
//        users.add(user2); // Добавим user2

        // ЗАКОМИТИЛИ ВЫШЕ, ТАК КАК ДАННЫЙ МЕТОД НЕ ПОДХОДИЛ и НУЖНА БЫЛА ОБЁРТКА. Правильно запишем ниже

        // Создадим список в отдельном классе обёртки Users
        List<User> usersList = new ArrayList<>();// Создаём чтобы положить более 1 user
        usersList.add(user1); // Добавим user1
        usersList.add(user2); // Добавим user2
        Users users = new Users(usersList);// Прокинули список наших Users

        Path filesPath = Path.of("users.xml");// Для начала говорим путь, где будет храниться наш файл.
        JAXBContext context = JAXBContext.newInstance(Users.class);// Создаём контекст. Говорим, будем работать
        //с обёрткой, которая включает несколько
        // юзеров, поэтому укажем Users

        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(users, filesPath.toFile());//Создаём объект и упаковываем в файл. В связи
        // с тем, что мы не можем положить более одного user (user1 и user2), выше создадим список users
        // с помощью ArrayList. НО у нас ошибка, JAX не может работать с коллекциями. Ему не понятно
        // что такое List<User>. Он привык работать с объектами класса (user1 и user2). Поэтому если мы не
        // можем прокинуть массив,список ArrayList, а можем прокинуть только объект. Соответственно
        // нам нужно создать обёртку для List<User> users = new ArrayList<>(); т.е, создать ещё один
        // класс который будет содержать в себе List<User> users = new ArrayList<>(). Т.е мы обманем JAX
        // и получим то что хотим. Далее создадим НАШУ ОБЁРТКУ класс Users для List<User> users.
        // После создания класса, закомитим List<User> users = new ArrayList<>();
        //                                  users.add(user1); // Добавим user1
        //                                  users.add(user2); // Добавим user2
        //
        // А вместо него напишем
        // ПРИВЕДЁННЫЙ ВЫШЕ МЕТОД ОБЁРТКИ, А ТАКЖЕ СИТУАЦИЯ, ЧТО что мы не можем положить более одного
        // user (user1 и user2) КАСАЕТСЯ ТОЛЬКО БИБЛИОТЕКИ JAX. В остальных библиотеках по другому скорее всего

        // Далее перейдем к новой теме RECORD (в переводе "Запись") - ЭТО СВОЕГО РОДА НОВИЯ ФИЧА ЯЗЫКА, АНАЛОГ
        // КЛАССА, КОТОРЫЙ НУЖЕН ЧТОБЫ СОКРАТИТЬ КОД.
        // Минусы RECORD. Если сайт был давольно таки давно был написан на java, ранее 8 серии (вроде бы),
        // то там применить RECORD уже будет нельзя. Поэтому очень многие им не пользуются. Но это не
        // освобождает нас от того, что мы не должны о них знать.
        // Приступим к изучению. Как пример, у нас есть класс User. И мы сделаем точно такой же класс, но с
        // применением RECORD
    }
}
