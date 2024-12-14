package Лекция132111.GenreEnums;

public enum GenreEnum {
    SCI_FI("SCI_FI", 2),
    СOMEDY("Сomedy", 1),
    ACTION("Action", 3),
    HORROR("Horror", 4);

    /*  Мы перечислили. Если больше придумать не можем, ставим точку с запятой и делаем как обычно, поля,
 конструктор, геттер, тустринг. Далее, чтобы не было ошибки, нужно создать параметры ("SCI_FI", 2) и т.д.
 Далее в отдельный класс Movie4 скопирую класс Movie3 и изменю в нём GenreClass3 на GenreEnum. Далее перейдем
  */

    private String name;// Сначала зададим поля

    private int id;// Сначала зададим поля

    GenreEnum(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "GenreEnum{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
