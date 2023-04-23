import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public abstract class Subject {
    protected Map<String, List<Consumer<Subject>>> events = new HashMap<>();

    public void subscribe(String eventType, Consumer<Subject> callback) {
        if (!events.containsKey(eventType)) {
            events.put(eventType, new ArrayList<>());
        }
        List<Consumer<Subject>> callbacks = events.get(eventType);
        callbacks.add(callback);
    }

    public void unsubscribe(String eventType, Consumer<Subject> callback) {
        List<Consumer<Subject>> callbacks = events.get(eventType);
        callbacks.remove(callback);
    }

    public void unsubscribeAll() {
        events.clear();
    }

    protected void notify(String eventType) {
        List<Consumer<Subject>> callbacks = events.get(eventType);
        for (Consumer<Subject> observer : callbacks) {
            observer.accept(this);
        }
    }
}
