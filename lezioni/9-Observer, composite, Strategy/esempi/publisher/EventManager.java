class EventManager extends Subject<String> {

    public void start() {
        notify("started");
    }

    public void stop() {
        notify("stopped");
    }

}