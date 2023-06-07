public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer(1000);
        Notifier n1 = new Notifier("Fest");
        Notifier n2 = new Notifier("Time's up!");

        timer.attach(n1);
        timer.attach(n2);
        timer.startTimer();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.restartTimer();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.stopTimer();
    }
}
