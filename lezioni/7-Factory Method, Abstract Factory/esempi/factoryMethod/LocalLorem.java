import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class LocalLorem implements Lorem {
    private static final String LOREM_STRING = "Lorem ipsum";
    private String loremFilePath;

    LocalLorem(String loremFilePath) {
        this.loremFilePath = loremFilePath;
    }

    @Override
    public String getLorem() {
        try (BufferedReader reader = new BufferedReader(new FileReader(loremFilePath))) {
            List<String> lines = reader.lines().toList();
            if (lines.size() == 0 || !lines.get(0).contains(LOREM_STRING)) {
                return "";
            }
            return String.join(" ", lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
