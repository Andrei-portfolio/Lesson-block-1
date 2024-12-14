package Лекция132111.GenreEnums;

public class Kinopoisk1 {

    public static void main(String[] args) {

        Movie movie1 = new Movie("1+1", GenreEnum.СOMEDY);
        Movie movie2 = new Movie("Интрерстеллар", GenreEnum.SCI_FI);
        Movie movie3 = new Movie("Фоллаут", GenreEnum.SCI_FI);
        Movie movie4 = new Movie("Звездные войны", GenreEnum.SCI_FI);
        Movie movie5 = new Movie("Звездные путь", GenreEnum.SCI_FI);

        /*
Подведём итоги, Enum это нужная штука, когда у нас много полей, например 4 более. Кроме того, когда на проекте
много разработчиков, и каждый будет делать по своему, кто то енамы создаст, кто то константы и т.д. Но все
 должны работать сообща
         */
//        Movie movie6666 = new Movie("Звездные путь", new Genre("Каля-баля", 244));//


        System.out.println(movie1.getName());
        System.out.println(movie5.getGenre());

    }
}
