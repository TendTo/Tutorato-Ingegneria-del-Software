import java.io.File;

public class FileRemoverFactory {
    public static AbsFileRemover getFileRemover(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            return new FileRemover(fileName);
        } else {
            return new NullFileRemover(fileName);
        }
    }
}
