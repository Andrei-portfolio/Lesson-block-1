package Лекция52410;

import Лекция52410.CarTask.Car;

    // В ПРОДОЛЖЕНИИ К ПРЕДЫДУЩЕЙ ЛЕКЦИИ ПРО ОБЪЕКТЫ, КОНСТРУКТОР И Т.Д.
    //
    //Мы пришли к выводу, что некоторые данные мы не можем хранить, например в String или в int, double и т.д.
    // То есть типы переменных. Совершенно разные мы можем хранить числа, мы можем хранить дробные числа целые числа
    //строки Байты, логические перемены тру Фолс, да? Но если все это сразу, мы хотим хранить одновременно, чтобы
    //описать какую то сущность, чтобы описать какой то сложный объект. Например, машина, человек
    //Нам для этого с вами нужны сложные типы данных, сложные типы данных, это и есть наши классы.
    //
    //На примере класса Human вспомним. Мы задали ему поле: Целое число это возраст, стринг номер телефона и т.д.
    //И вспомним про конструктор. Зачем он нам нужен?
    //
    // 1) Чтобы это были обязательные поля
    // 2) Передает все параметры в одну строчку
    // 3) Мы ограничили и других разработчиков от ошибок. Связанных с тем, что мы забудем задать, например, имя
    //
    //Так для чего же мы пишем this?
    // this.name = name;
    //this.age = age;
    //this.phone = phone;
    //
    //А тем самым, мы как бы говорим. Этому человеку задай это имя, этому человеку задай этот возраст.
    //Ну а более сложное объяснение: Иначе компилятор не будет понимать, если name = name, age = age и т.д.
    //т.е. зачем одинаковые переменные приравниваем друг другу. Он не понимает. А когда мы пишем в конструкторе
    // this.name мы на самом деле обращаемся к нашим параметрам, заведенные в public class Human: String name;  int age;
    //
    //Так же в одном классе можно создавать несколько конструкторов и использовать в них РАЗНОЕ КОЛИЧЕСТВО ОБЯЗАТЕЛЬНЫХ
    // ПОЛЕЙ.
    //Вот на примере нашего Human
    //
    // public Human(String name, int age, String phone, String email, double reting) {;
    //    this.name = name;
    //    this.age = age;
    //    this.phone = phone;
    //    this.email = email;
    //    this.reting = reting;
    // }
    //
    // public Human(String name, String email) {;
    //    this.name = name;
    //    this.email = email;
    // }
    //
    //Вот так вот можно сделать 2 конструктора. И теперь МЫ вправе создавать человека как со всеми 5 полями сразу,
    // так и с 2.
    //
    // МАССИВЫ, МАССИВЫ, МАССИВЫ, МАССИВЫ, МАССИВЫ, МАССИВЫ, МАССИВЫ, МАССИВЫ, МАССИВЫ, МАССИВЫ
    //
    //Итак, мы уже с вами умеем создавать какие то Переменные.
    //
        public class Lesson4 {

    public static void main(String[] args) {

        int x = 5;
        long y = 1000L;
        String name = "Александр";

    // Но что нам делать, если мы хотим сохранить сразу несколько значений в 1 месте?
    //Имеется ввиду не несколько разных значений типа, как мы делали у человека имя. Имя, фамилия, номер телефона.
    //А какие то однотипные данные, которые хотим сохранить в 1 месте, чтобы они вот были рядышком.
    // И всегда можно обратиться к ним ко всем сразу либо взять то, что мне нужно. К Примеру массив оценок.

        double mark = 0.6;
        double mark1 = 0.7;
        double mark2 = 0.8;
        double mark3 = 0.9;
        double mark4 = 0.65;
        System.out.println(mark);
        System.out.println(mark1);
        System.out.println(mark2);
        System.out.println(mark3);

    // Так вот, чем больше оценок, тем больше будет занято места в программе. Приходится листать вниз, а это неудобно.
    // К тому же, если нужно будет вывести на экран все оценки сразу, нужно сказать Марк + Марк1 + Марк2 + Марк3 и т.д..

        //Проблема такой записи:
        // 1) слишком много строк кода.
        // 2) Неудобно работать с оценками, если мы их все хотим вывести на экран их все сразу
        // 3) Каждый раз нужно придумывать новое имя переменной. Лишняя работа
        // 4) Можно легко случайно потерять какие-то данные (mark7 или mark8)

        // ВОТ ДЛЯ ЭТОГО И СУЩЕСТВУЕТ МАССИВ
    //Массив создается Довольно просто мы пишем также тип данных, который нас интересует. Ставим скобочки.
    // КВАДРАТНЫЕ, повторюсь КВАДРАТНЫЕ (обозначение что у нас будет массив, что это не просто переменная. Не просто
        // какое то поле - это массив).


        double[] marks = new double[10]; // В нашем случае, 10 это количество оценок. А к слову mark добавляем s.
        // Получается marks

    // Массив — структура данных, хранящая набор значений (элементов массива), идентифицируемых по индексу или набору
        // индексов, принимающих целые значения из некоторого заданного непрерывного диапазона.
    //Простыми словами, массив это последовательность (массив) даных.

        marks[0] = 0.6; // Начинаем всегда с нуля (0, 1, 2, 3, 4,.....). В скобках приведены индексы массива
        marks[1] = 0.7;
        marks[2] = 0.8;
        marks[3] = 0.9;
        marks[4] = 0.65;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        //Преимущества массива:
        // 1)
        // 2) Не приходится везде писать double
        // 3) Каждый раз не нужно придумывать новое имя переменной. У нас все marks
        // 4) Данные теперь мы не можем забыть, потерять

        //Особенности массива:
        //1) Мы обязаны указать размер массива
        //2) Мы можем заполнить его в любой момент времени (сразу или потом)
        //3) Можем заполнить его в разном порядке и не полностью
        //4) Все элементы массива имеют один и тот же тип (например string, или double)

        marks[4] = 0.83; // Так же можно перезаписать значения. Выше   marks [4] = 0.65, а мы записали marks [4] = 0.83;

        //В консоль выйдет последнее заданное нами значение. Либо выйдет и первое, если мы запрашивали
        // Sout до перезаписи и второе Sout после перезаписи

        System.out.println(marks[4]);

        // Теперь закрепим и сделаем тоже самое для массива фруктов

        String[] fruits = new String[4];
        fruits[0] = "Яблоко";
        fruits[1] = "Банан";
        fruits[2] = "Апельсин";
        fruits[3] = "Мандарин";
        System.out.println(fruits[0] + " " + fruits[1] + " " + fruits[2] + " " + fruits[3]);

        //Если же допустим во fruits [3] уберем кавычки и подставим число fruits [3] = 23; то конечно же будет ошибка,
        // программа не запустится. String значит String, никаких чисел int.
        // Следующий второй вариант, как задаются массивы ещё. Проверим прям на фруктах

        String[] berry = new String[]{"Персик", "Абрикос", "Вишня", "Рябина"}; // Данный более лёгкий
        System.out.println(berry[0] + " " + berry[1] + " " + berry[2] + " " + berry[3]);

        // И наконец третий способ, самый приемлемый

        String[] vegetables = {"Морковь", "Капуста", "Свекла"};
        System.out.println(vegetables[0] + " " + vegetables[1] + " " + vegetables[2]);

        //Итак, в связи с тем, что java развивается, выше были представлены три способа создания массива.
        // Первый отличается от остальных тем, что в нём есть размер возможных значений, т.е. можно указать границу
        // массива и больше этой границы в массиве, поставить нельзя будет.
        // Иначе ошибка. Допустим поставим пользователю в массиве ограничение по количеству товара в корзину. Допустим,
        // 30 иначе мы больше привезти не сможем.

        // Отмечено, что массив это не самый удобный тип, но самый простой. Хорош когда нужен простой перебор, когда не
        // очень много значений. Про более удобный тип "Списки" мы поговорим позже. Знание массивов потом поможет
        // разобраться со списками

        // Теперь рассмотрим как в МАССИВЕ ХРАНИТЬ ОБЪЕКТЫ нашего класса на примере смартфона из третьего урока. Так
        // как на компе не было созданного класса смартфон, создал его заново. К обязательным параметрам выбрал брэнд
        // и модель. Т.е. в данном случае, так как мы хотим хранить в массиве объект класса, то необходимо создать
        // класс, так как мы делали на пред. ураках и сделать конструктор.

        //        public class Smartphone {
        //
        //            String brand;
        //            String model;
        //            String screen;
        //            int coreNumber;
        //            int capasity;
        //
        //Создание конструктора с двумя обязательными параметрами:

        //            public Smartphone(String brand, String model) {
        //            this.brand = brand;
        //            this.model = model;

        // При создании массива (см. ниже) мы вместо double или string, как писали выше подставляем наш класс
        // Smartphone

        //          double[] shop = new double[3];
        //          shop[0] = 2.5;
        //          shop[1] = 3;
        //          shop[2] = 5;

        // Обратить вниманее, что при вводе первых букв слова Smartphone у нас появляется данный класс в списке для
        // выбора. Причем, так как у нас два такиих класса (ЛЕКЦИЯ 3 и ЛЕКЦИЯ4) их обоих предлагает для выбора. Далее,
        // если мы сделали всё правильно и ранее создали наш класс и конструктор Smartphone, то во второй строке в
        // круглых скобках, при нажатии на квычки, появятся наши обязательные параметры brand и model поочереди,
        // останется только вбить значения.

        Smartphone[] shop = new Smartphone[3]; // Тутмы говорим, что у нас будет храниться 3 экземпляра класса
        // Smartphone, а ниже перечисляем какие

        shop[0] = new Smartphone("iPhone", "15");
        shop[1] = new Smartphone("iPhone", "15 Pro");
        shop[2] = new Smartphone("iPhone", "15 Pro Max");

        // ВАЖНО!!! Тем самым МЫ ДОБАВИЛИ В МАССИВ НЕ КЛАСС, А ОБЪЕКТ КЛАССА. Объект "iPhone15 Pro Max" класса
        // Smartphone, Объект "iPhone15 Pro Max" класса Smartphone, и т.д.

        //Далее в консоли проверим, всё ли у нас получилось. Выберем любой из наших shop, например shop[2] и через
        // точку то что мы хотим увидеть brand или model.

        System.out.println(shop[2].brand + shop[2].model); // Ну а здесь мы обращаемся к смартфону через массив
        System.out.println(shop[1].brand + shop[1].model);
        System.out.println(shop[0].brand + shop[0].model);

        //Закрепим с помощью задачки
        // Создать массив books. Тип данных в массиве – строка; Поместить 3 книги (строки) в массив ;

        String[] books = {"Философия", "История", "География"};
        System.out.println(books[0] + " " + books[1] + " " + books[2]);

        //Ещё одна задача
        //        Создать класс Car;
        //        Создать массив garage;
        //        Поместить 5 автомобилей в гараж;

        //ИТАК, в отдельной вкладке создадим класс и вызовим конструктор к нему
        //
        //        public class Car {
        //
        //            int price;
        //            String brand;
        //
        //            public Car(int price, String brand) {
        //                this.price = price;
        //                this.brand = brand;
        //
        Car[] garage = {
                new Car(1000000, "BMW"),
                new Car(900000, "Mazda")
        }; //Обратить внимание на точку с запятой после фигурных скобок

        //        System.out.println(garage[0].brand);
        //        System.out.println(garage[1].brand);
    }
}










