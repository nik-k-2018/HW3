public class task5 {
    public static void main(String[] args) {
        // Общее количество банок краски
        int totalBottles = 120;

        // Банок на один класс
        int whitePerClass = 2;
        int brownPerClass = 4;

        // Общее количество банок на класс
        int totalPerClass = whitePerClass + brownPerClass;

        // Сколько всего классов
        int classes = totalBottles / totalPerClass;

        // Общее количество банок каждой краски
        int totalWhite = whitePerClass * classes;
        int totalBrown = brownPerClass * classes;

        // Вывод результата
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }
}