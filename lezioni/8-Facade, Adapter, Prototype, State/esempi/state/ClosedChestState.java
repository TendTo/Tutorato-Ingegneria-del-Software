import java.util.List;

public class ClosedChestState<T> implements ChestState<T> {

    @Override
    public ChestState<T> open() {
        return new OpenChestState<T>();
    }

    @Override
    public ChestState<T> close() {
        return this;
    }

    @Override
    public ChestState<T> seal() {
        return new SealedChestState<T>();
    }

    @Override
    public void add(List<T> items, T item) {
        throw new UnsupportedOperationException("Can't add to a closed chest");
    }

    @Override
    public List<T> get(List<T> items) {
        throw new UnsupportedOperationException("Can't get items from a closed chest");
    }

}