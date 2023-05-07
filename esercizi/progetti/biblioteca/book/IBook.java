package book;

/**
 * Interfaccia che rappresenta un libro.
 * Nel costruttore, sarà necessario specificare i dati del libro e il testo.
 * Nelle classi concrete, bisognerà distinguere fra Ebook e Book.
 * Il libro deve essere clonabile.
 */
public interface IBook extends Cloneable {
    /**
     * Restituisce il testo del libro.
     * 
     * @return il testo del libro
     */
    public String read();

    /**
     * Restituisce i dati del libro.
     * 
     * @return i dati del libro
     */
    public BookInfo getBookInfo();

    /**
     * Usa il libro per uccidere una zanzara.
     * Se usato su un ebook, non fa niente.
     */
    public void useBookToKillMosquito();

    /**
     * Restituisce il link per scaricare il libro.
     * Il link è prodotto dalla concatenazione di:
     * <ul>
     * <li>il titolo del libro</li>
     * <li>l'autore del libro</li>
     * <li>il genere del libro</li>
     * <li>l'anno di pubblicazione del libro</li>
     * </ul>
     * in questo modo:
     * 
     * <pre>
     *    https://www.example.com/download?title={titolo}&author={autore}&genre={genere}&year={anno}
     * </pre>
     * 
     * Se il libro è un ebook, restituisce il link per scaricare l'ebook.
     * Altrimenti restituisce una stringa vuota.
     * 
     * @return il link per scaricare il libro
     */
    public String getDownloadURL();

    /**
     * Restituisce una copia del libro.
     * 
     * @return una copia del libro
     */
    public IBook clone();
}
