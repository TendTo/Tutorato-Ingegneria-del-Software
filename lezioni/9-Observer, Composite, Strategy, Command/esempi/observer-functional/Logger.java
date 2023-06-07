public class Logger implements Observer {
    Subject subject;

    private void onLoaded(Subject subject) {
        System.out.println("Received: loaded");
    }

    private void onReady(Subject subject) {
        System.out.println("Received: ready");
    }

    private void onStopped(Subject subject) {
        System.out.println("Received: stopped");
    }

    @Override
    public void init(Subject subject) {
        if (subject == null)
            return;
        if (this.subject != null)
            clear();
        this.subject = subject;
        subject.subscribe("loaded", this::onLoaded);
        subject.subscribe("ready", this::onReady);
        subject.subscribe("stopped", this::onStopped);
    }

    @Override
    public void clear() {
        subject.unsubscribe("loaded", this::onLoaded);
        subject.unsubscribe("ready", this::onReady);
        subject.unsubscribe("stopped", this::onStopped);
        subject = null;
    }
}
