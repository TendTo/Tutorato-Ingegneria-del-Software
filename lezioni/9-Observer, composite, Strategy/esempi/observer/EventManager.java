class EventManager extends Subject {

    public void loaded() {
        notify("loaded");
    }

    public void ready() {
        notify("ready");
    }

    public void stopped() {
        notify("stopped");
    }
}