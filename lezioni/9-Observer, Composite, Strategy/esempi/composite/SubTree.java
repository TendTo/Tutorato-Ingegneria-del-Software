import java.util.ArrayList;
import java.util.List;

public class SubTree extends Node {
    private List<Node> children = new ArrayList<>();

    public SubTree(int value) {
        super(value);
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        child.setParent(this);
        children.add(child);
    }

    @Override
    public int getSum() {
        int sum = getValue();
        for (Node child : children) {
            sum += child.getSum();
        }
        return sum;
    }
}
