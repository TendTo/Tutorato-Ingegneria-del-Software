class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        Logger logger = new Logger();
        Cleaner cleaner = new Cleaner();

        logger.init(eventManager);
        cleaner.init(eventManager);

        eventManager.loaded();
        eventManager.ready();
        eventManager.stopped();
    }
}