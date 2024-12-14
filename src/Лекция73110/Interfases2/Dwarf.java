package Лекция73110.Interfases2;

public class Dwarf implements Warrior {// Гном имплементируется в Warrior. Направив курсор например на Warrior,
    // нам предложено имплементировать 3 наших метода. Соглашаемся, нажимаем и готово. Не будем замарачиваться,
    // методы и их содержимое будут повторяться с Эльфами

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
}
