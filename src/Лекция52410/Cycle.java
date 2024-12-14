package Лекция52410;

public class Cycle {

    public static void main(String[] args) {

        //ЦИКЛЫ ЦИКЛЫ ЦИКЛЫ

        //На примере циклов рассмотрим наши Smartphone. Практика приведенная выше показывает, что даже при
        // наличии 5 строк по смартфонам, получается приличная портянка. А если там будет не 2 параметра,
        // а дабавим ещё один "Размер экрана", или более? Нужно будет везде делать изменения и в классе,
        // в конструкторе, в массиве и для вывода в консоль конечно. А это в свою очередь не только громозко,
        // но ещё легко запутаться и забыть что то изменить. Если мы посмотрим, на наши данные то в принципе
        // в них всё одинаково, за исключением цифр.
        //
        // System.out.println(shop[0].brand + " " + shop[0].model + " " + shop[0].screen);
        // System.out.println(shop[1].brand + " " + shop[1].model+ " " + shop[1].screen);
        // System.out.println(shop[2].brand + " " + shop[2].model+ " " + shop[2].screen);
        // System.out.println(shop[3].brand + " " + shop[3].model+ " " + shop[3].screen);
        // System.out.println(shop[4].brand + " " + shop[4].model+ " " + shop[4].screen);
        //
        // Итак примем i=0 и подставим в данные для вывода в консоль. Т.е. заменим наши цифры на i. И так будем
        // делать с каждой строкой

        // int i = 0; //0
        // System.out.println(shop[i].brand + " " + shop[i].model+ " " + shop[i].screen);// Первая итерация

        // i = i+1;// Т.е. 0+1 = 1
        // System.out.println(shop[i].brand + " " + shop[i].model+ " " + shop[i].screen); Вторая итерация

        // i = i+1;// Т.е. 1+1 = 2
        // System.out.println(shop[i].brand + " " + shop[i].model+ " " + shop[i].screen); Третья итерация

        // i = i+1;// Т.е. 2+1 = 3
        // System.out.println(shop[i].brand + " " + shop[i].model+ " " + shop[i].screen); Четвертая итерация

        // i = i+1;// Т.е. 3+1 = 4
        // System.out.println(shop[i].brand + " " + shop[i].model+ " " + shop[i].screen); Пятая итерация

        // Что нам это дало? Теперь все строчки у нас одинаковые. Кроме того, у нас везде i = i+1. Поэтому мы всё
        // можем заменить с помощью цикла. Самое простое объяснение цикла - это повторение, бег вокруг стадиона.
        // Если будет 5 кругов, то это по сути 5 циклов, или 5 ИТЕРАЦИЙ. Со смартфонами у нас тоже получилось
        // 5 итераций. Как же нам всё это заменить с помощью цикла? Цикл записывается с помощью "for"

        // for () //Переводится как для. Для чего? Длякакой то переменной.Здесь необходимо создать какой то
        // счетчик для данной переменной. Который позволяет посчитать сколько мы кругов пробежали и сколько
        // нам ещё пробежать.В нашем случае со смартфонами, начинаем с самого первого нулевого смартфона

//      for (int i = 0; i < 5; i = i + 1) {
//
//        System.out.println("Я бегу круг");
//        System.out.println(i);

        //}

        // Ставлю точку с запятой и говорю сколько кругов бежать буду? А бежать будем пока i меньше 5, не включая 5.
        //После этого мы говорим, что i необходимо увеличивать на еденичку.
        // Проще говоря, говорим создай переменную i = 0. Пока она меньше 5 - увеличивай её на 1. Далее мы ставим
        // фигурную скобку и говорим, что мы хотим делать эти 5 кругов.
        //
        // Ещё раз, как работает наш цикл. Сначала мы говорим, создай переменную i = 0. Создаёт. Далее программа
        // проверяет i < 5? Конечно 0 < 3. Значит мы можем выполнить вот этот блок:
        //
//      System.out.println("Я бегу круг");
//      System.out.println(i);
        //
        // Мы его выполняем. И вот только теперь возвращаемся в операцию i = i + 1. Т.е. первый цикл с i=0
        // закончился, мы его больше не делаем. теперь i у нас равно 0+1 = 1. Мы получается её увеличили на 1.
        // Проверяем 1 меньше 5. Да меньше. Выполняем блок и идем опять в конец i = i + 1.
        // Когда же доходим до 4+1 = 5. Идёт проверка 5 < 5. Нет не больше. Цикл прерывается.
        //
        //Вернёмся в наш магазин смартфонов и сделаем тоже самое. Скопировал выше, а там закомитил.

        Smartphone[] shop = new Smartphone[5];

        shop[0] = new Smartphone("iPhone", "15", "100*200");
        shop[1] = new Smartphone("iPhone", "15 Pro", "150*200");
        shop[2] = new Smartphone("iPhone", "15 Pro Max", "200*300");
        shop[3] = new Smartphone("Samsung", "Galaxy s21", "250*400");
        shop[4] = new Smartphone("Samsung", "Galaxy s21", "300*100");

        for (int i = 0; i < 5; i = i + 1) {

            System.out.println(shop[i].brand + " " + shop[i].model + " " + shop[i].screen);

        // Получается с помощью цикла мы упростили себе задачу и вместо 5 строчек

            // System.out.println(shop[0].brand + " " + shop[0].model + " " + shop[0].screen);
            // System.out.println(shop[1].brand + " " + shop[1].model+ " " + shop[1].screen);
            // System.out.println(shop[2].brand + " " + shop[2].model+ " " + shop[2].screen);
            // System.out.println(shop[3].brand + " " + shop[3].model+ " " + shop[3].screen);
            // System.out.println(shop[4].brand + " " + shop[4].model+ " " + shop[4].screen);

            // Вместо 5 написали всего одну

//            for (int i = 0; i < 5; i = i + 1) {
//            System.out.println(shop[i].brand + " " + shop[i].model + " " + shop[i].screen);

            //ВОПРОС от ИЛЬНАРА. Почему SOUP мы пишем в фигурных скобках
            //Когда мы создаём счётный цикл for, мы должны ему сказать. Т.е. цикл нам нужен для чего, повторить
            // действие столько раз сколько нам нужно. for это счетный цикл. Мы сказали ему сделай это 5 раз.
            // 5 раз что? А то что находится в фигурных скобках. Без них программа не поняла бы, что нужно
            // делать 5 раз. С помощью фигурных мы объясняем, что в них, то и делай 5 раз. А дальше как
            //фигурная скобка кончилась, продолжается программа.

            // И последний момент. Какждый раз, на нашем примере количество смартфонов может меняться. И чтобы
            // нам не приходилось каждый раз менять это значение в 2х местах Smartphone[] shop = new Smartphone[5];
            // и for (int i = 0; i < 5; i = i + 1), потому в случае i < 5 заменим данную запись следующим образом
            // i < shop.length. Это длина массива. Мы можем обратиться к массиву и сказать получи его длинну.
            // Соответственно, по итогу сколько у нас будет значений в массиве, столько и будет всего выводится.
            // Проще говоря shop.length используем в массиве, чтобы самим не пришлось счетать сколько там
            // элементов. Она автоматически подставляет длину массива

        }
    }
}
