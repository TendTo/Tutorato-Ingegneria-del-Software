public class Rectangle extends Shape {
    @Override
    public void draw() {
        this.color.paint();
        System.out.print("Rectangle");
        this.color.removePaint();
        System.out.println("");
    }
}
