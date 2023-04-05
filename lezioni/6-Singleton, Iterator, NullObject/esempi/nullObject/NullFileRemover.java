public class NullFileRemover extends AbsFileRemover {
    NullFileRemover(String fileName) {
        super(fileName);
    }

    public void removeFile() {
        System.out.println("NullFileRemover: file " + fileName + " non trovato");
    }
}
