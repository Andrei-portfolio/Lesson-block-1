package IntermediateCertification.Task4Reserve;

public class computeUserScore {
    public static int computeUserScore (String choice) {// Метод для начисления очков в зависимости от выбора

        if (choice.equals("К")) {
            return 1;
        } else if (choice.equals("Н")) {
            return 2;
        } else if (choice.equals("Б")) {
            return 5;
        }
        return 0;
    }
}

//        switch (choice) {
//            case "К": return 1; // Камень - 1 очко
//            case "Н": return 2; // Ножницы - 2 очка
//            case "Б": return 5; // Бумага - 5 очков
//            default: return 0; // Не должно произойти
