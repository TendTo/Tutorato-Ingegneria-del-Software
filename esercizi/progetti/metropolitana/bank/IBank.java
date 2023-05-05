package bank;

/**
 * Singleton che si occupa dei movimenti di denaro.
 * Quando un biglietto viene acquistato, la transazione deve prima essere
 * validata dalla banca,
 * che si occuperà di verificare il conto dell'utente e sottrarre il costo del
 * biglietto.
 */
public interface IBank {
    /**
     * Aggiunge un utente con un conto iniziale.
     * Da utilizzare solo all'inizio dell'applicazione.
     * 
     * @param user   id dell'utente
     * 
     * @param amount conto iniziale
     */
    public abstract void addAccount(String user, int amount);

    /**
     * Ritorna il conto dell'utente.
     * 
     * @param user id dell'utente
     * @return conto dell'utente
     */
    public abstract int getAmount(String user);

    /**
     * Prova ad acquistare un biglietto.
     * Se l'acquisto va a buon fine, il costo del biglietto viene sottratto dal
     * conto dell'utente, altrimenti viene restituito false e il conto non viene
     * modificato.
     * 
     * @param user  id dell'utente che vuole acquistare il biglietto
     * @param price costo del biglietto
     * @return true se l'acquisto va a buon fine, false altrimenti
     */
    public abstract boolean buyTicket(String user, int price);
}
