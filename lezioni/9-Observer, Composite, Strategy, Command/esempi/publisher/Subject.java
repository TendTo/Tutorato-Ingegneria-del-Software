import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;

public abstract class Subject<T> {
    protected SubmissionPublisher<T> publisher = new SubmissionPublisher<>();

    public void subscribe(Subscriber<T> subscriber) {
        publisher.subscribe(subscriber);
    }

    protected void notify(T event) {
        publisher.submit(event);
    }

    public int getNumberOfSubscribers() {
        return publisher.getNumberOfSubscribers();
    }

    public void close() {
        publisher.close();
    }
}
