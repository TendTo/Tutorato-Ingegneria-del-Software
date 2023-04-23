import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class Logger implements Subscriber<String> {
    Subscription subscription;

    public Logger(EventManager eventManager) {
        eventManager.subscribe(this);
    }

    @Override
    public void onComplete() {
        System.out.println("Logger: Done");
    }

    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
    }

    @Override
    public void onNext(String event) {
        System.out.println("[LOG] Received event: " + event);
        subscription.request(1);
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }
}
