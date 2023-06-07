public abstract class Node {
    private int value;
    private Node parent;

    public Node(int value) {
        this.value = value;
    }

    public boolean isRoot() {
        return parent == null;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public abstract int getSum();
}
