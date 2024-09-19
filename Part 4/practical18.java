import java.util.Scanner;
class Member
{
    String name;
    int age;
    String phone_num;
    String address;
    int salary;

    void PrintSalary()
    {
        System.out.println("Your Salary is: "+ salary);
    }
}

class Employee extends Member
{
    String specialization;

    void getDetails()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Employee name: ");
        name=sc.nextLine();
        System.out.print("Enter the Employee age: ");
        age=sc.nextInt();
        System.out.print("Enter the Employee phone number: ");
        phone_num=sc.next();
        System.out.print("Enter the Employee address: ");
        address=sc.next();
        System.out.print("Enter the Employee salary: ");
        salary=sc.nextInt();
        System.out.print("Enter your Specialization: ");
        specialization=sc.next();
    }

    void printDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee age: " + age);
        System.out.println("Employee phone number: " + phone_num);
        System.out.println("Employee address: " + address);
        System.out.println("Employee specialization: " + specialization);
        PrintSalary();
    }

}

class Manager extends Member
{
    String department;

    void getDetails()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Manager name: ");
        name=sc.nextLine();
        System.out.print("Enter the Manager age: ");
        age=sc.nextInt();
        System.out.print("Enter the Manager phone number: ");
        phone_num=sc.next();
        System.out.print("Enter the Manager address: ");
        address=sc.next();
        System.out.print("Enter the Manager salary: ");
        salary=sc.nextInt();
        System.out.print("Enter your department : ");
        department=sc.next();
    }

    void printDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee age: " + age);
        System.out.println("Employee phone number: " + phone_num);
        System.out.println("Employee address: " + address);
        System.out.println("Employee department: " + department);
        PrintSalary();
    }
}
public class practical18 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Employee e= new Employee();
        Manager m= new Manager();
        e.getDetails();
        m.getDetails();
        System.out.println("Details of employee: ");
        e.printDetails();
        System.out.println("Details of manager: ");
        m.printDetails();


    }
}
