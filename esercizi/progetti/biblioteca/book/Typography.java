package book;

/**
 * Classe che rappresenta la tipografia.
 * Viene utilizzata per produrre libri cartacei o digitali.
 */
public class Typography {
    private boolean produceDigitalBooks;
    private static Typography instance;

    /**
     * Restituisce l'istanza della classe Typography.
     * 
     * @return l'istanza della classe Typography
     */
    public static Typography getInstance() {
        throw new UnsupportedOperationException("Unimplemented method 'getInstance'");
    }

    /**
     * Produce un libro cartaceo o digitale a partire da un testo e dai suoi dati.
     * Il tipo dipende dalla configurazione
     * {@link book.Typography.produceDigitalBooks produceDigitalBooks} della
     * tipografia.
     * 
     * @param bookInfo dati del libro
     * @param text     testo del libro
     * @return il libro prodotto
     */
    public IBook printBook(BookInfo bookInfo, String text) {
        throw new UnsupportedOperationException("Unimplemented method 'printBook'");
    }

    /**
     * Restituisce true se la tipografia produce libri digitali, false altrimenti.
     * 
     * @return true se la tipografia produce libri digitali, false altrimenti
     */
    public boolean isProducingDigitalBooks() {
        throw new UnsupportedOperationException("Unimplemented method 'isProducingDigitalBooks'");
    }

    /**
     * Imposta se la tipografia deve produrre libri digitali o cartacei.
     * 
     * @param produceDigitalBooks true se la tipografia deve produrre libri
     *                            digitali, false altrimenti
     */
    public void setProduceDigitalBooks(boolean produceDigitalBooks) {
        throw new UnsupportedOperationException("Unimplemented method 'setProduceDigitalBooks'");
    }
}
