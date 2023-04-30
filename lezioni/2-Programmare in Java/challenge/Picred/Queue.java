import java.util.LinkedList;
import java.util.List;



public class Queue<T>{
    private int size;
    private List<T> queue;

    public Queue(){
        this.size = 0;
        this.queue = new LinkedList<T>();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(T val){
        this.queue.add(val);
        this.size+=1;
    }

    public T dequeue(){
        if(this.isEmpty()){
            System.out.println("Empty Queue. Can not dequeue.");
            throw new IndexOutOfBoundsException();
        }

        T temp = queue.get(0);
        queue.remove(0);
        this.size-=1;
        return temp;
    }

    public int getSize() {
        System.out.println("Queue size: " + size);
        return size;
    }


    public void print(){
        if(this.isEmpty()){
            System.out.println("Queue: empty");
            return;
        }

        System.out.print("Queue: ");
        for(T val:queue){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
