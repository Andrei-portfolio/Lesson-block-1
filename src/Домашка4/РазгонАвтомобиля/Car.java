package Домашка4.РазгонАвтомобиля;

public class Car {

    private String brand;
    private String model;
    private int currentSpeed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.currentSpeed = 0; // По умолчанию скорость равна 0
    }

    // Метод для получения текущей скорости
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    // Метод для увеличения скорости
    public void speedUp(int increment) {
        if (increment > 0) {
            currentSpeed += increment; // Увеличиваем скорость на заданное число
        }
    }

    // Метод для замедления скорости
    public void breakCar() {
        if (currentSpeed <= 10) {
            currentSpeed = 0; // Если скорость <= 10, устанавливаем скорость в 0
        } else {
            currentSpeed -= 10; // Иначе уменьшаем скорость на 10
        }
    }
}