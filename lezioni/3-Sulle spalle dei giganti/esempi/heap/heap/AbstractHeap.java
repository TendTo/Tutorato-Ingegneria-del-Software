package heap;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Implementazione di un heap generico.
 */
abstract class AbstractHeap<T extends Comparable<T>> implements Heap<T> {

    /**
     * Iterator utilizzato per scorrere l'heap in un ciclo foreach
     */
    class HeapIterator implements Iterator<T> {
        /**
         * Indice dell'elemento corrente
         */
        private int index;

        @Override
        public boolean hasNext() {
            if (index < getSize())
                return true;
            return false;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T element = heapArray[index];
                index++;
                return element;
            }
            throw new NoSuchElementException();
        }
    }

    /**
     * Numero corrente di elementi contenuti nell'heap
     */
    protected int size;
    /**
     * Array di elementi contenuti nell'heap
     */
    protected T[] heapArray;

    /**
     * Crea un heap a partire da un array di elementi.
     * <p>
     * L'array sarà usato come struttura dati per memorizzare gli elementi.
     * <p>
     * La lunghezza dell'array sarà anche la dimensione massima dell'heap.
     * 
     * @param array l'array di elementi da cui partire per creare l'heap
     */
    @SuppressWarnings("unchecked")
    public AbstractHeap(int maxSize) {
        this.size = 0;
        heapArray = (T[]) new Comparable<?>[maxSize];
    }

    /**
     * Crea un heap di dimensione massima size
     * 
     * @param size la dimensione massima dell'heap
     */
    public AbstractHeap(T[] array) {
        heapArray = array;
        size = array.length;
        fullHeapify();
    }

    @Override
    public int getHeight() {
        int size = this.size;
        int height = 0;
        while (size > 0) {
            height++;
            size >>= 1;
        }
        return height;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == heapArray.length;
    }

    @Override
    public void insert(T value) {
        if (isFull()) {
            throw new HeapOperationException("Heap is full");
        }
        heapArray[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new HeapOperationException("Heap is empty");
        }
        return heapArray[0];
    }

    @Override
    public T extract() {
        if (isEmpty()) {
            throw new HeapOperationException("Heap is empty");
        }
        T value = heapArray[0];
        heapArray[0] = heapArray[size - 1];
        size--;
        heapify(0);
        return value;
    }

    @Override
    public void update(int index, T value) {
        if (index < 0 || index >= size) {
            throw new HeapOperationException("Index out of bounds");
        }
        heapArray[index] = value;
        heapify(index);
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Heap is empty";
        }
        StringBuilder sb = new StringBuilder();
        int level = 0;
        int height = getHeight();
        for (int i = 0; i < size; i++) {
            if ((i == (1 << level) - 1)) {
                if (i != 0)
                    sb.append("\n");
                level++;
            }
            for (int j = 0; j < (height - level + 1) * height; j++) {
                sb.append(" ");
            }
            sb.append(heapArray[i]);
        }
        return sb.toString();
    }

    /**
     * Restituisce l'indice del figlio sinistro di un nodo
     * 
     * @param index l'indice del nodo
     * @return l'indice del figlio sinistro
     */
    protected int getLeft(int index) {
        return 2 * index + 1;
    }

    /**
     * Restituisce l'indice del figlio destro di un nodo
     * 
     * @param index l'indice del nodo
     * @return l'indice del figlio destro
     */
    protected int getRight(int index) {
        return 2 * index + 2;
    }

    /**
     * Restituisce l'indice del nodo padre di un nodo
     * 
     * @param index l'indice del nodo
     * @return l'indice del nodo padre
     */
    protected int getParent(int index) {
        return (index - 1) / 2;
    }

    /**
     * Scambia due elementi dell'array {@link #heapArray}
     * 
     * @param index1 indice del primo elemento
     * @param index2 indice del secondo elemento
     */
    protected void swap(int index1, int index2) {
        T temp = heapArray[index1];
        heapArray[index1] = heapArray[index2];
        heapArray[index2] = temp;
    }

    /**
     * Determina se il nodo corrente è un candidato a diventare il nuovo nodo padre
     * applicando la funzione {@code compareTo} degli elementi di tipo {@link T}
     * 
     * @param currentParent   l'indice del padre attuale
     * @param candidateParent l'indice del candidato a nuovo padre
     * @return {@code true} se il candidato, se spostato in posizione del padre
     *         attuale, ripristina la proprietà di ordinamento dell'heap,
     *         {@code false} altrimenti
     */
    protected abstract boolean shouldUpdateParent(int currentParent, int candidateParent);

    /**
     * Ripristina la proprietà di heap a partire da un nodo.
     * Si assume che la proprietà sia rispettata per i nodi figli.
     * 
     * @param index l'indice del nodo da cui partire
     */
    protected void heapify(int index) {
        int left = getLeft(index);
        int right = getRight(index);
        int newParent = index;
        if (left < size && shouldUpdateParent(newParent, left)) {
            newParent = left;
        }
        if (right < size && shouldUpdateParent(newParent, right)) {
            newParent = right;
        }
        if (newParent != index) {
            swap(index, newParent);
            heapify(newParent);
        }
    }

    /**
     * Ripristina la proprietà di heap per tutti i nodi dell'heap, partendo dai nodi
     * non foglia più in basso e risalendo fino alla radice.
     */
    protected void fullHeapify() {
        for (int i = size / 2; i >= 0; i--) {
            heapify(i);
        }
    }

    /**
     * Ripristina la proprietà di heap a partire da un nodo e risalendo fino alla
     * radice.
     * 
     * @param index l'indice del nodo da cui partire
     */
    protected void heapifyUp(int index) {
        int parent = getParent(index);
        if (parent >= 0 && shouldUpdateParent(parent, index)) {
            swap(parent, index);
            heapifyUp(parent);
        }
    }

    @Override
    public HeapIterator iterator() {
        return new HeapIterator();
    }
}
