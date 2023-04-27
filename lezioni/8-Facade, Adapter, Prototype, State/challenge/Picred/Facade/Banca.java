public class Banca { // Facade
    private int max = 1000;
    private int total;
    private Movimento mov = new Movimento();

    public Banca(int initialAmount) {
        this.total = initialAmount;
    }

    public void deposita(int amount) {
        if (total + amount <= max) {
            total += amount;
            mov.salva("Hai depositato " + amount);
            return;
        } else
            System.out.println("Capacita' massima raggiunta. Impossibile depositare");

    }

    public void storia() {
        mov.stampaMovimenti();
    }

    public void saldo() {
        System.out.println("Il saldo attuale e': " + total);
    }

    public void preleva(int amount) {
        if (total >= amount) {
            total -= amount;
            mov.salva("Hai prelevato " + amount);
        } else
            System.out.println("Fondi non disponibili per il prelievo!");
    }
}
