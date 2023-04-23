
public class Main {
    public static void main(String[] args) {
        AbsFileRemover fileRemover = FileRemoverFactory.getFileRemover("file.txt");
        fileRemover.removeFile();
    }
}
