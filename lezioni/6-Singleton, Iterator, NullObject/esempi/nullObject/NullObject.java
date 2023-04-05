
public class NullObject {
    public static void main(String[] args) {
        AbsFileRemover fileRemover = FileRemoverFactory.getFileRemover("file.txt");
        fileRemover.removeFile();
    }
}
