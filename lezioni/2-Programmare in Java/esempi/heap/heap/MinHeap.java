package heap;

public class MinHeap<T extends Comparable<T>> extends AbstractHeap<T> {
    public MinHeap(T[] array) {
        super(array);
    }

    public MinHeap(int size) {
        super(size);
    }

    @Override
    protected boolean shouldUpdateParent(int currentParent, int candidateParent) {
        return heapArray[candidateParent].compareTo(heapArray[currentParent]) < 0;
    }
}
