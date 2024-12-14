package IntermediateCertification.Task2;

import java.util.Random;

public class HumiditySensor {
    private Random random;

    public HumiditySensor() {
        this.random = new Random();
    }

    public int getHumidity() {
        // Генерация случайного значения влажности от 0 до 100%
        return random.nextInt(101);
    }
}