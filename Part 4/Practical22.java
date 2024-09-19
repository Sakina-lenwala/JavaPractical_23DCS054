import java.util.Scanner;

interface AdvancedArithmetic
{
    int divisor_num(int n);
}

class calledMyCalculator
{
   public int divisor_num(int n)
   {
       int sum=0;
       for (int i = 1; i <= n; i++)
       {
           if(n%i==0)
           {
               sum += i;
           }
       }
       return sum;
   }
}

public class Practical22
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of Number: ");
        int n=sc.nextInt();
        calledMyCalculator c= new calledMyCalculator();
        System.out.print("Sum of the divisor are: " + c.divisor_num(n));
    }
}