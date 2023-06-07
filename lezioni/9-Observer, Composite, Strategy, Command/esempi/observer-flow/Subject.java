import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
    protected Set<Observer> observers = new HashSet<>();

    public void attach(Observer obs) {
        observers.add(obs);
    }

    public void detach(Observer obs) {
        // if (observers.contains(obs))
        observers.remove(obs);
    }

    public void onChange() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
