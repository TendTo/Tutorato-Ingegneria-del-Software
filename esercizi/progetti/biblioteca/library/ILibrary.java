package library;

import java.util.List;

import book.IBook;

/**
 * Interfaccia della biblioteca.
 * Dovrebbe essere implementata da un singleton.
 * I libri possono essere aggiunti o rimossi.
 * Per poter fare operazioni sui libri, bisogna conoscere dove sono stati
 * posizionati (numero di scaffale e di ripiano).
 * Quindi potrebbe essere necessario cercarli.
 */
public interface ILibrary {

    /**
     * Aggiunge un libro alla biblioteca.
     * 
     * @param book il libro da aggiungere
     * @return la posizione del libro appena inserito nella biblioteca
     * @throws IllegalStateException se la biblioteca è piena
     */
    public BookPosition addBook(IBook book) throws IllegalStateException;

    /**
     * Rimuove un libro dalla biblioteca.
     * 
     * @param book libro da rimuovere dalla biblioteca
     */
    public void removeBook(IBook book);

    /**
     * Cerca un libro nella biblioteca.
     * È possibile specificare un filtro di ricerca per limitare la ricerca.
     * 
     * @param search stringa da cercare
     * @param filter filtro di ricerca, che può essere limitata a titolo, autore,
     *               genere o anno
     * @return il risultato della ricerca: i dati dei libri che corrispondono al
     *         filtro e la loro posizione nella biblioteca
     */
    public List<BookSearchResult> searchBook(String search, SearchFilter filter);

    /**
     * Prende un libro fisico dalla biblioteca.
     * 
     * @param bookPosition la posizione del libro da prendere
     * @return il libro nella posizione indicata
     */
    public IBook getBook(BookPosition bookPosition);

    /**
     * Restituisce il numero di scaffali della biblioteca.
     * 
     * @return il numero di scaffali della biblioteca
     */
    public int getNumberOfRacks();
}
