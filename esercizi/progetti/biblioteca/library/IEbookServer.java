package library;

import book.IBook;

/**
 * Interfaccia che rappresenta il server di ebook.
 */
public interface IEbookServer {
    /**
     * Carica un libro sul server.
     * 
     * @param book il libro da caricare
     * @return l'URL del libro caricato
     */
    public String uploadBook(IBook book);

    /**
     * Rimuove un libro dal server.
     * 
     * @param url l'URL del libro da rimuovere
     * @throws IndexOutOfBoundsException se l'URL non è valido
     */
    public void deleteBook(String url) throws IndexOutOfBoundsException;

    /**
     * Scarica un libro dal server.
     * 
     * @param url l'URL del libro da scaricare
     * @return il libro scaricato
     * @throws IndexOutOfBoundsException se l'URL non è valido
     */
    public IBook downloadBook(String url) throws IndexOutOfBoundsException;
}
