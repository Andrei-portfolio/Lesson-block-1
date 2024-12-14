package Лекция73110.Продолжение;


// public и private - это модификатор доступа

public class Human { // Делаем наши поля приватными, и теперь мы не можем нигде кроме этого класса к ним
    // обращаться. Только здесь мы сможем с ними работать. И поэтому тем самым мы убираем возможность работать
    // с данными классами, например в классе world. Чтобы работать с ними, с полями, нужно заменить
    // на public
    private String name; // Имя
    private int age; // Возраст
    private String phone; // Телефон
    private String email; // Эл. адрес
    private double reting; // Рейтинг


    public Human(String name, int age, String phone, String email, double reting) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.reting = reting;
    }

    public Human(String name, int age) { //У нас есть публичный метод public.Т.е. что мы этот объект можем
        // создавать в другом классе. Например в World
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }


    // НИЖЕ ПРЕДСТАВЛЕНО СОЗДАНИЕ МЕТОДА по подсчету суммы чисел, по типу мини калькулятора. Или типо наш
    // человек может складывать два числа

    // Начальный вариант
    //    public void summa () {
    //        int x = 4545545 + 35354534;
    //        System.out.println(x);
    //    }

    // Первый вариант
    public int summa() {
        int x = 4545545 + 35354534;
        System.out.println(x);

        return x; // обозначает верни x
    }

    //Второй вариант
    public int summa(int firstNumber, int secondNumber) { // int мы пишем тот тип данных которые хотим вернуть
        return firstNumber + secondNumber; // верни сумму этих двух чисел
    }
}














