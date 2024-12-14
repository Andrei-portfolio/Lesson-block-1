import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Метод length используется для определения длины строки и возвращает количество символов в строке
        String city = "Владивосток";
        int ResultCity = city.length();
        System.out.print("1. Количество символов в строке = ");
        System.out.println(ResultCity);

        // 2. Метод isEmpty используется для определения проверки, является ли строка пустой
        String Flower = "Тюльпан";
        Boolean ResultFlower = Flower.isEmpty();
        System.out.print("2. Является ли строка пустой? - ");
        System.out.println(ResultFlower);

        // 3. Метод isBlank, используется для определения проверки, является ли строка пустой, или есть ли в строке только пробелы
        String Login = "  ";
        Boolean ResultLogin = Login.isBlank();
        System.out.print("3. Является ли строка пустой, или есть ли в ней только пробелы? - ");
        System.out.println(ResultLogin);

        // 4. Метод substring (int, int) условно говоря, обрезает нашу строку, и выводит в моём примере текст со 2-го по 6-ой символ
        String Fruits = "@Бананы";
        String ResultFruits = Fruits.substring(1,6);
        System.out.print("4. Содержимое строки после удаления символов = ");
        System.out.println(ResultFruits);

        // 5. Метод IndexOf возвращает первое вхождение (первый индекс) данного символа или комбинации в заданной строке.
        //Т.е. если искомый текст встречается в тексте несколько раз, то возвращается порядковый номер искомого текста, стоящего первым
        String Email = " andrei24845@yandex.ru";
        int ResultEmail = Email.indexOf("an");
        System.out.print("5. Порядковый номер искомого параметра = ");
        System.out.println(ResultEmail);

        // 6. Метод lastIndexOf возвращает последнее вхождение (последний индекс) данного символа или комбинации в заданной строке.
        //Т.е. если искомый текст встречается в тексте несколько раз, то возвращается порядковый номер искомого текста, стоящего последним
        String Email2 = "andrei24845@yandex.ru";
        int ResultEmail2 = Email2.lastIndexOf("an");
        System.out.print("6. Порядковый номер искомого параметра = ");
        System.out.println(ResultEmail2);

        // 7. Метод toLowerCase будет изменять наше имя и прописывать его строчными буквами
        String UserName = "СеМёН";
        String ResultUserName = UserName.toLowerCase();
        System.out.print("7. Содержимое строки с заменой всех букв на строчные = ");
        System.out.println(ResultUserName);

        // 8. Метод toLowerCase будет изменять наше имя и прописывать его прописными буквами
        String UserName1 = "уЛьЯнА";
        String ResultUserName1 = UserName1.toUpperCase();
        System.out.print("8. Содержимое строки с заменой всех букв на прописные = ");
        System.out.println(ResultUserName1);

        // 9. Метод replace заменяет указанный символ (или подстроку) в строке на новый.
        String Berry = "Калина";
        String ResultBerry = Berry.replace("К", "М");
        System.out.print("9. Содержимое строки с заменой символа = " );
        System.out.println(ResultBerry);

        // 10. Метод startsWith используется для определения, начинается ли строка с указанного префикса
        String Phone = "+79279765432";
        Boolean ResultPhone = Phone.startsWith("+7");
        System.out.print("10. Начинается ли строка с указанного префикса? - ");
        System.out.println(ResultPhone);

        // 11. Метод startsWith используется для определения, заканчивается ли строка с указанного префикса
        String Mail = "andrei@mail.com";
        Boolean ResultMail = Mail.endsWith(".com");
        System.out.print("11. Заканчивается ли строка с указанного префикса? - ");
        System.out.println(ResultMail);

        // 12. Метод  repeat используется для повторения строки заданное количество раз.
        String Str = "Abc";
        String ResultStr = Str.repeat(3);
        System.out.print("12. Содержимое строки с заданным количеством повторений = ");
        System.out.println(ResultStr);

        // 13. Метод contains предназначен для проверки, содержит ли строка определённые символы
        String Mail2 = "andrei@mail.com";
        Boolean ResultMail2 = Mail2.contains("@");
        System.out.print("13. Содержит ли строка ? - ");
        System.out.println(ResultMail2);

        // 14. Метод concat, добавляет указанную строку в конец текущей строки и возвращает новую строку.
        String Purpose = "Я хочу с лёгкостью и наслаждением";
        String ResultPurpose = Purpose.concat(" автоматизировать кейсы!!!");
        System.out.print("14. Содержимое строки с добавленными текстом: ");
        System.out.println(ResultPurpose);

        // 15. Метод trim позволяет удалить пробелы в начале и конце строки.
        String Name1 = "       Илья      ";
        String ResultName1 = Name1.trim();
        System.out.print("15. Содержимое строки с удаленными пробелами = ");
        System.out.println(ResultName1);

        // 16. Метод equals позволяет проверять исходное содержимое строки.
        String Password = "Qwert12345";
        Boolean ResultPassword = Password.equals("Qwert12345");
        System.out.print("16. Соответствует ли исходное содержание строки? - ");
        System.out.println(ResultPassword);




    }



}
