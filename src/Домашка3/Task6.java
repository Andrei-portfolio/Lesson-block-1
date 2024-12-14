//6. Топ-3 игроков
//        ● создайте массив строк (размер 10)
//        ● запишите в него 10 имен
//        ● в цикле выведите на экран только первых трех игроков


package Домашка3;

public class Task6 {

    public static void main(String[] args) {

        String[] name = new String[10];
        name[0] = "Алексей";
        name[1] = "Андрей";
        name[2] = "Дмитрий";
        name[3] = "Кирилл";
        name[4] = "Сергей";
        name[5] = "Иван";
        name[6] = "Петр";
        name[7] = "Александр";
        name[8] = "Алексей";
        name[9] = "Евгений";


        String[] name2 = new String[]
                {"Алексей", "Андрей", "Дмитрий", "Кирилл", "Сергей", "Иван", "Петр", "Александр", "Алексей", "Евгений"};

        String[] name3 = {"Алексей", "Андрей", "Дмитрий", "Кирилл", "Сергей", "Иван", "Петр", "Александр", "Алексей", "Евгений"};


        //   System.out.println(name[0] + " + " + name[1] + " + " + name[2] + " + " + name[3] + " + " + name[4] + " + " + name[5]
        //   + " + " + name[6] + " + " + name[7] + " + " + name[8] + " + " + name[9]);

        int number;
        for (number = 0; number < 3; number++) {
            System.out.println(number + ". " + name3[number]);

        }
    }
}













