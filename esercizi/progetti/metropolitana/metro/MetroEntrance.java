package metro;

/**
 * Singleton che effettua un load balancing sui {@link metro.ITurnstile
 * tornelli} e sulle {@link metro.IVendingMachine biglietterie} della
 * metro.
 */
public class MetroEntrance {
    /**
     * Istanza del singleton.
     */
    private static MetroEntrance instance = null;
    /**
     * Lista dei tornelli della metro.
     */
    private ITurnstile[] turnstiles = new ITurnstile[4];
    /**
     * Lista dei tornelli della metro.
     */
    private IVendingMachine[] vendingMachines = new IVendingMachine[2];

    /**
     * Costruttore privato del singleton.
     */
    private MetroEntrance() {
        // TODO
    }

    /**
     * Ritorna l'istanza del singleton.
     * 
     * @return istanza del singleton
     */
    public static MetroEntrance getInstance() {
        // TODO
        return null;
    }

    /**
     * Ritorna un {@link metro.ITurnstile tornello}, con un load balancing
     * round-robin.
     * 
     * @return {@link metro.ITurnstile tornello}
     */
    public ITurnstile getTurnstile() {
        // TODO
        return null;
    }

    /**
     * Ritorna una {@link metro.IVendingMachine biglietteria}, con un load
     * balancing round-robin.
     * 
     * @return {@link metro.IVendingMachine biglietteria}
     */
    public IVendingMachine getVendingMachine() {
        // TODO
        return null;
    }
}
