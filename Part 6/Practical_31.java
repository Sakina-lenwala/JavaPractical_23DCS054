import java.io.*;

public class Practical_31 {

    public static void main(String[] args) {
        try {

            System.out.println("Character Stream - Reading from one file and writing to another.");

            FileWriter charWriter = new FileWriter("charOutput.txt");
            charWriter.write("This is written using a character stream.");
            charWriter.close();

            FileReader charReader = new FileReader("charOutput.txt");
            BufferedReader bufferedReader = new BufferedReader(charReader);
            String c;
            System.out.println("Contents of charOutput.txt (Character Stream):");
            while ((c = bufferedReader.readLine()) != null) {
                System.out.println(c);
            }
            bufferedReader.close();
            charReader.close();

            System.out.println("\n\nByte Stream - Reading from one file and writing to another.");

            FileOutputStream byteWriter = new FileOutputStream("byteOutput.txt");
            byteWriter.write("This is written using a byte stream.".getBytes());
            byteWriter.close();

            FileInputStream byteReader = new FileInputStream("byteOutput.txt");
            int b;
            System.out.println("Contents of byteOutput.txt (Byte Stream):");
            while ((b = byteReader.read()) != -1) {
                System.out.print((char) b);
            }
            byteReader.close();


            System.out.println("\n\nNow, using BufferedReader to take input from the console and BufferedWriter to write it to a file.");

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter some text (BufferedReader will read this):");
            String inputText = consoleReader.readLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bufferedOutput.txt"));
            bufferedWriter.write(inputText);
            bufferedWriter.close();

            consoleReader.close();
            System.out.println("Your input has been written to bufferedOutput.txt.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
