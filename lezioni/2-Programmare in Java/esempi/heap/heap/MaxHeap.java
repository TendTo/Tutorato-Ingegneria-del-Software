package heap;

public class MaxHeap<T extends Comparable<T>> extends AbstractHeap<T> {
    public MaxHeap(T[] array) {
        super(array);
    }

    public MaxHeap(int size) {
        super(size);
    }

    @Override
    protected boolean shouldUpdateParent(int currentParent, int candidateParent) {
        return heapArray[candidateParent].compareTo(heapArray[currentParent]) > 0;
    }
}
