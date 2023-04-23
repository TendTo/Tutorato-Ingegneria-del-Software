import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            AppConfiguration config = AppConfiguration.getInstance("config.properties");
            System.out.println("Name: " + config.getName());
            System.out.println("Password: " + config.getPassword());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}