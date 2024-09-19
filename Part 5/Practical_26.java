import java.util.Scanner;

class Userexception extends Exception {
    public Userexception(String s) {
        super(s);
    }
}

class User {
    public void method(int b) throws Userexception {
        if (b != 0) {
            System.out.println("Exception will not occur.");
        } else {
            throw new Userexception(" - Division by zero is not allowed.");
        }
    }
}
public class Practical_26 {
    public static void main(String[] args) {
        User o = new User();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        try {
            o.method(b);
            int c = a / b;
            System.out.println("Result of division is: " + c);
        } catch (Userexception e) {
            System.out.println("exception caught: " + e.getMessage());
        }
    }
}
