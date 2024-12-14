package Лекция90711;

//РАБОТА С ДАТАМИ, ВРЕМЕНЕМ И ИСКЛЮЧЕНИЯМИ

//Чтобы работать с датами, недостаточно написать, допустим 7 ноября. Потому что дальнейшая работа будет затруднена.
// Почему? Для начала, сразу не понятно какой тип данных использовать для даты: число int, если мы указываем день
// конкретный, ну а если мы хотим конкретный месяц и год, уже сложнее. Здесь наверное строка.


import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class DatesDemo {

    public static void main(String[] args) {


        String dataNow = "07.11.24";
        System.out.println(dataNow + "30"); // Здесь мы говорим, возьми сегодняшнюю дату и прибавь к ней 30 дней.
        //В терминале видим, что в ответ приходит 07.11.2430. В ручную считать не удобно. Далее
        // рассмотрим выход из ситуации

        //Работа с ДАТОЙ

        LocalDate date = LocalDate.now();// Данный метод является private, т.е. статичным. Что означает, что мы
        // не можем создать экземпляр класса. Значит работаем статично. Т.е. сразу напрямую обращаемся через
        // точку. Соответственно new LocalDate date = new LocalDate(); тоже не подойдет. Кстати, после того
        // как поставим точку можно посмотреть какие методы можем применить. Например метод now, который
        // возвращает текущую дату
        System.out.println(date);

        //Теперь применим метод который работает с датой в формате год/месяц/день

        LocalDate date2 = LocalDate.of(2024, 11, 7);
        System.out.println(date2.getDayOfWeek());// Говорит какой день недели был 7.11.2024. В терминал THURSDAY
        System.out.println(date2.plusDays(30)); // Прибавляет 30 дней
        System.out.println(date2.plusMonths(1));

        date2 = date2.plusDays(30);
        System.out.println(date2);

        // Как "спарсить" дату. Мы знаем метод of. Но есть ещё один метод parse

        String dataNow2 = "2024-05-05"; // Чтобы спарсить, нужно писать именно в этом формате и с дефисами.
        // Спарсить, это значит мы перевели дату из строки String в дату, с которой
        // можно работать. Прибавлять дни и т.д.
        LocalDate date3 = LocalDate.parse(dataNow2);
        System.out.println(date3);


        //ПОГОВОРИМ ПРО ВРЕМЯ

        LocalTime time = LocalTime.now(); // Время сейчас
        System.out.println(time);
        System.out.println(LocalTime.of(23, 55, 55)); //

        //ПОГОВОРИМ ПРО ДАТУ и ВРЕМЯ

        System.out.println(LocalDateTime.now()); // Выводит дату и время одновременно, сейчас.


        //Ещё один пример, как слепили из даты и времени, объединили результат
        LocalDate date4 = LocalDate.of(2024, 11, 7);
        LocalTime time4 = LocalTime.now();
        LocalDateTime timestamp = LocalDateTime.of(date4, time4);

        System.out.println(timestamp);


        // Если нас не устраивает формат даты 2024-11-10T22:46:40.828112700, которая выводится в терминал.
        // То мы можем создать патерн, который изменит формат

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = formatter.format(timestamp);
        System.out.println(timestamp);
        System.out.println(formattedDate);

    }
}
