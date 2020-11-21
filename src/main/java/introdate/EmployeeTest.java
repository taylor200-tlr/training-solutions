package introdate;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a dolgozó nevét:");
        String employeeName = scanner.nextLine();
        System.out.println("Kérem a dolgozó születési idejét szóközökkel (pl:2000 12 25");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        Employee employee = new Employee(employeeName, dateOfBirth, LocalDate.now());
        System.out.println("A dolgozó neve: " + employee.getName());
        System.out.println("Születési ideje: " + employee.getDateOfBirth());
        System.out.println("Belépési ideje: "+ employee.getBeginEmployment());
    }
}
