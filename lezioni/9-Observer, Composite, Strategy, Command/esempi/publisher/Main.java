class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        new Logger(eventManager);
        new Cleaner(eventManager);

        System.out.println("Number of subscribers: " + eventManager.getNumberOfSubscribers());

        eventManager.start();
        eventManager.stop();
        eventManager.close();

        // Sleep for 1 second to allow the event manager to close
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Number of subscribers: " + eventManager.getNumberOfSubscribers());
    }
}