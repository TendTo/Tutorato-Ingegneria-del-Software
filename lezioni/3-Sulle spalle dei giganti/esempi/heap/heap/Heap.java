package heap;

/**
 * Un heap è una struttura dati che permette di memorizzare elementi in modo
 * tale
 * da poterli recuperare in ordine crescente o decrescente.
 * 
 * @param <T> il tipo degli elementi memorizzati
 */
public interface Heap<T extends Comparable<T>> extends Iterable<T> {

    /**
     * Inserisce un elemento nell'heap
     * 
     * @param value l'elemento da inserire
     * @throws HeapOperationException se l'heap è pieno
     */
    public void insert(T value) throws HeapOperationException;

    /**
     * Estrae l'elemento più piccolo (o più grande) dall'heap
     * 
     * @return l'elemento estratto
     * @throws HeapOperationException se l'heap è vuoto
     */
    public T extract() throws HeapOperationException;

    /**
     * Restituisce l'elemento più piccolo (o più grande) senza rimuoverlo
     * 
     * @return l'elemento più piccolo (o più grande) contenuto nell'heap
     * @throws HeapOperationException se l'heap è vuoto
     */
    public T peek() throws HeapOperationException;

    /**
     * Restituisce il numero di elementi contenuti nell'heap
     * 
     * @return il numero di elementi contenuti nell'heap
     */
    public int getSize();

    /**
     * Restituisce l'altezza dell'heap visto come albero binario
     * 
     * @return l'altezza dell'heap
     */
    public int getHeight();

    /**
     * Aggiorna l'elemento in posizione index con il nuovo valore value
     * 
     * @param index l'indice dell'elemento da aggiornare
     * @param value il nuovo valore
     * @throws HeapOperationException se l'heap è vuoto
     */
    public void update(int index, T value) throws HeapOperationException;

    /**
     * Verifica se l'heap è vuoto
     * 
     * @return {@code true} se l'heap è vuoto, {@code false} altrimenti
     */
    public boolean isEmpty();

    /**
     * Verifica se l'heap è pieno
     * 
     * @return {@code true} se l'heap è pieno, {@code false} altrimenti
     */
    public boolean isFull();
}
