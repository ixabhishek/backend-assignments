import java.io.*;
import java.util.HashMap;

public class p1 {

    public static void main(String[] args) {
        // It only knows binary data Reads data byte by byte- fileinputstream reads data
        // from file
        // Reads text efficiently Reads one full line at a time- bufferedreader has
        // readLine() reads whole text
        // inputstreamreader converts byte stream to character stream (converts bytes to
        // characters using a specified charset)
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream("C:\\Users\\Abhishek25n\\OneDrive\\Desktop\\backend ix\\28-01-2026\\taskk.txt")))) {
            int charcount = 0;
            int wordcount = 0;
            int spacecount = 0;
            int sentcount = 0;
            int paracount = 0;
            HashMap<String, Integer> hashMap = new HashMap<>();

            String line;
            while ((line = bufferedReader.readLine()) != null) { // Reads one line at a time until the end of the file
                if (line.equals("")) { // alternative is if (line.trim().isEmpty()) {// empty line → paragraph ends
                                       // inParagraph = false;
                    paracount = paracount + 1;
                }

                // replace mutlispace with singlespace
                String l = line;
                String regex = "\\s+"; // s means whitespace + means one or more
                String repl = " ";
                String Simplespa = l.replaceAll(regex, repl); // example: "This is a test" -> "This is a test"
                System.out.println(Simplespa);

                // counting characters
                charcount = charcount + line.length();

                // counting words
                String[] words = line.split(" ");
                wordcount = wordcount + words.length;

                // counting spaces
                for (char ch : line.toCharArray()) {
                    if (ch == ' ') { // ['J','a','v','a',' ','i','s',' ','f','u','n']
                        spacecount++;
                    }
                }

                // counting sentences
                String[] sentence = line.split("[!?.:]+");
                sentcount = sentcount + sentence.length;
                line = bufferedReader.readLine();
                if (line == null) {
                    paracount = paracount + 1;
                    // ex Java is easy. Java is powerful! Is Java fun? after splittinhg we get 4
                    // sentences so it becomes 4 paragraphs because after every
                    // punctuation there is a new line

                }

                // reversing the sentence with same order of words
                StringBuilder res = new StringBuilder(); // StringBuffer class in Java represents a sequence of
                                                         // characters that can be modified, which means we can change
                                                         // the content of the StringBuffer without creating a new
                                                         // object every time.
                for (int i = words.length - 1; i >= 0; i--) {
                    res.append(words[i]).append(" "); // words = ["Java", "is", "very", "powerful"];
                }
                System.out.println(res);

                // the words which are frequently repeating
                int h = 1;
                for (String word : words) {
                    word = word.toLowerCase();

                    if (hashMap.containsKey(word)) {
                        hashMap.put(word, hashMap.get(word) + 1);
                    } else {
                        hashMap.put(word, 1);
                    }
                }

                System.out.println(hashMap);
            }
            System.out.println("");
            System.out.println("...........................");
            System.out.println(" the no of charaters in file are " + charcount);
            System.out.println("...........................");
            System.out.println("the no of words in file are " + wordcount);
            System.out.println("...........................");
            System.out.println(" the no of spaces in file are " + spacecount);
            System.out.println("...........................");
            System.out.println(" the no of sentences in file are " + sentcount);
            System.out.println("...........................");
            System.out.println(" the no of paragraphs in file are " + paracount);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: taskk.txt");

        } catch (IOException e) {
            System.err.println("An I/O error occurred while reading the file:");

        }
    }

}
