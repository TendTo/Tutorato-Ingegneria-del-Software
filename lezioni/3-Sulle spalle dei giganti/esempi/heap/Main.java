import heap.MaxHeap;
import heap.MinHeap;
import heap.Heap;

public class Main {

    public static void main(String[] args) {
        Heap<Integer> heap = new MinHeap<>(30);
        System.out.println(heap);
        heap.insert(5);
        heap.insert(3);
        heap.insert(7);
        heap.insert(1);
        heap.insert(9);
        heap.insert(2);
        heap.insert(4);
        heap.insert(6);
        heap.insert(8);
        heap.insert(10);

        System.out.println("The heap is: \n" + heap);

        System.out.println("The ordered list is: ");
        for (Integer i : heap) {
            System.out.println(i);
        }
    }
}
