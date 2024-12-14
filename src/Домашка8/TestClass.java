/*Создайте класс Player. Скопируйте ссылка
● Создайте класс PlayerServiceJSON. Класс должен имплементировать
методы интерфейса PlayerService ссылка
● Программа должна сохранять свое состояние в файл формата JSON
● Все изменения коллекции сохраняются в файл (файл перезаписывается)
● Создайте класс TestClass. В нем метод psvm пример
● В методе создайте экземпляр класс
PlayerService service = new PlayerServiceJSON();
● Протестируйте методы сервиса. Убедитесь, что все изменения
сохраняются (или удаляются) в файле
2. СО ЗВЕЗДОЧКОЙ. Сервис игроков (XML)
● Все то же самое, только создайте класс PlayerServiceXML.
● "Черный ящик" (логика) вся та же
PlayerService service = new PlayerServiceXML();
 */

package Домашка8;

import java.util.Collection;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {

        PlayerService service = new PlayerService() {
            @Override
            public Player getPlayerById(int id) {
                return null;
            }

            @Override
            public Collection<Player> getPlayers() {
                return List.of();
            }

            @Override
            public int createPlayer(String nickname) {
                return 0;
            }

            @Override
            public Player deletePlayer(int id) {
                return null;
            }

            @Override
            public int addPoints(int playerId, int points) {
                return 0;
            }
        };

        // Создаем игрока
        int playerId = service.createPlayer("WinMaster_777");

        // Добавляем очки игроку
        service.addPoints(playerId, 100);

        // Получаем список игроков и выводим их на экран
        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }

        // Удаляем игрока
        service.deletePlayer(playerId);

        // Проверяем список игроков после удаления
        players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
