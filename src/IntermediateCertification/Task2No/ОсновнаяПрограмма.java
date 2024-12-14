package IntermediateCertification.Task2No;

import java.time.LocalDate;

public class ОсновнаяПрограмма {
    public static void main(String[] args) {
        LocalDate дата = LocalDate.of(2024, 07, 06); // пример даты последнего полива
        КактусПолив программаДляВаси = new КактусПолив(дата);
        программаДляВаси.проверкаПолива();
    }
}
