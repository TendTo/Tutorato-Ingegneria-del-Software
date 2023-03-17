class Circle {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (other.getClass() != getClass())
            return false;
        Circle otherCircle = (Circle) other;
        return this.radius == otherCircle.radius;
    }
}

public class Equals {
    public static void main(String[] args) {
        // The same object
        Circle circle = new Circle(1);
        System.out.println("SameCircle: " + circle.equals(circle));

        // Null
        Circle nullCircle = null;
        System.out.println("NullCircle: " + circle.equals(nullCircle));

        // Different class
        String differentClass = "Different class";
        System.out.println("DifferentClass: " + circle.equals(differentClass));

        // Different radius
        Circle differentRadius = new Circle(2);
        System.out.println("DifferentRadius: " + circle.equals(differentRadius));

        // Same radius
        Circle sameRadius = new Circle(1);
        System.out.println("SameRadius: " + circle.equals(sameRadius));
    }
}