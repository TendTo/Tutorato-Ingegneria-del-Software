public abstract class Color {
    protected static final String CLEAR_CODE = "\u001B[0m";
    protected final String colorCode;

    Color(String colorCode) {
        this.colorCode = colorCode;
    }

    public void paint() {
        System.out.print(colorCode);
    }

    public void removePaint() {
        System.out.print(CLEAR_CODE);
    }
}
