package IntermediateCertification.Task4;

public class Score {

    // Метод для начисления очков в зависимости от выбора
    public static int computeUserScore(String choice) {

        return switch (choice) {
            case "К" -> 1;
            case "Н" -> 2;
            case "Б" -> 5;
            default -> 0;
        };
    }
}
