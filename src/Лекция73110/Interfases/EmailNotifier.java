package Лекция73110.Interfases;

// К нам пришёл начальник и говорит, смс уведомления это круто. Но нам теперь нужны email уведомления. Поэтому
// создадим новый класс EmailNotifier

//public class EmailNotifier  { //Так было в самом начале, пока не имплементировали

public class EmailNotifier implements Notifier {// имплементируем (т.е. расширяем Notifier или интерфейс).
    // Теперь если код метода public void notifyUser (Human human, String adress) ......., представенный ниже
    // мы удалим, то будет ошибка. Основной причиной которой является, что интерфейс запрещает EmailNotifier
    // без метода notifyUser. Т.е. теперь java благодаря интерфейсу защищает от глупой ошибки, в части создания
    // TelegramNotifier без метода для отправки уведомлений. Забыли, стерли и т.д.

    public EmailNotifier() { //По идее конструктор создавать не нужно, так как мы туда передавать ничего не будем.
        //Но мы его создали для наглядности

    }


    public void notifyUser(Human human, String adress) {
        System.out.println(human.getEmail()); // Сменили на getEmail, остальное оставили тоже самое
        System.out.println(" Ваш товар прибыл к пункт выдачи " + adress);
    }
}
