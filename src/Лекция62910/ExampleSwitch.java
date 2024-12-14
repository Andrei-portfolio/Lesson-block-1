package Лекция62910;

import java.util.Scanner;

public class ExampleSwitch {
    public static void main(String[] args) {
        // Когда if у нас становится много, их следует заменить более компактной конструкцией. И называется она Switch.
        // Это в принципе тоже самое, но она более компактней. Итак, ниже представлено как у нас было.

        //        Scanner scanner = new Scanner(System.in);
        //        System.out.println("Введите промокод: ");
        //
        //        String promocode = scanner.nextLine();
        //
        //        System.out.println(promocode);
        //
        //        if (promocode.equals("S1986S"))
        //        {
        //            System.out.println("Поздравляю ваша скидка составила 50%");
        //        }
        //
        //        else if (promocode.equals("S2012S"))
        //        {
        //            System.out.println("Поздравляю ваша скидка составила ЧУТЬ БОЛЬШЕ - 99%");
        //        }
        //
        //        else if (promocode.equals("S**S"))
        //        {
        //            System.out.println("Поздравляю ваша скидка составила - 80%");
        //        }
        //
        //        else
        //        {
        //            System.out.println("Сожалею, вашей скидки нихрена нету");
        //        }

        // Но когда if больше 3-х раз в одной программе, программа при наведении на первый if сама предлагает заменить
        // на оператор Switch. Не будем отказываться

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите промокод: ");

        String promocode = scanner.nextLine();

        System.out.println(promocode);

        switch (promocode) {//Здесь мы обращаемся к переменной promocode, которую вводим в терминал
            case "S1986S": // case - это аналоги if. И переводится как, "в случае если" "S1986S"
                System.out.println("Поздравляю ваша скидка составила 50%");
                break;// аналог else if. Так принято вместо со switch использовать break. Переводится "Хватит".
            case "S2012S":
                System.out.println("Поздравляю ваша скидка составила ЧУТЬ БОЛЬШЕ - 99%");
                break;
            case "S**S":
                System.out.println("Поздравляю ваша скидка составила - 80%");
                break;
            default:// по сути это else. default срабатывает в послед. очередь, когда не сработали все case
                System.out.println("Сожалею, вашей скидки нихрена нету");
                //После default break писать не надо, так как это и так последняя часть этого оператора
        }
    }
}
