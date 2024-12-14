package Лекция62910;


// public и private - это модификатор доступа

public class Human { // Делаем наши поля приватными, и теперь мы не можем нигде кроме этого класса к ним обращаться.
    // Только здесь мы сможем с ними работать. И поэтому тем самым мы убираем возможность работать
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

    public Human(String name, int age, String phone) { //У нас есть публичный метод public.Т.е. что мы этот объект
        // можем создавать в другом классе. Например в World
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Human(String jack, int i) {
    }

    // НИЖЕ ПРЕДСТАВЛЕНО СОЗДАНИЕ МЕТОДА БЕЗ ПРИМЕНЕНИЯ УСЛОВНЫХ ОПЕРАТОРОВ, чтобы не запутать нас. Ну а далее с
    // применением условных операторов

    //    public void getOlder (){ //У нас есть публичный метод public.Т.е. публичный означает, что мы этот объект
    //        // можем создавать в другом классе. Например World (getOlder в переводе взрослеть).
    //        // void это ключевое слово, которое означает, что наш метод ничего не возращает
    //        // this.age += 1;                           // К нашей переменной прибавляем 1.
    //        System.out.println("У меня день рождения!!!"); // Также выведем в терминал, что джек повзрослел.


    // НИЖЕ ПРЕДСТАВЛЕНО СОЗДАНИЕ МЕТОДА С ПРИМЕНЕНИЕМ УСЛОВНЫХ ОПЕРАТОРОВ if и else
    public void getOlder() { //
        if (this.age < 125) // Ставим ограничение на max возраст. Если нашему человеку сейчас меньше 125 лет, то мы
        // переходим ниже и спомощью  this.age прибавляем 1
        {
            this.age += 1;                                  // К нашей переменной прибавляем +1.
            System.out.println("У меня день рождения!!!"); // Также выведем в терминал, что джек повзрослел.
        } else {
            System.out.println("Вы достигли границы возраста");
        }
    }

    public void showMyAge() // showMyAge выглядит не очень корректно. На самом деле мы должны создать ГЕТТЕРЫ,
    // от слова GET получить данные. Это методы, которые просто РАЗРЕШАЮТ возвращать данные, допустим у которых
    // МОДИФИКАТОР ДОСТУПА private. Создавать их очень просто, как делали конструктор. Правой кнопкой мыши, далее
    // Generate. Затем Getter и выбираем нужные поля, которые мы хотим получить. В основном разработчики ставят
    // private, но на момент создания класса, с помощью созданных Getter разрешают просматривать поля и значения

    {
        System.out.println(this.age);
    }

    public int getAge() { // int это тип возвращаемого значения
        return age; // return означает вернуть значение. Что значит вернуть. Что этот метод делает?
    }

    public String getName() { // String это тип возвращаемого значения
        return name; //return означает вернуть значение. Что значит вернуть. Что этот метод делает?
    }

    public String getPhone() {
        return phone;
    }

    // СЕТТЕРЫ или Setter это методы, которые не получают данные, а задают их. Т.е. на примере имени разрешают менять
    // его так, как хотим. Вот пример самого простого Setter без применения условных оператов if и else

    public void setPhone(String phone) {// Обратить вниманее, что в сеттере мы пишем не return, а this
        this.phone = phone; // Кроме того, в данной вкладке Human для phone нужно создать Getter, как сделал это выше.
        // Иначе во вкладке World при вызове терминала Sout будет ошибка
    }
}














