package Лекция101211;

//Продолжение Human.JSON


import com.fasterxml.jackson.databind.ObjectMapper;
import Лекция73110.Продолжение.Human;
import java.io.IOException;
import java.nio.file.Path;

public class HumanToJsonFile {

    public static void main(String[] args) throws IOException { // Не забыть применить "throws IOException"

        // Здесь будем преобразовывать объект в JSON

        Human human = new Human("Олег", 24);// Мы создали Human
        Path filesPath = Path.of("oleg.json");// Для начала говорим путь

        ObjectMapper objectMapper = new ObjectMapper();//Здесь создадим специальный объект ObjectMapper
        // для того, чтобы мапить. А что такое мапить - это означает соотносить что то с чем то.
        // Что он будем мапить? "name" из класса Human это ключ "name" из моего файла Human.JSON.
        // Ну и остальные параметры по такому же принципу age ключ age, Т.е он находит поля нашего класса
        // и их преобразует в jason формат. Вот что он мапит. Вот что такое мапить.
        objectMapper.writeValue(filesPath.toFile(), human); // Мы хотим записать созданного выше Human с помощью
                                                        //ObjectMapper в файл. Мы в скобках указали файл,
                                                        // куда мы записываем и указать самого human.
                                                        // Прост. словами записываем объект human в "oleg.json"
        // При работе с JSON мы не только указываем файл filesPath, но ещё и путь toFile(). jackson просит данный
        // метод. Далее запускаем Run и переходим в создавшуюся папку "oleg.json", чтобы посмотреть результат.
        // В ней видим {"name":"Олег","age":24,"phone":null}. Суппер

        // когда мы добавили зависимость и обновили maven, то у нас подгрузилась библиотека в наш проект.
        // Подгрузилась в папку .m2 у нас в user home папке

        //objectMapper.writerWithDefaultPrettyPrinter().writeValue(filesPath.toFile(), human); // Если добавим
        // данный метод, вместо верхнего, то в файле "oleg.json" у нас json сформируется не в одну строку,
        // а на каждой строке будет ключ значение отдельно. Т.е. более красивый и привычный вид

        // Далее в файле JsonFileToHuman рассмотрим, как сделать наоборот. Т.е. как Json преобр. в объект

    }
}
