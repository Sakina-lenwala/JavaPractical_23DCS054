import java.io.*;
public class Practical_27 {
    public static void main(String[] args) {

        try {
            File file = new File("myfile.txt");
            if (file.createNewFile()) {
                System.out.println("File is created\n" + file.getName());
            } else {
                System.out.println("File already exist");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World!\n");
            writer.write("Hello Java!\n");
            writer.close();


            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            int lineCount = 0;
           // int wordCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                lineCount++;


                //String[] words = line.split("\\W+");
               // wordCount += words.length;
            }

            System.out.println("Total lines: " + lineCount);
           // System.out.println("Total words: " + wordCount);
            reader.close();
            bufferedReader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
