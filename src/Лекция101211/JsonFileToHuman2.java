package Лекция101211;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import Лекция73110.Продолжение.Human;

public class JsonFileToHuman2 {

    public static void main(String[] args)  throws IOException { // Не забыть применить "throws IOException"

        // Здесь будем преобразовывать наоборот, JSON в объект.
        // Так же посмотрим, как же передать несколько строк в одном файле

        Human oleg = new Human("Олег", 24);
        Human alex = new Human("Алекс", 58);
        Human vlad = new Human("Влад", 76);

        Path filesPath = Path.of("humans.json");// Для начала говорим путь
        ObjectMapper objectMapper = new ObjectMapper();//Здесь создадим специальный объект ObjectMapper
        // для того, чтобы мапить. А что такое мапить - это означает соотносить что то с чем то.
        // Что он будем мапить? "name" из класса Human это ключ "name" из моего файла Human.JSON.
        // Ну и остальные параметры по такому же принципу age ключ age, Т.е он находит поля нашего класса
        // и их преобразует в json формат. Вот что он мапит. Вот что такое мапить.

        // Чтобы добавить трёх human, необходимо создать список этих human
        List<Human> humans = List.of(oleg, alex, vlad);
        //objectMapper.writeValue(filesPath.toFile(), humans);

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(filesPath.toFile(), humans); // Если добавим
        // данный метод, вместо верхнего, то в файле "oleg.json" у нас json сформируется не в одну строку,
        // а на каждой строке будет ключ значение отдельно. Т.е. более красивый и привычный вид. При работе с JSON
        // мы не только указывали файл filesPath, но ещё и путь toFile(). jackson просит данный метод

        // Запускаем Run и идем в файл "humans.json", где создались наши три humans. Причем создались они
        // в квадратных скобках и дальше в фигурных, ч/з запятую разделяются
    }
}
