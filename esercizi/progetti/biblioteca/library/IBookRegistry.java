package library;

import java.util.List;

import book.IBook;

/**
 * Interfaccia che rappresenta il registro della biblioteca.
 * Tiene traccia dei libri presenti nella biblioteca la loro posizione,
 * permettendo di cercarli.
 */
interface IBookRegistry {
    /**
     * Registra un libro nella biblioteca.
     * 
     * @param book il libro da registrare
     */
    public void registerBook(IBook book, BookPosition bookPosition);

    /**
     * Rimuove un libro dal registro della biblioteca.
     * 
     * @param book il libro da rimuovere
     */
    public void unregisterBook(IBook book);

    /**
     * Cerca un libro nella biblioteca in base al filtro di ricerca.
     * 
     * @param search stringa da cercare
     * @param filter filtro di ricerca, che può essere limitata a titolo, autore,
     *               anno
     * @return il risultato della ricerca: i dati dei libri che corrispondono al
     *         filtro e la loro posizione nella biblioteca
     */
    public List<BookSearchResult> searchBook(String search, SearchFilter filter);
}