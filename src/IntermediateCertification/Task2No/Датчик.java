package IntermediateCertification.Task2No;

import java.util.Random;

public class Датчик {
    public static int измеритьВлажностьВоздуха() {
        Random rand = new Random();
        return rand.nextInt(100); // генерация случайного числа от 0 до 99 для влажности
    }
}
