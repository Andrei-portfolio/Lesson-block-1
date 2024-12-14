package Лекция73110.Interfases;

    // Данный класс создали в качестве примера, если вдруг нам скажут срочно сделайте уведомления на вайбер


public class ViberNotifier implements Notifier {


    public void notifyUser(Human human, String adress) {
        System.out.println("Вайбер: " + human.getPhone());
        System.out.println(" Ваш товар прибыл к пункт выдачи " + adress);
    }
}



