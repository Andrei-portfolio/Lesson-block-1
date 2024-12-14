package IntermediateCertification.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CactusWateringScheduler {
    private LocalDate lastWateredDate;
    private HumiditySensor sensor;

    public CactusWateringScheduler(String lastWateredDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.lastWateredDate = LocalDate.parse(lastWateredDate, formatter);
        this.sensor = new HumiditySensor();
    }

    private boolean isWinter() {
        return lastWateredDate.getMonthValue() == 12 || lastWateredDate.getMonthValue() <= 2;
    }

    private boolean isSpringOrAutumn() {
        int month = lastWateredDate.getMonthValue();
        return (month >= 3 && month <= 5) || (month >= 9 && month <= 11);
    }

    public LocalDate getNextWateringDate() {
        int currentHumidity = sensor.getHumidity();
        System.out.println("Текущая влажность: " + currentHumidity + "%");

        if (isWinter()) {
            return lastWateredDate.plusMonths(1);
        } else if (isSpringOrAutumn()) {
            return lastWateredDate.plusWeeks(1);
        } else { // Лето
            if (currentHumidity < 30) {
                // Поливаем кактус, если влажность меньше 30%
                return lastWateredDate.plusDays(2);
            } else {
                // Не поливаем, возвращаем null
                return null;
            }
        }
    }

    public void scheduleWatering() {
        LocalDate nextWateringDate = getNextWateringDate();
        if (nextWateringDate != null) {
            System.out.println("Кактус нужно полить " + nextWateringDate);
        } else {
            System.out.println("Кактус не нуждается в поливе.");
        }
    }
}

