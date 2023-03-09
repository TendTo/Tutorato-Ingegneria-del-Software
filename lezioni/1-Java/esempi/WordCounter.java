import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// WordCounter.java

public class WordCounter {
    private static int readWords(String file) {
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int wordCount = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                wordCount += words.length;
            }
            bufferedReader.close();
            return wordCount;
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }

    public static void writeCount(String file, int count) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(count);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java WordCounter <input_file> <output_file>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];
        int wordCount = readWords(inputFile);
        writeCount(outputFile, wordCount);
    }
}
