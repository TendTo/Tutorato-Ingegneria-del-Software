package metro;

import user.User;

/**
 * Biglietteria della metro.
 * Permette agli {@link user.User utenti} di comprare un {@link metro.ITicket biglietto}.
 * Ogni transazione verrà approvata dalla {@link bank.AbstractBank banca}.
 */
public interface IVendingMachine {
    /**
     * L'{@link user.User utente} compra un biglietto del tipo specificato.
     * L'operazione andrà a buon fine solo se l'utente ha abbastanza soldi sul
     * conto.
     * Soldi che, in quel caso, gli saranno sottratti.
     * 
     * @param user {@link user.User utente} che vuole comprare il biglietto
     * @param type tipo di biglietto da comprare
     * @return {@link metro.ITicket biglietto} acquistato
     */
    public ITicket buyTicket(User user, ITicket.TicketType type);
}
