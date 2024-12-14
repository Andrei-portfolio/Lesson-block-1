package Лекция132111.СonstantFinal;

public class Kinopoisk {

    public static void main(String[] args) {

    Movie movie1 = new Movie("1+1", "Comedy");// Комедия
    Movie movie2 = new Movie("Интрерстеллар", "Fantastic");//Фантастика
    Movie movie3 = new Movie("Фоллаут", "Sci-Fi");//Научная Фантастика
    Movie movie4 = new Movie("Звездные войны", "Science-Fiction");//Научная Фантастика
    Movie movie5 = new Movie("Звездные путь", "Sciece-Fiction");//Научная Фантастика

    /*
    Какая здесь проблема. Мы допустим создали 2 фильма  "1+1" и "Интрерстеллар". Приходит другой
    разработчик и говорит, хочу добавить "Фоллаут". Приходит ещё один и добавляет "Звездные войны".
    Получается, у нас есть 3 фильма и у всех разный жанр (Fantastic, Sci-Fi, Science-Fiction). Ещё один
    приходит, создает "Звездные путь" и в жанре допускает ошибку "Sciece-Fiction". По итогу мы хотим
    подвести итоги и посчитать сколько у нас фильмов жанра "Научная фантастика". Если будем считать
    "Science-Fiction", то один. Если "Sci-Fi" тоже один. "Sciece-Fiction" - один. А эти ошибки стали
    возможными быть, так как у нас нет ограничений. И каждый приходит и пишет что захочет

     Самый простой вариант привести к единобразию. Создадим метод "GenreClass". Где создадим пару
     статичных методов SCI_FI и СOMEDY. После чего наш код переделаем следующим образом:
     */
        //GenreClass.SCI_FI= "Сай Фай";
        Movie movie11 = new Movie("1+1", GenreClass.СOMEDY);// Комедия
        Movie movie22 = new Movie("Интрерстеллар", GenreClass.SCI_FI);//Фантастика
        Movie movie33 = new Movie("Фоллаут", GenreClass.SCI_FI);//Научная Фантастика
        Movie movie44 = new Movie("Звездные войны", GenreClass.SCI_FI);//Научная Фантастика
        Movie movie55 = new Movie("Звездные путь", GenreClass.SCI_FI);//Научная Фантастика
/*
Теперь, когда придёт новый разраб., он возможно увидит как другие использовали класс жанра GenreClass.
И создаст также.

НО ЗДЕСЬ ТОЖЕ ПРОБЛЕМА ЕСТЬ. МОЖЕТ ПРИДТИ новый разработчик и ему не понравится название жанра SCI_FI.
Он возьмёт и одной строчкой поменяет, прописав перед нашей коллекцией фильмов следующий
 код: GenreClass.SCI_FI= "Сай Фай";
 */
        System.out.println(movie55.getGenre());// После измены кода, в терминале выдаст "Сай Фай"

/* Так вот, чтобы такого не было, чтобы никто не смог изменить наш жанр, мы в классе GenreClass в нашем
статичном методе допишем слово final, т.е. ФИНАЛЬНОЕ ЗНАЧЕНИЕ, т.е. ЕГО ИЗМЕНИТЬ НЕЛЬЗЯ. т.е. КАКИМ ЕГО
ЗАДАЛИ, ТАКИМ ОНО И ОСТАНЕТСЯ. ПО СУТУ ЭТО КОНСТАНТА.

и ВОТ ТЕПЕРЬ, ЕСЛИ РАСКОМИТИТЬ ВЫШЕ КОД GenreClass.SCI_FI= "Сай Фай";, ОН СРАЗУ ВЫДАСТ ОШИБКУ

 Данное слово final можно использовать не только с полями, но и методами, классами т.д.
 */

        Movie2 movie111 = new Movie2("1+1", new GenreClass("СOMEDY", 1));// Комедия
        Movie2 movie222 = new Movie2("Интрерстеллар", new GenreClass("SCI_FI", 2));//Фантастика
        Movie2 movie333 = new Movie2("Фоллаут", new GenreClass("SCI_FI", 2));//Научная Фантастика
        Movie2 movie444 = new Movie2("Звездные войны", new GenreClass("SCI_FI", 2));//Научная Фантастика
        Movie2 movie555 = new Movie2("Звездные путь", new GenreClass("SCI_FI", 2));//Научная Фантастика
/*
Поначалу была ошибка, после такого кода, так как в конструкторе он ожидает String name и String genre. Но так как
 нам надо было записать всё в одну строку и добавить id, мы создали свой собственный тип данных GenreClass. И
 его мы будем ожидать в Movie. А значит, не String мы ожидаем, а GenreClass.
 НО после того, как в классе Movie2 (создал специально, чтобы не запутаться при повторном чтении кода)
 String genre заменим на GenreClass genre. И ошибка ушла
 */

        System.out.println(movie555.getGenre());// В терминале: GenreClass{name='SCI_FI', id=2}
    //Данный метод хорош, когда фильмов не много.

        /*После того, как String genre заменим на GenreClass genre(Заменили строку на свой жанр класс), мы опять вернусь
         к тому, что любой разработчик при добавлении  нового фильма укажет любой жанр, какой захочет, и любой id.
         Это потому что мы сломли наш код, и наша константа (final) в классе GenreClass стала неактивной.
          Т.е. откатились на шаг назад. Это сделали в связи с тем, чтобы можно было хранить несколько типов
          данных сразу. Поэтому необходимо доработать данную константу под наш новый код.
         Мы же ранее создали константу, чтобы люди пользовались, а свои не создавали. Или создавали в строгом
         логическом порядке. Поэтому будем пробовать восстановить эту констансту под наш новый код
          А для этого, заменим строку String на GenreClass в классе GenreClass3 (создал копию GenreClass, чтобы
          не путаться)
          */
        Movie3 movie1111 = new Movie3("1+1", GenreClass3.СOMEDY);// Теперь используем СOMEDY не как строку, а как целый класс
        Movie3 movie2222 = new Movie3("Интрерстеллар", GenreClass3.SCI_FI);//
        Movie3 movie3333 = new Movie3("Фоллаут", GenreClass3.SCI_FI);//
        Movie3 movie4444 = new Movie3("Звездные войны", GenreClass3.SCI_FI);//
        Movie3 movie5555 = new Movie3("Звездные путь", GenreClass3.SCI_FI);//

        /*
        Но здесь по-прежнему, разработчик может написать собственный жанр, например "Каля-баля". И от этого надо уходить.
         А для этого изменим наш конструктор, с public на private в классе GenreClass3. И это разработчику выдаст ошибку.
         Теперь он обязан использовать один из возможных жанров. Если этого не достаточно, то он зайдет в GenreClass3
         и создаст нужный класс по нашему образцу.
         */
        //Movie3 movie6666 = new Movie3("Звездные путь", new GenreClass3("Каля-баля", 244));//

        System.out.println(movie5555.getGenre());

        /*Всё хорошо, мы достигли своей цели, но наш код получился объемным в классе GenreClass3.
        Есть способ его сократить. С помощью специальный вид (разновидность) класса, которая называется перечисление,
        а на английском enums. Для этого создадим специальный класс simpleEnums. ОЧЕНЬ ВАЖНО: КОГДА МЫ БУДЕМ
        ЕГО СОЗДАВАТЬ, В NEW JAVA CLASS НУЖНО ВЫБРАТЬ НЕ CLASS, А ENUM. в ЭТОМ КЛАССЕ МОЖЕМ ПЕРЕЧИСЛЯТЬ ОБЪЕКТЫ
        ПРЯМ СРАЗУ

         */
    }
}
