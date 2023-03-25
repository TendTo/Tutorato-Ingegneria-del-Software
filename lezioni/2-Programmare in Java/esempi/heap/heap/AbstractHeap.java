package heap;

abstract class AbstractHeap<T extends Comparable<T>> implements Heap<T> {
    protected int size;
    protected T[] heapArray;

    @SuppressWarnings("unchecked")
    public AbstractHeap(int maxSize) {
        this.size = 0;
        heapArray = (T[]) new Comparable<?>[maxSize];
    }

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

    protected int getLeft(int index) {
        return 2 * index + 1;
    }

    protected int getRight(int index) {
        return 2 * index + 2;
    }

    protected int getParent(int index) {
        return (index - 1) / 2;
    }

    protected void swap(int index1, int index2) {
        T temp = heapArray[index1];
        heapArray[index1] = heapArray[index2];
        heapArray[index2] = temp;
    }

    protected abstract boolean shouldUpdateParent(int currentParent, int candidateParent);

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

    protected void fullHeapify() {
        for (int i = size / 2; i >= 0; i--) {
            heapify(i);
        }
    }

    protected void heapifyUp(int index) {
        int parent = getParent(index);
        if (parent >= 0 && shouldUpdateParent(parent, index)) {
            swap(parent, index);
            heapifyUp(parent);
        }
    }
}
