import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Practical_29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the word to search: ");
        String wordToSearch = scanner.nextLine();

        int count = searchWordInFile(filePath, wordToSearch);

        Integer result = Integer.valueOf(count);
        System.out.println("The word '" + wordToSearch + "' appears " + result + " times in the file.");

        scanner.close();
    }

    public static int searchWordInFile(String filePath, String word) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\W+");
                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        return count;
    }
}
