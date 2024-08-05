import java.util.Scanner;
public class practical5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 100;


        System.out.println("Enter your: 1-motor, 2-fan, 3-light, 4-wire, 5-other");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                price = price + (price * 0.08);
                System.out.println("Total price of motor:" + price);
                break;
            case 2:
                price = price + (price * 0.12);
                System.out.println("Total price of fan:" + price);
                break;
            case 3:
                price = price + (price * 0.05);
                System.out.println("Total price of tube light:" + price);
                break;
            case 4:
                price = price + (price * 75);
                System.out.println("Total price of wire:" + price);
                break;
            case 5:
                price = price + (price * 0.03);
                System.out.println("Total price of other:" + price);
                break;
        }
    }
}