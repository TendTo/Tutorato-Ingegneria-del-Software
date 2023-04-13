import java.util.Random;

public class AbstractFactory {
    public static void main(String[] args) {
        ButtonFactory factory;
        if (args.length == 1) {
            if (args[0].equals("square")) {
                factory = new SquareButtonFactory();
            } else if (args[0].equals("circle")) {
                factory = new CircleButtonFactory();
            } else {
                System.out.println("Usage: java AbstractFactory [square|round]");
                return;
            }
        } else {
            Random random = new Random();
            int i = random.nextInt(2);
            if (i == 0) {
                factory = new SquareButtonFactory();
            } else {
                factory = new CircleButtonFactory();
            }
        }

        Window window = new Window(factory);
        window.draw();
    }
}
