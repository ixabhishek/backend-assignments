import java.io.*;
import java.util.HashMap;

public class p1 {

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(
                                "C:\\Users\\Abhishek25n\\OneDrive\\Desktop\\backend ix\\28-01-2026\\taskk.txt")))) {

            int charcount = 0;
            int wordcount = 0;
            int spacecount = 0;
            int sentcount = 0;
            int paracount = 0;

            HashMap<String, Integer> wordFreq = new HashMap<>();

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                // Paragraph count
                if (line.trim().isEmpty()) {
                    paracount++;
                    continue;
                }

                // Remove extra spaces
                String simpleSpace = line.replaceAll("\\s+", " ");
                System.out.println(simpleSpace);

                // Character count
                charcount += line.length();

                // Word count
                String[] words = simpleSpace.trim().split("\\s+");
                wordcount += words.length;

                // Space count
                for (char ch : line.toCharArray()) {
                    if (ch == ' ') spacecount++;
                }

                // Sentence count
                String[] sentences = line.split("[.!?:]+");
                sentcount += sentences.length;

                // Reverse words using StringBuilder
                StringBuilder res = new StringBuilder();
                for (int i = words.length - 1; i >= 0; i--) {
                    res.append(words[i]).append(" ");
                }
                System.out.println(res.toString().trim());

                // Word frequency
                for (String word : words) {
                    word = word.toLowerCase();
                    wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
                }
            }

            // Final output
            System.out.println("\n---------------------------");
            System.out.println("Characters : " + charcount);
            System.out.println("Words      : " + wordcount);
            System.out.println("Spaces     : " + spacecount);
            System.out.println("Sentences  : " + sentcount);
            System.out.println("Paragraphs : " + (paracount + 1));
            System.out.println("Word Count : " + wordFreq);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: taskk.txt");
        } catch (IOException e) {
            System.err.println("I/O error while reading the file");
        }
    }
}
