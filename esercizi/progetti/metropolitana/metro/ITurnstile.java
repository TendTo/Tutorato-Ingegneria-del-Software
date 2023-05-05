package metro;

import user.User;

/**
 * Tornello della metro, restituito da {@link MetroEntrance}.
 */
public interface ITurnstile {
    /**
     * Passa il {@link metro.ITicket biglietto} al tornello.
     * Questo si aprirà se il {@link metro.ITicket biglietto} è stato validato e non
     * è scaduto.
     * In caso contrario il tornello non si aprirà.
     * 
     * @param ticket {@link metro.ITicket biglietto} da inserire nel tornello
     */
    public void insertTicket(ITicket ticket);

    /**
     * L'utente prova a passare il tornello.
     * Questo avviene solo se l'ultimo {@link metro.ITicket biglietto} inserito ha
     * fatto aprire il tornello.
     * 
     * @param user utente che prova a passare il tornello
     */
    public void goThrough(User user);
}
