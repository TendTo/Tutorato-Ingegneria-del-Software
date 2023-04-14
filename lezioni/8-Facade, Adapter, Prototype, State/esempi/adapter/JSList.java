import java.util.List;
import java.util.function.Predicate;

public interface JSList<T> {
    public List<T> getList();

    public T at(int index);

    public JSList<T> concat(JSList<T> list);

    public JSList<T> filter(Predicate<T> p);

    public JSList<T> push(T elem);

    public T pop();

    public int length();

    public JSList<T> reverse();
}
