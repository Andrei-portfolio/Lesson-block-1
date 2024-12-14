package Лекция73110.Interfases;

    // К нам опять пришёл начальник и говорит, смс и эмейл уведомления это круто. Но нам теперь нужны телеграмм
    // уведомления. Поэтому создадим новый класс TelegramNotifier

    // public class TelegramNotifier { //Так было в самом начале, пока не имплементировали

public class TelegramNotifier implements Notifier {// имплементируем (т.е. расширяем Notifier или интерфейс).
    // Теперь если код метода public void notifyUser (Human human, String adress) ......., представенный ниже
    // мы удалим, то будет ошибка. Основной причиной которой является, что интерфейс запрещает TelegramNotifier
    // без метода notifyUser. Т.е. теперь java благодаря интерфейсу защищает от глупой ошибки, в части создания
    // TelegramNotifier без метода для отправки уведомлений. Забыли, стерли и т.д.

    public TelegramNotifier() { //По идее конструктор создавать не нужно, так как мы туда передавать ничего не будем.
        //Но мы его создали для наглядности

    }

    public void notifyUser(Human human, String adress) {
        System.out.println("Отправлено телеграмм ботом на номер " + human.getPhone()); // Сменили на getEmail,
                                                                                // остальное оставили тоже самое
        System.out.println(" Ваш товар прибыл к пункт выдачи " + adress);
    }
}