
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth date (YYYY-MM-DD): ");
        String birthDateInput = scanner.nextLine();

        
        String[] dateParts = birthDateInput.split("-");
        int birthYear = Integer.parseInt(dateParts[0]);
        int birthMonth = Integer.parseInt(dateParts[1]);
        int birthDay = Integer.parseInt(dateParts[2]);


        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();


        Period age = Period.between(birthDate, currentDate);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        
        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");

        scanner.close();
    }
}


