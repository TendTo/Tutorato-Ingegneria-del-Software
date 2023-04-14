import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JsListAdapter<T> implements JSList<T> {
    private List<T> list;

    public JsListAdapter(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    @Override
    public T at(int index) {
        return list.get(index);
    }

    @Override
    public JSList<T> concat(JSList<T> list) {
        this.list.addAll(list.getList());
        return this;
    }

    @Override
    public JSList<T> filter(Predicate<T> p) {
        this.list = list.stream().filter(p).collect(Collectors.toList());
        return this;
    }

    @Override
    public JSList<T> push(T elem) {
        list.add(elem);
        return this;
    }

    @Override
    public T pop() {
        return list.remove(list.size() - 1);
    }

    @Override
    public int length() {
        return list.size();
    }

    @Override
    public JSList<T> reverse() {
        Collections.reverse(list);
        return this;
    }
}
