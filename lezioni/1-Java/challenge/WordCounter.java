import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    
    private static int fileFinder(String file, String wordSearched) {
        int counter=0;
        try(FileReader fileReader= new FileReader(file)){
            BufferedReader buffer=new BufferedReader(fileReader);
            String line;
            while((line=buffer.readLine()) != null) {
                String[] words=line.split(" ");
                int size=words.length;
                for(int i=0; i < size; i++) {
                    if(wordSearched.equals(words[i])==true) {
                        counter++;
                    }
                } 
            }
            buffer.close();
        } catch(IOException e) {
            System.err.println("file could not be opened");
            System.exit(-1);
        }

        return counter;
    }


    public static void main(String[] argv) {
        String file="file.txt";
        String word="parola";
        System.out.print(fileFinder(file, word));
    }
}
