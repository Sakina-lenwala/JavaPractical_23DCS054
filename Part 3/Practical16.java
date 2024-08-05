import java.util.Scanner;
class Complex {
    void sum(int r1,int i1,int r2,int i2)
    {
        int r=r1+r2;
        int i=i1+i2;
        System.out.println("Sum of two numbers are: "+ r +" + " + i +" i ");
    }

    void difference(int r1,int i1,int r2,int i2)
    {
        int r=r1-r2;
        int i=i1-i2;
        System.out.println("Subtraction of two numbers are: "+ r +" + " + i +" i ");
    }

    void multiplication(int r1,int i1,int r2,int i2)
    {
        int r= (r1*r2-i1*i2);
        int i=(r1*i2+i1*r2);
        System.out.println("Multiplication  of two numbers are: "+ r +" + " + i +" i ");
    }
}
public class Practical16
{
    public static void main(String args[])
    {
         Complex c = new Complex();
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        System.out.print("Enter the real part of the complex number: ");
        int r1=sc.nextInt();
        System.out.print("Enter the imaginary part of the complex number: ");
        int i1=sc.nextInt();

        System.out.println("Enter the second number: ");
        System.out.print("Enter the real part of the complex number: ");
        int r2=sc.nextInt();
        System.out.print("Enter the imaginary part of the complex number: ");
        int i2=sc.nextInt();

        c.sum(r1,i1,r2,i2);
        c.difference(r1,i1,r2,i2);
        c.multiplication(r1,i1,r2,i2);


    }
}
