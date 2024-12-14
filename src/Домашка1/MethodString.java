package Домашка1;

public class MethodString {

    public static void main(String[] args) {


        // 1. Метод length используется для определения длины строки и возвращает количество символов в строке
        String city = "Владивосток";
        int resultCity = city.length();
        System.out.print("1. Количество символов в строке = ");
        System.out.println(resultCity);

        // 2. Метод isEmpty используется для определения проверки, является ли строка пустой
        String flower = "Тюльпан";
        Boolean resultFlower = flower.isEmpty();
        System.out.print("2. Является ли строка пустой? - ");
        System.out.println(resultFlower);

        // 3. Метод isBlank, используется для определения проверки, является ли строка пустой, или есть ли в строке
        // только пробелы
        String login = "  ";
        Boolean resultLogin = login.isBlank();
        System.out.print("3. Является ли строка пустой, или есть ли в ней только пробелы? - ");
        System.out.println(resultLogin);

        // 4. Метод substring (int, int) условно говоря, обрезает нашу строку, и выводит в моём примере текст
        // со 2-го по 6-ой символ
        String fruits = "@Бананы";
        String resultFruits = fruits.substring(1, 6);
        System.out.print("4. Содержимое строки после удаления символов = ");
        System.out.println(resultFruits);

        // 5. Метод IndexOf возвращает первое вхождение (первый индекс) данного символа или комбинации в заданной
        // строке.  Т.е. если искомый текст встречается в тексте несколько раз, то возвращается порядковый номер
        // искомого текста, стоящего первым

        String email = " andrei24845@yandex.ru";
        int resultEmail = email.indexOf("an");
        System.out.print("5. Порядковый номер искомого параметра = ");
        System.out.println(resultEmail);

        // 6. Метод lastIndexOf возвращает последнее вхождение (последний индекс) данного символа или комбинации
        // в заданной строке. //Т.е. если искомый текст встречается в тексте несколько раз, то возвращается порядковый
        // номер искомого текста, стоящего последним

        String Email2 = "andrei24845@yandex.ru";
        int resultEmail2 = Email2.lastIndexOf("an");
        System.out.print("6. Порядковый номер искомого параметра = ");
        System.out.println(resultEmail2);

        // 7. Метод toLowerCase будет изменять наше имя и прописывать его строчными буквами
        String userName = "СеМёН";
        String resultUserName = userName.toLowerCase();
        System.out.print("7. Содержимое строки с заменой всех букв на строчные = ");
        System.out.println(resultUserName);

        // 8. Метод toLowerCase будет изменять наше имя и прописывать его прописными буквами
        String userName1 = "уЛьЯнА";
        String resultUserName1 = userName1.toUpperCase();
        System.out.print("8. Содержимое строки с заменой всех букв на прописные = ");
        System.out.println(resultUserName1);

        // 9. Метод replace заменяет указанный символ (или подстроку) в строке на новый.
        String berry = "Калина";
        String resultBerry = berry.replace("К", "М");
        System.out.print("9. Содержимое строки с заменой символа = ");
        System.out.println(resultBerry);

        // 10. Метод startsWith используется для определения, начинается ли строка с указанного префикса
        String phone = "+79279765432";
        Boolean resultPhone = phone.startsWith("+7");
        System.out.print("10. Начинается ли строка с указанного префикса? - ");
        System.out.println(resultPhone);

        // 11. Метод startsWith используется для определения, заканчивается ли строка с указанного префикса
        String mail = "andrei@mail.com";
        Boolean resultMail = mail.endsWith(".com");
        System.out.print("11. Заканчивается ли строка с указанного префикса? - ");
        System.out.println(resultMail);

        // 12. Метод  repeat используется для повторения строки заданное количество раз.
        String str = "Abc";
        String resultStr = str.repeat(3);
        System.out.print("12. Содержимое строки с заданным количеством повторений = ");
        System.out.println(resultStr);

        // 13. Метод contains предназначен для проверки, содержит ли строка определённые символы
        String mail2 = "andrei@mail.com";
        Boolean resultMail2 = mail2.contains("@");
        System.out.print("13. Содержит ли строка ? - ");
        System.out.println(resultMail2);

        // 14. Метод concat, добавляет указанную строку в конец текущей строки и возвращает новую строку.
        String purpose = "Я хочу с лёгкостью и наслаждением";
        String resultPurpose = purpose.concat(" автоматизировать кейсы!!!");
        System.out.print("14. Содержимое строки с добавленными текстом: ");
        System.out.println(resultPurpose);

        // 15. Метод trim позволяет удалить пробелы в начале и конце строки.
        String name1 = "       Илья      ";
        String resultName1 = name1.trim();
        System.out.print("15. Содержимое строки с удаленными пробелами = ");
        System.out.println(resultName1);

        // 16. Метод equals позволяет проверять исходное содержимое строки.
        String password = "Qwert12345";
        Boolean resultPassword = password.equals("Qwert12345");
        System.out.print("16. Соответствует ли исходное содержание строки? - ");
        System.out.println(resultPassword);


    }


}
