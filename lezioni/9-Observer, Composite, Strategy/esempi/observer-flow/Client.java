public class Client implements Observer {
    public final int id;
    private int amount = 0;

    Client(int id) {
        this.id = id;
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof Hype h) {
            System.out.println("Utente " + id + ": Il tuo saldo e' stato aggiornato a " + h.getBalance(id));
        }
    }

}
