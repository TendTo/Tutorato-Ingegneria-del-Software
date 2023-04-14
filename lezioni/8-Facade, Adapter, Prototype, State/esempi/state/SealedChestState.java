import java.util.List;

public class SealedChestState<T> implements ChestState<T> {

    @Override
    public ChestState<T> open() {
        return this;
    }

    @Override
    public ChestState<T> close() {
        return this;
    }

    @Override
    public ChestState<T> seal() {
        return this;
    }

    @Override
    public void add(List<T> items, T item) {
        throw new UnsupportedOperationException("Can't add to a sealed chest");
    }

    @Override
    public List<T> get(List<T> items) {
        throw new UnsupportedOperationException("Can't get items from a sealed chest");
    }

}
