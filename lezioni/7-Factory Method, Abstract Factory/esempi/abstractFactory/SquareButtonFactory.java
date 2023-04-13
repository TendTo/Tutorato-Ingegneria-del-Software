public class SquareButtonFactory implements ButtonFactory {

    @Override
    public Button getMinimizeButton() {
        return new SquareMinimizeButton();
    }

    @Override
    public Button getMaximizeButton() {
        return new SquareMaximizeButton();
    }

    @Override
    public Button getCloseButton() {
        return new SquareCloseButton();
    }

}
