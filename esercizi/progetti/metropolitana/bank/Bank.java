package bank;

import java.util.HashMap;

import user.User;

public class Bank implements IBank {
    /**
     * Istanza singleton della banca.
     */
    private static Bank instance;
    /**
     * Conto di tutti gli utenti.
     */
    HashMap<String, Integer> accounts = new HashMap<>();

    public static Bank getInstance() {
        return new Bank();
    }

    @Override
    public void addAccount(User user, int amount) {
        throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
    }

    @Override
    public int getAmount(User user) {
        throw new UnsupportedOperationException("Unimplemented method 'getAmount'");
    }

    @Override
    public boolean buyTicket(User user, int price) {
        throw new UnsupportedOperationException("Unimplemented method 'buyTicket'");
    }
}
