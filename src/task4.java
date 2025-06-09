public class task4 {
    public static void main(String[] args) {
        // Производительность машины
        int bottlesPer2Minutes = 16;
        int minutes = 2;
        int bottlesPerMinute = bottlesPer2Minutes / minutes;

        // Расчёт для каждого временного промежутка
        int twentyMinutes = 20;
        int dayInMinutes = 24 * 60;
        int threeDays = 3 * dayInMinutes;
        int month = 30 * dayInMinutes;

        int bottlesIn20Minutes = bottlesPerMinute * twentyMinutes;
        int bottlesInDay = bottlesPerMinute * dayInMinutes;
        int bottlesIn3Days = bottlesPerMinute * threeDays;
        int bottlesInMonth = bottlesPerMinute * month;

        // Вывод результатов
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок");
    }
}