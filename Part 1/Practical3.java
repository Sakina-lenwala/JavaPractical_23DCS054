import java.util.Scanner;
public  class Practical3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in meters: ");
        float distance=sc.nextFloat();

        System.out.println("Enter the time: ");
        System.out.print("In hours: ");
        float hours=sc.nextFloat();

        System.out.print("In minutes: ");
        float minutes=sc.nextFloat();

        System.out.print("In seconds: ");
        float second=sc.nextFloat();

        second=(minutes*60)+(hours*3600)+second;
        float speed1=distance/second;

        float hour=hours+(minutes/60)+(second/3600);

        float kilometer=distance/1000;
        float speed2= kilometer/hour;

        float mile=distance/1609;
        float speed3= mile/hour;

        System.out.println("Speed in meters/second: " +speed1);
        System.out.println("Speed in kilometers/hour: " +speed2);
        System.out.println("Speed in mile/hour: " +speed3);
    }
}
  
  
  
   