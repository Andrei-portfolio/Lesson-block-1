package Лекция101211;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;

public class JsonFileToHuman {

    public static void main(String[] args)  throws IOException { // Не забыть применить "throws IOException"

        // Здесь будем преобразовывать наоборот, JSON в объект

        Path filesPath = Path.of("oleg.json");// Для начала говорим путь
        ObjectMapper objectMapper = new ObjectMapper();//Здесь создадим специальный объект ObjectMapper
        // для того, чтобы мапить. А что такое мапить - это означает соотносить что то с чем то.
        // Что он будем мапить? "name" из класса Human это ключ "name" из моего файла Human.JSON.
        // Ну и остальные параметры по такому же принципу age ключ age, Т.е он находит поля нашего класса
        // и их преобразует в json формат. Вот что он мапит. Вот что такое мапить.
        Human human = objectMapper.readValue(filesPath.toFile(), Human.class); // Мы хотим записать созданного
        // выше Human с помощью ObjectMapper в файл. Мы в скобках указали файл, куда мы записываем и указали
        // ИМЕННО КЛАСС. Ну а МЕТОД readValue СМОТРИТ файл, в котором находится олег, и мы ему говорим в какой
        // класс хотим преобразовать JSON файл. Human human - это мы сохраняем. При работе с JSON
        // мы не только указывали файл filesPath, но ещё и путь toFile(). jackson просит данный метод

        System.out.println(human);

        // Видим длинную ошибку, Exception in thread "main" com.fasterxml.jackson.databind.exc.
        // InvalidDefinitionException: Cannot construct instance of `Лекция101211.Human`. Программа
        // Программа ругается на конструктор. Хочет чтобы мы создали пустой конструктор. Т.е.
        // который создаёт объект и ничего не делает. Пустой конструктор. Также нужны будут геттеры и сеттеры и
        // toString.

        // У нас действительно создался объект из JSON файла "oleg.json". Т.е. изначально у нас был обычный
        // текстовый файл с небольшими наваротами. А мы взяли и создали из него объект. И написали всего
        // 4 строчки кода. Спасибо за это нашей библиотеке jackson. У каждой библиотеки есть документация,
        // где можно посмотреть все необходимые требования.

        // Чтобы посмотреть, как передать несколько строк в одном файле, посмотрим в классе JsonFileToHuman2
    }
}