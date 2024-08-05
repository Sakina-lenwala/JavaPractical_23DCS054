public class practical11 {
    public static void main(String[] args) {
        String st = "CHARUSAT UNIVERSITY";
        char[] arr = new char[6];

        StringBuffer sc = new StringBuffer(st);
        System.out.println("Length: "+st.length());
        System.out.println("Replacing the alphabets: "+st.replace('H','S'));
        System.out.println("Lowercase string is: "+st.toLowerCase());
    }
}
