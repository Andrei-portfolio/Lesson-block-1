package Лекция132111.ClassesOOP2;

public class SuperAdmin extends Admin {// Т.Е. БЕЗ ПРОБЛЕМ МОЖЕМ СОЗДАТЬ ЕЩЁ ОДИН КЛАСС, КОТОРЫЙ БУДЕТ
    // НАСЛЕДОВАТЬ ОТ Admin. НУ А Admin КАК МЫ ПОМНИМ, НАСЛЕДУЕТСЯ ОТ User.
    // Т.Е У НАС В SuperAdmin БУДЕТ ВСЁ ТОЖЕ САМОЕ, ЧТО И у Admin, и всё тоже самое что и у User. ПОЛУЧАЕТСЯ
    //Admin для SuperAdmin будет родителем, а User дедушкой

    public SuperAdmin(String name, int id, String token) {
        super(name, id, token);
    }
}