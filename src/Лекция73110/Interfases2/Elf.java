package Лекция73110.Interfases2;

public class Elf implements Warrior {//Эльф имплементируется в Warrior. Направив курсор например на Warrior,
    // нам предложено имплементировать 3 наших метода. Соглашаемся, нажимаем и готово.

    //Суть интерфейса в том, что мы никогда не забудем создать метод attack, метод defend и т.д. Потому что мы их
    //имплементировали и программа выдаст ошибку.

    private int hp;//Создадим одно поле в классе

    @Override
    public void attack(int damage) {
        System.out.println("Атакуем с силой " + damage);
    }

    @Override
    public void defend(int powerDefense) {
        System.out.println("Защищаемся с силой " + powerDefense);
    }

    @Override
    public void heal(int addHp) {
        this.hp += addHp;
    }

    //Также мы можем создавать свои необязательные методы. Добавить
    // какие то свои поля

    public void makeWeapon() {
        System.out.println("Я создал этот прекрасный меч");
    }

}
