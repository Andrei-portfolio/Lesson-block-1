package Домашка4.МаскировкаКарты;

//1. Маскировка карты 2.0
//        ● Создайте класс Card
//● У класса должны быть поля:
//○ номер
//○ срок годности
//○ cvv
//○ pinCode
//● Поля класса должны задаваться через конструктор
//● Опишите в классе метод, который печатает номер карты в формате "****
//        **** **** 3456"
//● Опишите в классе метод, который принимает на вход пин-код. Если
//переданный пин-код совпал с пин-кодом карты, напечатать в консоль
//номер карты без маски (все цифры)
//● Создайте класс MyProgram + метод psvm
//○ В методе создайте новую карту
//○ Вызовите сначала метод печати с маской
//○ Потом метод печати с пин-кодом
//○ Убедитесь, что нельзя получить никакие данные карты напрямую
//через поля (используйте private)

public class Card { //Создаём класс Card полями номер, срок годности, cvv, pinCode

    private String number;
    private String pinCode;
    private String expirationDate;
    private int cvv;

    public Card(String number, String pinCode, String expirationDate, int cvv) {
        this.number = number;
        this.pinCode = pinCode;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    //Создаём метод который печатает номер карты в формате "**** **** **** 3456"

    public String getNumber() {
        return "**** **** **** " + this.number.substring(this.number.length() - 4);
    }

    //Опишем в классе метод, который принимает на вход пин-код. Если переданный пин-код совпал с пин-кодом карты,
    //напечатать в консоль

    public String getNumber(String pinCode) {
        if (pinCode.equals(this.pinCode)) {
            return this.number;
        } else {
            return "Пинкод неверный";
        }
    }
}