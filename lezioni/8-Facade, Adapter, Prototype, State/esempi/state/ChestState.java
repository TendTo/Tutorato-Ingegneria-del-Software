import java.util.List;

public interface ChestState<T> {
    public ChestState<T> open();
    public ChestState<T> close();
    public ChestState<T> seal();
    public void add(List<T> items, T item);
    public List<T> get(List<T> items);
}
