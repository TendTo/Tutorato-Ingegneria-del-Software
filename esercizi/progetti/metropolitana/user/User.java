package user;

import metro.ITicket;

/**
 * Utente che utilizza la metro.
 */
public class User {
    /**
     * Nome dell'utente.
     * Si può assumere sia univoco.
     */
    private String name;
    /**
     * Biglietto dell'utente.
     * Può essere null se l'utente non ha ancora comprato un biglietto.
     */
    private ITicket ticket;

    /**
     * Crea un nuovo utente.
     * 
     * @param name nome dell'utente
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Restituisce il nome dell'utente.
     * 
     * @return nome dell'utente
     */
    public String getName() {
        return name;
    }

    /**
     * Restituisce il biglietto dell'utente.
     * 
     * @return biglietto dell'utente
     */
    public ITicket getTicket() {
        return ticket;
    }

    /**
     * Imposta il biglietto dell'utente.
     * 
     * @param ticket biglietto dell'utente
     */
    public void setTicket(ITicket ticket) {
        this.ticket = ticket;
    }

    /**
     * L'utente si può validare il biglietto da solo, segnando la data e l'ora
     * correnti.
     */
    public void validateTicket() {
        if (ticket == null) {
            throw new IllegalStateException("Ticket is null");
        }
        ticket.validate();
    }
}