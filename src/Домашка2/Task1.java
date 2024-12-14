package Домашка2;

public class Task1 {

    public static void main(String[] args) {


        String CardNumber = "1234 5678 9012 3333";
        CardNumber = String.format("%s", "**** **** **** " + CardNumber.substring(CardNumber.length() - 4));
        System.out.println(CardNumber);


        String CardNumber2 = "1234567890124444";
        CardNumber2 = String.format("%s", "**** **** **** " + CardNumber2.substring(CardNumber2.length() - 4));
        System.out.println(CardNumber2);
    }
}


