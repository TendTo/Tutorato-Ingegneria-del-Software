public class Window {
    private ButtonFactory factory;

    public Window(ButtonFactory factory) {
        this.factory = factory;
    }

    public void draw() {
        // Draw the frame of a window
        Button min = factory.getMinimizeButton();
        Button max = factory.getMaximizeButton();
        Button close = factory.getCloseButton();
        System.out.println("---------------------------");
        System.out.print("|                ");
        min.draw();
        max.draw();close.draw();
        System.out.println("|");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("---------------------------");
    }
}
