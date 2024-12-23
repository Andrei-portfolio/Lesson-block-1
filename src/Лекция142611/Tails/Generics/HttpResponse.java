package Лекция142611.Tails.Generics;

import java.util.Map;

/*Например, мы тестируем API запросы или ответы по какому-то сервису покупателей. И нам нужно получить
какой-то ответ response. Но его нужно где-то хранить, поэтому создадим класс HttpResponse.
У ответа есть три параметра: статус код, заголовок и тело.*/

public class HttpResponse <T>{

    private int code;//целочисленный статус код

    private Map<String,String> headers;// Хедер это ключ значение, поэтому будет Map.

    //private Human body; // Тело мы пока не знаем какое будет, jason файл или xml файл, или картинка
                        // и это необходимо обрабатывать.

    /*В каком то другом запросе к нам будет приходить не Human, а например Elf. А это другой класс,
    другие поля. Так, как же мы будем валидировать Elf, если мы написали, что ожидаем Human.
    Поэтому мы заранее должны сказать, что не знаем какой тип придёт. Поэтому мы вместо Human
    напишем набор любых букв, или одну букву, например <T>, сокращение от слова <Type>. Так как
    Generics принято обозначать данной буквой. Тоже самое мы добавляем в данном классе в самом
    вверху после его названия в угловых скобках (public class HttpResponse <T>{

        Обычно так:
    T - любой тип
    E - элемент
    R - result
    V - value
    K - key
    Подытожим, Generics нужны, чтобы указать тип, а назначить позже в процесе создания объекта.
    Яркий пример, это список
    */

    private T body;

    public HttpResponse(int code) {
        this.code = code;
    }
}
