import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class ContaParola {
    private static String parola;

    /**Reads the word to search from input
    */
    private static String readWord(){
        System.out.print("Digita la parola che vuoi cercare nel file: ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.next();
        scanner.close();
        return temp;
    }

    private static int countWord(String filePath){
        int count = 0;
        try(FileReader fileReader = new FileReader(filePath)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            parola = readWord();
            
            while ((line = bufferedReader.readLine()) != null){
                if(line.contains(parola)){
                    count++;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
        return count;
    }

    public static void main(String[] args) {
        if (args.length != 1){
            System.err.print("Usage: java ContaParola <input_file>");
            System.exit(1);
        }

        System.out.println("Il file di input scelto e' " + args[0]);
        int words = countWord(args[0]);

        System.out.print("Numero di occorrenze della parola \"" + parola + "\" e': ");
        System.out.print(words);
    }
}
