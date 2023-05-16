class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        Color red = new Red();
        Color blue = new Blue();

        rectangle.setColor(red);
        circle.setColor(blue);

        rectangle.draw();
        circle.draw();
    }
}