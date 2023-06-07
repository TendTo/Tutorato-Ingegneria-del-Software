public class Notifier implements Observer {
    private String notification;

    public Notifier(String notification) {
        this.notification = notification;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(this.notification);
    }
}
