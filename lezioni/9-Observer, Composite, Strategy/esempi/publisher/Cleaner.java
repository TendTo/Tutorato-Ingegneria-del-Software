import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class Cleaner implements Subscriber<String> {
    Subscription subscription;

    public Cleaner(EventManager eventManager) {
        eventManager.subscribe(this);
    }

    @Override
    public void onComplete() {
        System.out.println("Done");
    }

    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
    }

    @Override
    public void onNext(String event) {
        if (event instanceof String) {
            String eventName = event;
            if (eventName.equals("stopped")) {
                System.out.println("Cleaning up...");
            }
        }
        subscription.request(1);
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

}
