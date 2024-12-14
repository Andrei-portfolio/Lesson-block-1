package Лекция111411.Records;

public class JustClass {

    public static void main(String[] args) {


        HumanR humanR = new HumanR("Запись", "email@ya.ru");
        System.out.println(humanR.email());
        System.out.println(humanR.name());

        /*МИНУСЫ record:
        1) Неизменяемый класс. Т.е. мы задали значения один раз и не можем их изменить. Это значит, что мы не
        можем сказать HumanR.setName(). Там нет такого.
        2) Если значения полей нужно будет поменять, нужно будет создавать новый объект. Т.е. записав следующее */

        humanR = new HumanR("Новая запись", "safasfa@ya.ru");
        System.out.println(humanR.email());
        System.out.println(humanR.name());

        /*У нас сохраниться новый объект, и он будет храниться по той же ссылке (переменной), но это будет
        уже новый объект.

        В классе record также можно создавать методы
         */
        humanR.saySmth();
    }
}

    // ДАЛЕЕ ПЕРЕХОДИМ К НОВОЙ ТЕМЕ ФУНКЦИОНАЛЬНЫЙ ИНТЕРФЕЙС
