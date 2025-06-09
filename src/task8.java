public class task8 {
    public static void main(String[] args) {
        // Зарплаты сотрудников
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;

        // Повышение зарплаты на 10%
        double increasePercent = 10.0;

        // Расчёт новой зарплаты
        double newSalaryMasha = salaryMasha * (1 + increasePercent / 100);
        double newSalaryDenis = salaryDenis * (1 + increasePercent / 100);
        double newSalaryKristina = salaryKristina * (1 + increasePercent / 100);

        // Годовой доход до и после повышения
        double annualIncomeMashaOld = salaryMasha * 12;
        double annualIncomeMashaNew = newSalaryMasha * 12;
        double differenceMasha = annualIncomeMashaNew - annualIncomeMashaOld;

        double annualIncomeDenisOld = salaryDenis * 12;
        double annualIncomeDenisNew = newSalaryDenis * 12;
        double differenceDenis = annualIncomeDenisNew - annualIncomeDenisOld;

        double annualIncomeKristinaOld = salaryKristina * 12;
        double annualIncomeKristinaNew = newSalaryKristina * 12;
        double differenceKristina = annualIncomeKristinaNew - annualIncomeKristinaOld;

        // Вывод результатов
        System.out.println("Маша:");
        System.out.printf("Текущая зарплата: %.0f%n", salaryMasha);
        System.out.printf("Новая зарплата: %.0f%n", newSalaryMasha);
        System.out.printf("Годовой доход до повышения: %.0f%n", annualIncomeMashaOld);
        System.out.printf("Годовой доход после повышения: %.0f%n", annualIncomeMashaNew);
        System.out.printf("Разница: %.0f%n", differenceMasha);
        System.out.println();

        System.out.println("Денис:");
        System.out.printf("Текущая зарплата: %.0f%n", salaryDenis);
        System.out.printf("Новая зарплата: %.0f%n", newSalaryDenis);
        System.out.printf("Годовой доход до повышения: %.0f%n", annualIncomeDenisOld);
        System.out.printf("Годовой доход после повышения: %.0f%n", annualIncomeDenisNew);
        System.out.printf("Разница: %.0f%n", differenceDenis);
        System.out.println();

        System.out.println("Кристина:");
        System.out.printf("Текущая зарплата: %.0f%n", salaryKristina);
        System.out.printf("Новая зарплата: %.0f%n", newSalaryKristina);
        System.out.printf("Годовой доход до повышения: %.0f%n", annualIncomeKristinaOld);
        System.out.printf("Годовой доход после повышения: %.0f%n", annualIncomeKristinaNew);
        System.out.printf("Разница: %.0f%n", differenceKristina);
    }
}