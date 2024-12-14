package Лекция101211;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Metod2 {


    public static void main(String[] args) {

        Path filePath = Path.of("text.txt");

        // Как результат у нас появился файл text.txt, где написан наш текст "hello Andrei"
        // Чтоже произошло? Когда у нас не было throws IOException, мы не могли запустить код. он нам говорил:
        // Обязательно добавьте throws IOException нажав на кнопку, либо второй способ используйте try и catch

        try {
            Files.writeString(filePath, "hello mr.Andrei");
        }
        catch (IOException ex) {
            System.out.println("Ошибка работы с файлом");
        }
    }
}
