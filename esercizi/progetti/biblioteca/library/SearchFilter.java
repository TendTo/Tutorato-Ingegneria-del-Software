package library;

/**
 * Enumerazione che rappresenta i filtri di ricerca dei libri, per limitare la
 * ricerca della stringa ad un campo specifico.
 * 
 * I filtri possono essere:
 * <ul>
 * <li>titolo</li>
 * <li>autore</li>
 * <li>genere</li>
 * <li>anno</li>
 * <li>tutti</li>
 * </ul>
 */
public enum SearchFilter {
    TITLE, AUTHOR, GENRE, YEAR, ALL
}
