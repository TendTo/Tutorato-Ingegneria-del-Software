package library;

import book.IBook;

/**
 * Interfaccia che rappresenta uno scaffale della biblioteca.
 */
interface IBookRack {
    /**
     * Aggiunge un libro allo scaffale.
     * 
     * @param book il libro da aggiungere
     * @return la posizione del libro nello scaffale, a partire dal primo ripiano
     * @throws IllegalStateException se lo scaffale è pieno
     */
    public int addBook(IBook book) throws IllegalStateException;

    /**
     * Rimuove il libro nella posizione indicata dallo scaffale.
     * 
     * @param shelfNumber la posizione del libro da rimuovere
     * @throws IndexOutOfBoundsException se la posizione indicata non è valida
     */
    public void removeBook(int shelfNumber) throws IndexOutOfBoundsException;

    /**
     * Restituisce il libro nella posizione indicata dello scaffale.
     * 
     * @param shelfNumber la posizione del libro da restituire
     * @return il libro nella posizione indicata
     * @throws IndexOutOfBoundsException se la posizione indicata non è valida
     */
    public IBook getBook(int shelfNumber) throws IndexOutOfBoundsException;

    /**
     * Il numero massimo di ripiani dello scaffale, determina la sua capienza.
     * 
     * @return il numero massimo di ripiani dello scaffale
     */
    public int getNumberOfShelves();
}
