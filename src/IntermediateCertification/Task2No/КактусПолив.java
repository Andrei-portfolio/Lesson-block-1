package IntermediateCertification.Task2No;

import java.time.LocalDate;
import java.time.Month;

public class КактусПолив {

    private LocalDate деньПоследнегоПолива;

    public КактусПолив(LocalDate деньПоследнегоПолива) {
        this.деньПоследнегоПолива = деньПоследнегоПолива;
    }

    public void проверкаПолива() {
        LocalDate сегодня = LocalDate.now();

        int влажность = Датчик.измеритьВлажностьВоздуха();

        if (сегодня.getMonth() == Month.DECEMBER || сегодня.getMonth() == Month.JANUARY || сегодня.getMonth() == Month.FEBRUARY) {
            if (деньПоследнегоПолива.plusMonths(1).isBefore(сегодня)) {
                System.out.println("Полить кактус " + сегодня);
            }
        } else if (сегодня.getMonth().getValue() >= 3 && сегодня.getMonth().getValue() <= 5 ||
                сегодня.getMonth().getValue() >= 9 && сегодня.getMonth().getValue() <= 11) {
            if (деньПоследнегоПолива.plusWeeks(1).isBefore(сегодня)) {
                System.out.println("Полить кактус " + сегодня);
            }
        } else {
            if (влажность < 30 && деньПоследнегоПолива.plusDays(2).isBefore(сегодня)) {
                System.out.println("Полить кактус " + сегодня);
            }
        }
    }
}
