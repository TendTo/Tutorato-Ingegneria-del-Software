package heap;

public interface Heap<T> {
    public void insert(T value);

    public T extract();

    public T peek();

    public int getSize();
    
    public int getHeight();

    public void update(int index, T value);

    public boolean isEmpty();

    public boolean isFull();
}
