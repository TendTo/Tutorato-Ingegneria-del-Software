public class Circle extends Shape {
    @Override
    public void draw() {
        this.color.paint();
        System.out.print("Circle");
        this.color.removePaint();
        System.out.println("");
    }
}
