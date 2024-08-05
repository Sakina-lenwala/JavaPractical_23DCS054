

import java.util.Scanner;
public class practical13 {
    private
    String firstName;
    String lastName;
    double monthlySalary;

    public practical13(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0f) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0f;
        }
    }

    public double calculateYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        double raiseAmount = monthlySalary * 0.10;
        monthlySalary += raiseAmount;
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter details for Employee 1
        System.out.println("Enter details for Employee 1:");
        System.out.print("First Name: ");
        String firstName1 = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName1 = scanner.nextLine();
        System.out.print("Monthly Salary: ");
        double salary1 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left by nextDouble()

        // Prompt user to enter details for Employee 2
        System.out.println("\nEnter details for Employee 2:");
        System.out.print("First Name: ");
        String firstName2 = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName2 = scanner.nextLine();
        System.out.print("Monthly Salary: ");
        double salary2 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left by nextDouble()

        // Create Employee objects
        practical13 emp1 = new practical13(firstName1, lastName1, salary1);
        practical13 emp2 = new practical13(firstName2, lastName2, salary2);

        // Display each employee's yearly salary
        System.out.println("\nEmployee 1:");
        System.out.printf("Yearly Salary: %.2f%n", emp1.calculateYearlySalary());
        System.out.println("Employee 2:");
        System.out.printf("Yearly Salary: %.2f%n", emp2.calculateYearlySalary());

        // Give each employee a 10% raise
        emp1.giveRaise();
        emp2.giveRaise();

        // Display each employee's yearly salary after raise
        System.out.println("\nAfter 10% Raise:");
        System.out.println("Employee 1:");
        System.out.printf("Yearly Salary: %.2f%n", emp1.calculateYearlySalary());
        System.out.println("Employee 2:");
        System.out.printf("Yearly Salary: %.2f%n", emp2.calculateYearlySalary());

        // Close the scanner
        scanner.close();
    }
}