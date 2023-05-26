import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
    Set<Observer> observers = new HashSet<>();

    public void attach(Observer obs) {
        observers.add(obs);
    }

    public void detach(Observer obs) {
        observers.remove(obs);
    }

    public abstract void onChange();
}
