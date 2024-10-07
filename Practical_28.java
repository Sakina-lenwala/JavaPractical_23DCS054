import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Practical_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character to search for: ");
        char searchChar = scanner.next().charAt(0);

        System.out.print("Enter the file name (e.g., xanadu.txt): ");
        String filename = scanner.next();

        int count = 0;

        System.out.println("Searching for character: '" + searchChar + "' in file: " + filename);

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int currentChar;

            while ((currentChar = br.read()) != -1) {

                if ((char) currentChar == searchChar) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("The character '" + searchChar + "' appears " + count + " times in " + filename);
    }
}