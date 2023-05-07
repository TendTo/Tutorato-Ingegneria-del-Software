public class Leaf extends Node {
    public Leaf(int value) {
        super(value);
    }

    @Override
    public int getSum() {
        return getValue();
    }
}
