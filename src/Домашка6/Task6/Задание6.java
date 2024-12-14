package Домашка6.Task6;

        //6. Турнирная таблица
        //● В задании 1 вы создали класс Player
        //● Создайте Map<Player, Integer> points для хранения очков игроков
        //● Положите в мэпу 10 игроков. У каждого 0 очков.
        //● Игроку с id=4 запишите 10 очков
        //● Игроку с id=7 – 12 очков
        //● Игроку с id=8 – 11 очков
        //● Игроку с id=9 – 13 очков
        //● Игроку с id=10 – 5 очков
        //● Выведите на экран 3х лучших игроков турнира*
        //● На первом месте должен быть игрок с максимальным результатом

import Домашка6.Task1.Player;

import java.util.*;

import static javax.swing.UIManager.put;

public class Задание6 {

    public static void main(String[] args) {

        Map<Player, Integer> points = new HashMap<>();{{

            put(new Player(1,"Nick 1111"),0);
            put(new Player(2,"Nick 2222"),0);
            put(new Player(3,"Nick 3333"),0);
            put(new Player(4,"Nick 4444"),0);
            put(new Player(5,"Nick 5555"),0);
            put(new Player(6,"Nick 6666"),0);
            put(new Player(7,"Nick 7777"),0);
            put(new Player(8,"Nick 8888"),0);
            put(new Player(9,"Nick 9999"),0);
            put(new Player(10,"Nick 0000"),0);

            points.put(new Player(4, "Nick 4444"),10);
            points.put(new Player(7, "Nick 7777"),12);
            points.put(new Player(8, "Nick 8888"),11);
            points.put(new Player(9, "Nick 9999"),13);
            points.put(new Player(10, "Nick 0000"),5);


            List<Map.Entry<String, Integer>> list = new ArrayList<>((Collection) points.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            for (int i = 0; i < Math.min(3, list.size()); i++){
                Map.Entry<String, Integer> entry = list.get(i);
                System.out.println(entry.getValue());
                }
            }
        }
    }
}
