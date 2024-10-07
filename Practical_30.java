import java.io.*;
import java.util.Scanner;
public class Practical_30 {
    public static void main(String[] args) {

        try {
            File file = new File("myfile1.txt");
            if (file.createNewFile()) {
                System.out.println("File " + file.getName()+ " is created\n" );
            } else {
                System.out.println("File already exist");
            }

            FileWriter fwrite = new FileWriter("myfile1.txt");
            fwrite.write("Hello, How are you?");
            fwrite.close();

            File file1 = new File("myfile2.txt");
            if (file.createNewFile()) {
                System.out.println("File " + file1.getName()+ " is created\n" );
            } else {
                System.out.println("File already exist");
            }

            FileReader fread = new FileReader("myfile1.txt");
            BufferedReader bufferedReader = new BufferedReader(fread);
            String line;

            FileWriter fwrite1 = new FileWriter("myfile2.txt");
            while((line = bufferedReader.readLine())!=null)
            {
                fwrite1.write(line + "\n");
            }

            bufferedReader.close();
            fwrite1.close();

            FileReader fread1 = new FileReader("myfile2.txt");
            BufferedReader bufferedReader1 = new BufferedReader(fread1);
            System.out.println("Content of myfile2: ");
            while((line = bufferedReader1.readLine())!=null)
            {
                System.out.println(line);
            }
            bufferedReader1.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
