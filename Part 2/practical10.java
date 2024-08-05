public class practical10 {
    public static void main(String[] args) {
        String st = "sakina";
        char[] arr = new char[6];

        StringBuffer sc = new StringBuffer(st);
        System.out.println("Length of the string is: " +st.length());
        System.out.println("lowercase of the string is: " +st.toLowerCase());
        System.out.println("Uppercase of the string is: " +st.toUpperCase());

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.charAt(i);
        }

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5 - i; j++) {

                if (arr[j] > arr[j + 1])
                {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted string is: " );
        for (int i = 0; i < 6; i++) {
            if(arr[i]!='\0') {
                System.out.print(arr[i]);
            }
        }
    }

}
