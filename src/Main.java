import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        // Формат вывода: dd-MM-yyyy HH:mm:ss
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Текущая дата: " + currentDate.format(dateFormatter));
        System.out.println("Текущее время: " + currentTime.format(timeFormatter));
    }
}