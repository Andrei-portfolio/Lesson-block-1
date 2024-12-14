package Лекция101211;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MultipleLinesFile {

    public static void main(String[] args) throws IOException {

        // Далее посмотрим как записать несколько строк, а также как прочитать несколько строк, а для
        //  этого перейдем в другой класс

        Path filesPath = Path.of("text.txt"); //Указать путь к файлу
        Files.writeString(filesPath, "Побег из шоушенка"); // сохраняем строку в файл
        Files.writeString(filesPath, "1+1");
        Files.writeString(filesPath, "Остров проклятых");


        // Мы хотим работать с этим файлом, откуда записали оттуда и считали
        String stringFromText = Files.readString(filesPath);
        System.out.println(stringFromText);

    // Запустив терминал, видим, что столкнулись с первой проблемой у нас текст перезаписался. Мы сказали,
        // запиши "Побег из шоушенка", он записал. Запиши "1+1", он записал, запиши "Остров проклятых", он
        // записал. Далее смотрим что выдаёт терминал, а там только "Остров проклятых". Почему же?
        // Потому что в нашем случае при перечислении фильмов, они перезаписались и осталось только последнее
        // значение "Остров проклятых". Остальные фильмы он стёр. Т.е. создаёт каждый раз, перетирая остальные.
        // Чтобы такого не было через запятую добавим StandardOpenOption.APPEND. Кроме того, чтобы фильмы не
        // писались слитно поставим \n - перенос строки


        Path filesPath2 = Path.of("text.txt"); //Указать путь к файлу
        Files.writeString(filesPath2, "Сияние\n", StandardOpenOption.APPEND); // сохраняем строку в файл
        Files.writeString(filesPath2, "Противостояние\n", StandardOpenOption.APPEND);
        Files.writeString(filesPath2, "Служебный роман\n", StandardOpenOption.APPEND);

        String stringFromText2 = Files.readString(filesPath2);// считай текст из файла в строку
        System.out.println(stringFromText2);

        // Если же наш файл "text.txt" удалим, в терминале выдаст исключение. Т.е. в throws IOException
        // исключение по удалению файла не входит. Т.е. удаление файла, на нашей ответственности

        // Чтобы проверить наше заключение, в untitled1 сами создадим файл "mySupperText.txt". Писать
        // в нём ничего не нужно. Запустим терминал, там появятся наши "Чиполино" и т.д. Что сделаем
        // теперь, удалим наш файл mySupperText.txt и запустим терминал. У нас выдало исключение. Так
        // как не была найден наш файл. Для выхода из ситуации, вместо StandardOpenOption.APPEND в
        // первой строчке запишем StandardOpenOption.CREATE. И всё будет норм.

        Path filesPath3 = Path.of("mySupperText.txt"); //Указать путь к файлу
        Files.writeString(filesPath3, "Чиполино\n", StandardOpenOption.CREATE); // сохраняем строку в файл
        Files.writeString(filesPath3, "Красная шапочка\n", StandardOpenOption.APPEND);
        Files.writeString(filesPath3, "Три поросенка\n", StandardOpenOption.APPEND);

        String stringFromText3 = Files.readString(filesPath3);// считай текст из файла в строку
        System.out.println(stringFromText3);

    }
}
