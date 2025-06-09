public class task7 {
    public static void main(String[] args) {
        // Цель — сбросить 7 кг
        int totalWeightToLoseGrams = 7000;

        // Минимальная и максимальная потеря веса в день
        int minLossPerDay = 250;
        int maxLossPerDay = 500;

        // Расчёт количества дней
        double daysMinSpeed = (double) totalWeightToLoseGrams / minLossPerDay;
        double daysMaxSpeed = (double) totalWeightToLoseGrams / maxLossPerDay;

        // Среднее количество дней
        double averageDays = (daysMinSpeed + daysMaxSpeed) / 2;

        // Вывод результатов в консоль
        System.out.println("Если терять по " + minLossPerDay + " грамм в день, потребуется " + daysMinSpeed + " дней.");
        System.out.println("Если терять по " + maxLossPerDay + " грамм в день, потребуется " + daysMaxSpeed + " дней.");
        System.out.println("В среднем потребуется около " + averageDays + " дней.");
    }
}