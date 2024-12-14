package Домашка4.МаскировкаКарты;


public class MyProgram {
    public static void main(String[] args) {

        Card card = new Card("2222 3333 4444 5555", "5555", "08/25", 777);
        System.out.println(card.getNumber());

        System.out.println(card.getNumber("5555"));//Метод с аргументом, который ещё и принимает на вход pinCode
    }
}







