package Лекция73110.Interfases;

import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {

        // СОЗДАДИМ ТРИ ЧЕЛОВЕКА, КОТОРЫМ БУДЕМ СЛАТЬ УВЕДОМЛЕНИЕ о доставке товара

        Human jack = new Human("Jack", 24, "892345569", "Jack@mail.com", 10.0);
        Human alex = new Human("alex", 34, "89223434", "alex@mail.com", 9.6);
        Human john = new Human("john", 44, "8957575", "john@mail.com", 9.2);

//        SmsNotifier smsNotifier = new SmsNotifier(); //Создали экземпляр класса SmsNotifier и ниже вызвали
//                                                       его методы
//        smsNotifier.notifyUser(jack, "г. Москва");
//        smsNotifier.notifyUser(alex, "г. Москва");
//        smsNotifier.notifyUser(john, "г. Москва");

        // К нам пришёл начальник и говорит, смс уведомления это круто. Но нам теперь нужны email уведомления.
        // Поэтому создадим новый класс EmailNotifier

//        EmailNotifier emailNotifier = new EmailNotifier(); //Создали экземпляр класса emailNotifier и ниже
//                                                            вызвали его методы
//        emailNotifier.notifyUser(jack, "г. Москва");
//        emailNotifier.notifyUser(alex, "г. Москва");
//        emailNotifier.notifyUser(john, "г. Москва");

        // Обратить вниманее, что выше представлены экземпляр класса SmsNotifier и emailNotifier, которые
        // практически идентичны друг другу. Разница только в начале. В первом случае везде sms подставляли, во
        // втором email. Кроме того, здесь есть один недостаток, если вдруг поменяется пункт выдачи товара на
        // г. Самара. А мы изменим адрес местонахождения только в смс оповещении. А в уведомлении на почту мы
        // его забудем изменить и клиенту придет ложное местонахождение г.Москва. Как следствие ему не очень
        // понравится, если он будет ехать за ним в Москву, а по дороге придет смс, что товар в Самаре.

        // Т.е. пример простой, но так и бывает. Если мы пишем однотипный код, который выдает практически одно .
        // и тоже Но немного отличается. Наша задача сделать так, чтобы он не дублировался как сейчас. Т.е.
        // в нашем случае, джек получает и уведомление по телефону и по эмейлу с одной и тойже информацией.
        // Наша задача исключить дублирование. Можно упростить задачу через циклы. Но к нам опять пришёл
        // начальник, поставил задачу, чтобы уведомления приходили и в телеграмм. Поэтому создадим новый
        // класс TelegramNotifier

//        TelegramNotifier telegramNotifier = new TelegramNotifier(); //Создали экземпляр класса telegramNotifier
//                                                                      и ниже вызвали его методы
//        telegramNotifier.notifyUser(jack, "г. Москва");
//        telegramNotifier.notifyUser(alex, "г. Москва");
//        telegramNotifier.notifyUser(john, "г. Москва");

        // У нас всего один метод, а код получился довольно большой. Кроме того, возможны ошибки. А если будут ещё
        // уведомления по вайберу, ватсапу и т.д. Код будет ещё больше. Вероятность ошибок увеличится.
        // Чтобы избежать этого, нам помогут ИНТЕРФЕЙСЫ. это описание действий класса, т.е. его поведения. Это
        // такая вещь которая объединяет между собой несколько похожих классов. Интерфейс можно рассмотреть
        // как договор, который мы обязаны соблюдать в своих классах

        //После внесения изменений во вкладки TelegramNotifier, EmailNotifier и SmsNotifier мы представим, что
        // хотим отправлять уведомления на онкретный Notifier. А для этого запрашиваем через сканер.

        System.out.println("Куда вам отправлять уведомления? СМС/EMAIL/ТЕЛЕГА/VIBER");// Мы говорим введите, куда
        // отпр. уведомления СМС/EMAIL/ТЕЛЕГА
        String typeOfNotifier = new Scanner(System.in).nextLine();

        if (typeOfNotifier.equals("СМС")) {//Если он ввел СМС, то мы шлём ему телефон

            SmsNotifier smsNotifier = new SmsNotifier(); //Создали экземпляр класса SmsNotifier и ниже вызвали
                                                        // его методы
            smsNotifier.notifyUser(jack, "г. Москва");
            smsNotifier.notifyUser(alex, "г. Москва");
            smsNotifier.notifyUser(john, "г. Москва");
        }

        if (typeOfNotifier.equals("EMAIL")) {//Если он ввел EMAIL, то мы шлём ему почту
            EmailNotifier emailNotifier = new EmailNotifier(); //Создали экземпляр класса emailNotifier и ниже
                                                              // вызвали его методы
            emailNotifier.notifyUser(jack, "г. Москва");
            emailNotifier.notifyUser(alex, "г. Москва");
            emailNotifier.notifyUser(john, "г. Москва");
        }

        if (typeOfNotifier.equals("ТЕЛЕГА")) {//Если он ввел ТЕЛЕГА, то мы шлём ему в телеграмм
            TelegramNotifier telegramNotifier = new TelegramNotifier(); //Создали экземпляр класса emailNotifier
                                                                        // и ниже вызвали его методы
            telegramNotifier.notifyUser(jack, "г. Москва");
            telegramNotifier.notifyUser(alex, "г. Москва");
            telegramNotifier.notifyUser(john, "г. Москва");
        }

        // Далее смотрим как работает наш код в терминале. В нем появилось  "Куда вам отправлять уведомления?
        // СМС/EMAIL/ТЕЛЕГА" Т.к. после надписи ничего нет, т.е. программа не закончена, мы вводим в терминале
        // поочередно СМС/EMAIL/ТЕЛЕГА и нажимаем enter. В ответ нам приходит куда прибыл наш товар.
        // Всё хорошо, но по прежнему много повторяющегося кода и мы можем совершить ошибку. Джека отправить
        // в Самару, хотя нужно в Москву. Это не правильно и от этого нужно избавляться. Мы должны удалить
        // повторяющийся код

        Notifier notifier; // У нас будет какой то объект, который реализует notifier

        if (typeOfNotifier.equals("СМС")) {//Если человек сказал СМС, значит смс
            notifier = new SmsNotifier();
        } else if (typeOfNotifier.equals("EMAIL")) {//Если человек сказал EMAIL, значит EMAIL
            notifier = new EmailNotifier();
        } else if (typeOfNotifier.equals("VIBER")) {//Если человек сказал EMAIL, значит VIBER
            notifier = new ViberNotifier();
        } else {                                    // Если человек ничего не сказал, что то другое значит Telegram
            notifier = new TelegramNotifier();
        }

        notifier.notifyUser(jack, "г. Москва");
        notifier.notifyUser(alex, "г. Москва");
        notifier.notifyUser(john, "г. Москва");
    }
}
        // Код теперь стал короткий, красивый