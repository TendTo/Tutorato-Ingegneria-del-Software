public class Queue<T> {

    private Node<T> head;
    private int size;

    public Queue() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    Node<T> getHead() {
        return this.head;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void insertHead(T val) {
        if (isEmpty()) {
            head = new Node<T>(val);
            size++;
            System.out.println("aggiunto come primo elemento il valore : " + val);
        }
    }

    public void insert(T val) {
        if (isEmpty()) {
            insertHead(val);
            return;
        }
        Node<T> toInsert = new Node<T>(val);
        toInsert.setNext(head);
        head = toInsert;
        size++;
        System.out.println("aggiunto in testa alla coda il valore : " + val);
        return;
    }

    public void delete() {
        if (isEmpty()) {
            System.err.println("la coda è già vuota");
            return;
        }
        Node<T> cur = head;
        Node<T> prev = null;
        while (cur.getNext() != null) {
            prev = cur;
            cur = cur.getNext();
        }
        prev.setNext(null);
        size--;
        return;
    }

    @Override
    public String toString() {
        String ss = " ";
        Node<T> node = head;
        while (node != null) {
            ss += " " + node.getVal();
            node = node.getNext();
        }
        return ss;
    }
}
