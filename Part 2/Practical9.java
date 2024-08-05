
import java.util.*;

public class Practical9 {
    static StringBuffer print ()
    {
        char s1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string :");
        StringBuffer st = new StringBuffer(sc.nextLine());


        System.out.print("Enter number of times that you want to print :");
        int n = sc.nextInt();

        StringBuffer value = new StringBuffer();
        for (int i = 0; i<st.length(); i++) {
            s1 = st.charAt(i);

            for (int j = 0; j < n; j++) {
                value = value.append(s1);
            }
        }
        return value;
    }

    public static void main(String[] args) {
        StringBuffer s2 = new StringBuffer(print());
        System.out.println(s2);

    }
}
