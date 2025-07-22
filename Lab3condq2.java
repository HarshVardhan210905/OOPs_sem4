
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Lab3condq2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date in DD MM YYYY format:");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        LocalDate epochDate = LocalDate.of(1970, 1, 1);

        LocalDate inputDate = LocalDate.of(year, month, day);

        long daysBetween = ChronoUnit.DAYS.between(epochDate, inputDate);

        System.out.println("Number of days since 1 January 1970: " + daysBetween);

        scanner.close();
    }
}
