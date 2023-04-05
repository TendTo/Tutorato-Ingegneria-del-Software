public abstract class AbsFileRemover {
    protected String fileName;

    public AbsFileRemover(String fileName) {
        this.fileName = fileName;
    }

    public abstract void removeFile();
}
