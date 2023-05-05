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
    private static MetroEntrance instance;
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
    }

    /**
     * Ritorna l'istanza del singleton.
     * 
     * @return istanza del singleton
     */
    public static MetroEntrance getInstance() {
        throw new UnsupportedOperationException("Unimplemented method 'getInstance'");
    }

    /**
     * Ritorna un {@link metro.ITurnstile tornello}, con un load balancing
     * round-robin.
     * 
     * @return {@link metro.ITurnstile tornello}
     */
    public ITurnstile getTurnstile() {
        throw new UnsupportedOperationException("Unimplemented method 'getTurnstile'");
    }

    /**
     * Ritorna una {@link metro.IVendingMachine biglietteria}, con un load
     * balancing round-robin.
     * 
     * @return {@link metro.IVendingMachine biglietteria}
     */
    public IVendingMachine getVendingMachine() {
        throw new UnsupportedOperationException("Unimplemented method 'getVendingMachine'");
    }
}
