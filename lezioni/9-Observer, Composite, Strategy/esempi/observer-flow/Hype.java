public class Hype extends Subject {
    private int[] accounts = new int[10];

    Hype() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = 0;
        }
    }

    public int getBalance(int id) {
        return accounts[id];
    }

    public void withdraw(int id, int amount) {
        if (accounts[id] < amount)
            return;

        accounts[id] -= amount;
        onChange(id);
    }

    public void deposit(int id, int amount) {
        accounts[id] += amount;
        onChange(id);
    }

    public void onChange(int id) {
        for (Observer obs : observers) {
            if (obs instanceof Client client && client.id == id) {
                client.update(this);
            }
        }
    }
}
