package Лекция73110.homework;

public class Card {
    private String number;
    private String pinCode;

    public Card(String number, String pinCode) { // У нас будет передоваться какой то номер number строки String
        this.number = number;
        this.pinCode = pinCode;
    }

    //Создаём метод который печатает номер карты в формате "**** **** **** 3456"

    public String getNumber() {
        return "**** **** **** " + this.number.substring(this.number.length() - 4);

        // Прочитаем данный код. Мы говорим возьми (return) этот номер (this.number - "2222 3333 4444 5555") и обрежь
        // строку (substring) и оставь от этой строки (this.number) всё что начинается с такого вот индекса
        // или последние 4 символа с конца  (length() - 4)

    }

//      public String getNumber (String pinCode){// Одинаковые методы создавать нельзя, но можно создавать одинаковые
//      методы с разными параметрами. Так и сделаем, передадим в методе pinCode. Теперь ошибки в методе нет. И в
//      итоге у нас есть два getNumber. Один из них просто возвращает зашифрованную строку. А другой метод,
//      ещё и принимает на вход pinCode.

//        return "**** **** **** " + this.number.substring(this.number.length() - 4);
//    }

//      Теперь в соответствии с требованием домашнего задания напишем программу, которая напечатает в консоль
//      номер карты без маски (все цифры), если переданный пин-код совпал с пин-кодом карты. А для этого, в
//      классе Card создадим метод с условными операторами if и else.

    public String getNumber(String pinCode) {
        if (pinCode.equals(this.pinCode)) {
            return this.number;
        } else {
            return "Нифига не угадал. Пинкод неверный";
        }
    }
}
