import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.lang.StringBuilder;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;

public class File{
    private String file = "";


    public File(String path){
        this.file = path;
    }


    public String readFirstLine()  {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            return line;
        } catch (IOException e) {
            e.printStackTrace();
            return "ERROR!";
        }
    }


    public String readAllLines()  {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder builder = new StringBuilder();
            String line = "";
            while((line = reader.readLine()) != null){
                builder.append(line);
            }
            return builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "File not found!";
        }
    }


    public void write(String text){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}