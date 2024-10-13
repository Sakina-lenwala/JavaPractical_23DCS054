import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Practical_41 {
    private static final Set<String> KEYWORDS = new HashSet<>();

    static {
        KEYWORDS.add("abstract");
        KEYWORDS.add("assert");
        KEYWORDS.add("boolean");
        KEYWORDS.add("break");
        KEYWORDS.add("byte");
        KEYWORDS.add("case");
        KEYWORDS.add("catch");
        KEYWORDS.add("char");
        KEYWORDS.add("class");
        KEYWORDS.add("const");
        KEYWORDS.add("continue");
        KEYWORDS.add("default");
        KEYWORDS.add("do");
        KEYWORDS.add("double");
        KEYWORDS.add("else");
        KEYWORDS.add("enum");
        KEYWORDS.add("extends");
        KEYWORDS.add("final");
        KEYWORDS.add("finally");
        KEYWORDS.add("float");
        KEYWORDS.add("for");
        KEYWORDS.add("goto");
        KEYWORDS.add("if");
        KEYWORDS.add("implements");
        KEYWORDS.add("import");
        KEYWORDS.add("instanceof");
        KEYWORDS.add("int");
        KEYWORDS.add("interface");
        KEYWORDS.add("long");
        KEYWORDS.add("native");
        KEYWORDS.add("new");
        KEYWORDS.add("package");
        KEYWORDS.add("private");
        KEYWORDS.add("protected");
        KEYWORDS.add("public");
        KEYWORDS.add("return");
        KEYWORDS.add("short");
        KEYWORDS.add("static");
        KEYWORDS.add("strictfp");
        KEYWORDS.add("super");
        KEYWORDS.add("switch");
        KEYWORDS.add("synchronized");
        KEYWORDS.add("this");
        KEYWORDS.add("throw");
        KEYWORDS.add("throws");
        KEYWORDS.add("transient");
        KEYWORDS.add("try");
        KEYWORDS.add("void");
        KEYWORDS.add("volatile");
        KEYWORDS.add("while");
    }

    public static void main(String[] args) throws IOException {

        String fileName = "D:\\SEMESTER 3\\JAVA\\Practicals\\Part 8\\src\\Practical_39.java";
        int keywordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (KEYWORDS.contains(word)) {
                        keywordCount++;
                    }
                }
            }
        }

        System.out.println("Number of keywords: " + keywordCount);
    }
}