package Лекция121911.ClassesOOP1;

public class Admin extends User {// Использовали принцип наследования (extends User), чтобы избавиться от повтора кода.
    // Мы говорим, наследуйся/расширь класс Admin от User. После этого, всё что было в User можно не писать
    // в Admin. А повторяющийся код, в классе Admin удалим. КЛАСС НАСЛЕДНИК

    private String token;

    public Admin(String name, int id, String token) {// Админ это по сути такой же User, только бьльше прав
        super(name, id);
        this.token = token;
        System.out.println("Это конструктор админа");
    }
    /*НО ВАЖНЫЙ МОМЕНТ, чтобы код работал нужно в классе Admin создать конструктор, где у нас появится super, например
    super (name, id). Что означает, ВЫЗОВ родительского конструктора, такой как в User. Далее мы можем дописать
    какие то свои поля, н*/

    public void ban() {// Написали метод, который банит. Это отличие от родительского класса
        System.out.println("Я тебя забанил");
    }

    public void unban() {// Написали метод, который разбанит. Ещё одно отличие от родительского класса
        System.out.println("Я тебя разбанил");
    }

    public void unban1() {
        System.out.println("Я тебя разбанил");
    }
}




