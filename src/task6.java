public class task6 {
    public static void main(String[] args) {
        // Вес ингредиентов в граммах
        int bananaWeightEach = 80;
        int bananasCount = 5;
        int bananaTotal = bananaWeightEach * bananasCount;

        int milkPer100ml = 105;
        int milkVolume = 200;
        int milkTotal = (milkPer100ml * milkVolume) / 100; // 105 * 200 / 100 = 210

        int iceCreamWeightEach = 100;
        int iceCreamCount = 2;
        int iceCreamTotal = iceCreamWeightEach * iceCreamCount;

        int eggWeightEach = 70;
        int eggsCount = 4;
        int eggTotal = eggWeightEach * eggsCount;

        // Общий вес завтрака в граммах
        int totalGrams = bananaTotal + milkTotal + iceCreamTotal + eggTotal;

        // Переводим в килограммы
        double totalKilograms = (double) totalGrams / 1000;

        // Выводим результат
        System.out.println("Вес завтрака: " + totalGrams + " грамм");
        System.out.println("Вес завтрака: " + totalKilograms + " килограмм");
    }
}