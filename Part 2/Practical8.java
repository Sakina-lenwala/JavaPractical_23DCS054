import java.util.Scanner;
public class Practical8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]=new int[5];
        int count=0;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
              if(arr[i]==9){
                  count++;
              }
        }
        System.out.print("Number 9 appears " + count + " times");
    }
}