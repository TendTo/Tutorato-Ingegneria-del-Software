import java.util.concurrent.CompletableFuture;

public class Timer extends Subject {
    private final int startingTime;
    private volatile int secondsRemaining;
    private CompletableFuture<Void> future;

    public Timer(int time) {
        this.startingTime = time;
    }

    public void startTimer() {
        this.secondsRemaining = this.startingTime;
        this.future = CompletableFuture.runAsync(() -> {
            while (this.secondsRemaining > 0) {
                tick();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void stopTimer() {
        this.future.cancel(true);
    }

    public void restartTimer() {
        this.stopTimer();
        this.startTimer();
    }

    public int getRemainingSeconds() {
        return secondsRemaining;
    }

    public void tick() {
        secondsRemaining--;
        if (secondsRemaining == 0)
            notifyObservers();
    }

    public int getStartingTime() {
        return startingTime;
    }
}
