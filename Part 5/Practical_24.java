import java.util.Scanner;
public class Practical_24
{
    public static void main(String[] args) {  Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter x: ");
            int x = scanner.nextInt();

            System.out.print("Enter y: ");
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println("The result of " + x
                    +" / " + y + " is: " + result);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        scanner.close();
    }
}


