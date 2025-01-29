import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.time.temporal.IsoFields;

public class TaskManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер задания (1-15):");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1 -> task1();
            case 2 -> task2();
            case 3 -> task3();
            case 4 -> task4();
            case 5 -> task5();
            case 6 -> task6();
            case 7 -> task7();
            case 8 -> task8();
            case 9 -> task9();
            case 10 -> task10();
            case 11 -> task11();
            case 12 -> task12();
            case 13 -> task13();
            case 14 -> task14();
            case 15 -> task15();
            default -> System.out.println("Некорректный номер задания. Введите число от 1 до 15.");
        }
        scanner.close();
    }

    // Задание 1: Текущая дата и время
    public static void task1() {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println("Дата: " + currentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Время: " + currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    // Задание 2: Сравнение дат
    public static void task2() {
        LocalDate date1 = LocalDate.of(2023, 5, 20);
        LocalDate date2 = LocalDate.of(2023, 10, 15);
        System.out.println(compareDates(date1, date2));
    }

    // Задание 3: Сколько месяцев между двумя датами
    public static void task3() {
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.now();
        long monthsBetween = ChronoUnit.MONTHS.between(startDate, endDate);
        System.out.println("Месяцев между датами: " + monthsBetween);
    }

    // Задание 4: Сколько дней между двумя датами
    public static void task4() {
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Дней между датами: " + daysBetween);
    }

    // Задание 5: Определить високосный год
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        boolean isLeap = Year.isLeap(year);
        System.out.println(year + (isLeap ? " является високосным." : " не является високосным."));
    }

    // Задание 6: Обязательное форматирование текущей даты
    public static void task6() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("Текущая дата в формате yyyy/MM/dd: " + currentDate.format(formatter));
    }

    // Задание 7: Форматирование текущей даты на русском языке
    public static void task7() {
        LocalDate currentDate = LocalDate.now();
        Locale locale = Locale.ENGLISH;     // Создаем локаль для английского языка в регионе США
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("Текущая дата на русском языке: " + currentDate.format(formatter));
    }

    // Задание 8: Текущая дата и время в соседней временной зоне
    public static void task8() {
        ZonedDateTime currentTimeInMoscow = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        System.out.println("Текущая дата и время в Москве: " + currentTimeInMoscow);
    }

    // Задание 9: Добавить 7 дней к текущей дате
    public static void task9() {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(7);
        System.out.println("Дата через 7 дней: " + futureDate);
    }

    // Задание 10: Уменьшить дату на 3 месяца
    public static void task10() {
        LocalDate currentDate = LocalDate.now();
        LocalDate pastDate = currentDate.minusMonths(3);
        System.out.println("Дата 3 месяца назад: " + pastDate);
    }

    // Задание 11: Случайная дата
    public static void task11() {
        Random random = new Random();
        int year = random.nextInt(2025 - 2000 + 1) + 2000; // от 2000 до 2025
        int month = random.nextInt(12) + 1; // от 1 до 12
        int day = random.nextInt(28) + 1; // от 1 до 28 (чтобы избежать ошибок в феврале)
        LocalDate randomDate = LocalDate.of(year, month, day);
        System.out.println("Случайная дата: " + randomDate);
    }

    // Задание 12: Текущая неделя
    public static void task12() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Неделя: " + currentDate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
    }

    // Задание 13: День недели
    public static void task13() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Сегодня " + currentDate.getDayOfWeek());
    }

    // Задание 14: Количество дней в месяце текущей даты
    public static void task14() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Количество дней в этом месяце: " + currentDate.lengthOfMonth());
    }

    // Задание 15: Добавление случайного количества часов к текущему времени
    public static void task15() {
        Random random = new Random();
        int hoursToAdd = random.nextInt(24); // от 0 до 23 часов
        LocalTime currentTime = LocalTime.now();
        LocalTime newTime = currentTime.plusHours(hoursToAdd);
        System.out.println("Текущее время: " + currentTime);
        System.out.println("Время через " + hoursToAdd + " часов: " + newTime);
    }

    // Метод для сравнения двух дат (используется в задании 2)
    public static String compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            return "Дата " + date1 + " предшествует дате " + date2;
        } else if (date1.isAfter(date2)) {
            return "Дата " + date1 + " следует за датой " + date2;
        } else {
            return "Даты равны: " + date1;
        }
    }
}
