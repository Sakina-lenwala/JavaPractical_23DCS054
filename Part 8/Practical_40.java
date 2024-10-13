import java.util.*;

public class Practical_40 {
    public static void main(String[] args) {

        Map<String, Integer> wordCountMap = new TreeMap<>();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter words one by one. Type 'exit' when you are done:");

        while (true) {
            String word = scanner.next().toLowerCase(); // Read and convert to lowercase
            if (word.equals("exit")) {
                break;
            }


            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word occurrences in alphabetical order:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}