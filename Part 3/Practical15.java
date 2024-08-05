import java.util.Scanner;
class Area {

    Area(int length,int breadth)
    {
        int a=length;
        int b=breadth;
    }

     static int returnArea(int length,int breadth)
    {
        int area=length*breadth;
        return area;
    }
}
public class Practical15
{
public static void main(String args[])
{
     Area ar;
     Scanner sc= new Scanner(System.in);
    System.out.print("Enter the value of length: ");
    int a= sc.nextInt();
    System.out.print("Enter the value of breadth: ");
    int b=sc.nextInt();
    System.out.println("Area of Rectangle: " + Area.returnArea(a,b) );
}
}
