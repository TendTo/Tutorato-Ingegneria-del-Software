public class CircleButtonFactory implements ButtonFactory {

    @Override
    public Button getMinimizeButton() {
        return new CircleMinimizeButton();
    }

    @Override
    public Button getMaximizeButton() {
        return new CircleMaximizeButton();
    }

    @Override
    public Button getCloseButton() {
        return new CircleCloseButton();
    }
}
