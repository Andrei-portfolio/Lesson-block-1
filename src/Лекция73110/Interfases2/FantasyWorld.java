package Лекция73110.Interfases2;

// В этом класе создадим наших войнов

public class FantasyWorld {

    public static void main(String[] args) {

        Elf elf = new Elf();// Создай мне экземпляр интерфейса Warrior. т.е экземпляр класса Эльф, который
                            // скомплеметен в Warrio
        Dwarf dwarf = new Dwarf();
        elf.attack(100);
        dwarf.defend(50);

    }
}

    // Что нам даёт интерфейс? Договор, определенность что мы обязаны реализовать наши методы. Помогает не забыть