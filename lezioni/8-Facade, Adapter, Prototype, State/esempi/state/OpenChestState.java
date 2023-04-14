import java.util.List;

public class OpenChestState<T> implements ChestState<T> {

    @Override
    public ChestState<T> open() {
        return this;
    }

    @Override
    public ChestState<T> close() {
        return new ClosedChestState<T>();
    }

    @Override
    public ChestState<T> seal() {
        return new SealedChestState<T>();
    }

    @Override
    public void add(List<T> items, T item) {
        items.add(item);
    }

    @Override
    public List<T> get(List<T> items) {
        return items;
    }

}