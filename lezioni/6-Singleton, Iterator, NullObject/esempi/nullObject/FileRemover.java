import java.io.File;

public class FileRemover extends AbsFileRemover {
    FileRemover(String fileName) {
        super(fileName);
    }

    public void removeFile() {
        File file = new File(fileName);
        file.delete();
        System.out.println("File " + fileName + " eliminato");
    }
}
