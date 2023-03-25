class Shape {
}

class Circle extends Shape {
    public int radius;

    Circle(int radius) {
        this.radius = radius;
    }
}

class Casting {
    public static void main(String[] args) {
        Circle c = new Circle(1);

        // Il cerchio è una sotto-classe di Shape
        Shape s = c;

        System.out.println("c: " + c.getClass());
        System.out.println("s: " + s.getClass());

        // Controllo sul tipo di s
        if (s instanceof Circle) {
            c = (Circle) s;
            System.out.println("c after casting: " + c.getClass());
        }
    }
}
