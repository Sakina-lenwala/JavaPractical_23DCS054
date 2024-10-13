import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class stack
{
    ArrayList array = new ArrayList();

    public boolean isEmpty()
    {
        return array.isEmpty();
    }

    public int getSize()
    {
        return array.size();
    }

    public void push(int x)
    {
            array.add(x);
            System.out.println("Element "+x+" added to stack successfully");
    }

    void pop()
    {
       
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else {
            array.remove(array.size() - 1);
            System.out.println("Element removed from stack successfully");
        }
    }

    public Object peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        return array.get(array.size() - 1);
    }

    void print()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack Elements: " + array);
        }
    }
}
public class Practical_38 {
    public static void main(String[] args) {

        stack s= new stack();
        ArrayList array = new ArrayList();
        Scanner sc= new Scanner(System.in);
        int choice, x;
        do {
            System.out.println("1. PUSH\n2. POP\n3. PEEK\n4. DISPLAY\n5. EXIT");
            System.out.println("Enter you choice: ");
            choice = sc.nextInt();
            
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the value you want to add:");
                    x=sc.nextInt();
                    s.push(x);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    Object topElement= s.peek();
                    if(topElement!=null){
                        System.out.println("Stack top: "+ topElement);
                    }
                    break;

                case 4:
                    s.print();
                    break;

                case 5:
                    System.out.println("Exiting...");

                default:
                    System.out.println("Enter valid choice");
            }
        }while(choice!=5);
    }
}
