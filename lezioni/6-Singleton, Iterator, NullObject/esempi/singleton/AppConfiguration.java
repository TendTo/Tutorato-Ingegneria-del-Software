import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfiguration {
    private static AppConfiguration instance = null;
    private String path;
    private String name;
    private String password;

    private AppConfiguration(String path) throws IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream(path);
        prop.load(input);
        this.name = prop.getProperty("name");
        this.password = prop.getProperty("password");
        this.path = path;
        input.close();
    }

    public static AppConfiguration getInstance(String path) throws IOException {
        if (instance == null) {
            instance = new AppConfiguration(path);
        }
        return instance;
    }

    public static AppConfiguration getInstance() {
        if (instance == null) {
            throw new RuntimeException("Configuration not initialized");
        }
        return instance;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
