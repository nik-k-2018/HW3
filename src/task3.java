public class task3 {
    public static void main(String[] args) {
        // Количество учеников у каждой учительницы
        int studentsLyudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;

        // Общее количество учеников
        int totalStudents = studentsLyudmila + studentsAnna + studentsEkaterina;

        // Общее количество листов бумаги
        int totalSheets = 480;

        // Сколько листов достанется каждому ученику
        int sheetsPerStudent = totalSheets / totalStudents;

        // Вывод результата
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
    }
}