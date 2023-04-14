import java.util.ArrayList;
import java.util.List;

public class Chest<T> {
    List<T> items;
    ChestState<T> state;

    public Chest() {
        items = new ArrayList<T>();
        state = new OpenChestState<T>();
    }

    public void open() {
        state = state.open();
    }

    public void close() {
        state = state.close();
    }

    public void seal() {
        state = state.seal();
    }

    public void addItem(T item) {
        state.add(items, item);
    }

    public List<T> getItems() {
        return state.get(items);
    }
}
