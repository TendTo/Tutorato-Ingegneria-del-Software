public class Node<T>{
    private T value;
    private Node<T> next;

    public Node(T val){
        this.value = val;
        this.next = null;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public T getVal(){
        return this.value;
    }

    public void setNext(Node<T> val){
        this.next = val;
    }
}
