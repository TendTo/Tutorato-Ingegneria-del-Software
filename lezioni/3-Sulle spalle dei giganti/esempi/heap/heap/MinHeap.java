package heap;

/**
 * Un min heap è un heap in cui il nodo padre contiene un elemento che, secondo
 * la funzione di ordinamento stabilita, è sempre non più piccolo di quelli
 * contenuti nei nodi figli.
 */
public class MinHeap<T extends Comparable<T>> extends AbstractHeap<T> {
    /**
     * Crea un min heap a partire da un array di elementi.
     * <p>
     * L'array sarà usato come struttura dati per memorizzare gli elementi.
     * <p>
     * La lunghezza dell'array sarà anche la dimensione massima dell'heap.
     * 
     * @param array l'array di elementi da cui partire per creare l'heap
     */
    public MinHeap(T[] array) {
        super(array);
    }

    /**
     * Crea un min heap di dimensione massima size
     * 
     * @param size la dimensione massima dell'heap
     */
    public MinHeap(int size) {
        super(size);
    }

    @Override
    protected boolean shouldUpdateParent(int currentParent, int candidateParent) {
        return heapArray[candidateParent].compareTo(heapArray[currentParent]) < 0;
    }
}
