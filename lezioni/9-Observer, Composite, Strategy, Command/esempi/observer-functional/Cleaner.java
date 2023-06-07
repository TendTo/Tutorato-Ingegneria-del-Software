public class Cleaner implements Observer {
    Subject subject;

    private void onStopped(Subject subject) {
        System.out.println("Cleaning up...");
        subject.unsubscribeAll();
    }

    @Override
    public void init(Subject subject) {
        if (subject == null)
            return;
        if (this.subject != null)
            clear();
        this.subject = subject;
        subject.subscribe("stopped", this::onStopped);
    }

    @Override
    public void clear() {
        subject.unsubscribe("stopped", this::onStopped);
        subject = null;
    }

}
