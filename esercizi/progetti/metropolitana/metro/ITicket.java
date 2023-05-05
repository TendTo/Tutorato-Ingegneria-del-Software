package metro;

/**
 * Interfaccia che rappresenta un biglietto della metropolitana.
 * Ogni biglietto ha un costo, che viene sottratto dal conto dell'utente quando
 * viene acquistato.
 * Dopo essere stato acquistato, il biglietto deve essere validato per poter
 * essere utilizzato.
 * Un biglietto può essere utilizzato solo una volta, dopo di che è scaduto.
 * 
 * non acquistato -> acquistato -> validato -> scaduto
 */
public interface ITicket {
    /**
     * Tipi di biglietto.
     * Nel nostro caso, cambia solo il prezzo, ma idealmente potrebbe avere più
     * funzionalità (pagamenti contactless, biglietti per più persone, ecc...)
     * - STANDARD: 1€
     * - PREMIUM: 2€
     */
    public enum TicketType {
        STANDARD,
        PREMIUM
    }

    /**
     * Un biglietto viene utilizzato quando lo si insersce in un tornello.
     */
    public void use();

    /**
     * Valida il biglietto
     */
    public void validate();

    /**
     * Ritorna true se il biglietto è scaduto (è stato utilizzato)
     * 
     * @return se il biglietto è scaduto (è stato utilizzato)
     */
    public boolean isExpired();

    /**
     * Ritorna true se il biglietto è già stato validato
     * 
     * @return se il biglietto è già stato validato
     */
    public boolean isValidated();

    /**
     * Ritorna il costo del biglietto
     * 
     * @return costo del biglietto
     */
    public int getCost();
}
