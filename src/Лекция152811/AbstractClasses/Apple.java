package Лекция152811.AbstractClasses;

public class Apple extends Fruit{

    public Apple() {
        color = "green";
    }

    @Override
    public int getPrice() {//Появилось, после того, как имплементировали данный класс
        return 0;
    }
}
