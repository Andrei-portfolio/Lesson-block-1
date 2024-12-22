package Лекция152811.AbstractClasses;

public class Banana extends Fruit{


    public Banana() {
        color = "yellow";

    }

    @Override
    public int getPrice() {//Появилось, после того, как имплементировали данный класс
        return 0;
    }
}
