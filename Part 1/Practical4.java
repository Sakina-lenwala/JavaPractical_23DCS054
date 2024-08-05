import java.util.Scanner;
public class Practical4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[];

        System.out.print("How many Expenses you want to enter: ");
        int n= sc.nextInt();
        float sum=0;

        System.out.println("Enter expenses: ");
        for(int i=0;i<n;i++)
        {
            System.out.print("Expense " +(i+1) +":");
            float expense=sc.nextFloat();
            sum=sum+expense;
        }
        


        System.out.println("Total Expense of the  month is: "+ sum);
    }
}
