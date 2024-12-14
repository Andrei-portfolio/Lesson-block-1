package Лекция101211;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;

public class ReservedWords {

    public static void main(String[] args) throws IOException {

        // ВАЖНО!!!
        // И последнее на сегодня, иногда бывает, что нам присылают файл, написаный на языке Python. И там
        // к примеру, в параметрах ключ - значение (у Json), будет такой ключ, который нельзя использовать
        // в java. Например одно из зарезервированных слов для названий : Pablic, class, private и т.д.
        // (программа будет их подчеркивать, а при запуске терминала выдаст ошибку)
        // Когда мы будем создавать класс, мы же не сможем применить данное зарезервированное слово.
        // Например, в файле "Andrei.json" будет следующий json с зарезервированным словом Pablic:
//        {
//                "name" : "Андрей",
//                "age" : 38,
//                "Pablic" : "Сотовый"
//        }

        //Чтобы вывести полученный json из  файла "Andrei.json", используем следующий код.
        Path filesPath = Path.of("Andrei.json");// Для начала говорим путь
        ObjectMapper objectMapper = new ObjectMapper();
        People people = objectMapper.readValue(filesPath.toFile(), People.class);// Из созданного класса People

        System.out.println(people);

        // Из за того, что в json у нас запрещенное слово в терминале ошибка. Чтобы выйти из положения,
        // используем в классе People, используем специальную аннатацию @JsonProperty(Pablic). После чего
        // ошибка ушла и в терминале загрузилось: People{name='Андрей', age=38, phone='Сотовый'}. Т.е.
        // в json файле у нас указан "Pablic", а терминале подтянулся наш "phone".

        // Тему json рассмотрели, далее перейдем к теме xml. Для этого создадим файл human.xml
        // (New - File - human.xml)
    }
}