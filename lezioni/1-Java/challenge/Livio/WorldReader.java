import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;

public class WorldReader {
    private static int readWords(String file, String w) {
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] words;
            int wordCount = 0;
            while ((line = bufferedReader.readLine()) != null) {
                words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (w.equals(words[i])) {
                        wordCount++;
                    }
                }
            }

            bufferedReader.close();
            return wordCount;
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args) {
        String world = "pippo";
        String[] inputFile = { "prova.txt", "prova2.txt" };

        for (int i = 0; i < inputFile.length; i++) {
            int wordCount = readWords(inputFile[i], world);
            System.out.println(inputFile[i] + ": " + wordCount);
        }
    }
}
