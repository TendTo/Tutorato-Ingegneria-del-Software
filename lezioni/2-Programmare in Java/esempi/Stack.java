public class Stack<T> {
    private class StackNode<V> {
        private V value;
        private StackNode<V> next;

        public StackNode(V value) {
            this.value = value;
            next = null;
        }

        public StackNode<V> getNext() {
            return next;
        }

        public void setNext(StackNode<V> next) {
            this.next = next;
        }

        public V getValue() {
            return value;
        }
    }

    private StackNode<T> top;
    private int length = 0;

    public Stack(int size) {
        top = null;
        length = 0;
    }

    public void push(T value) {
        StackNode<T> node = new StackNode<>(value);
        node.setNext(top);
        top = node;
        length++;
    }

    public T pop() {
        if (top == null) {
            System.err.println("Stack underflow");
            return null;
        }
        T value = top.getValue();
        top = top.getNext();
        length--;
        return value;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: [ ");
        StackNode<T> node = top;
        while (node != null) {
            sb.append(node.getValue());
            sb.append(" ");
            node = node.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println(stack);
    }
}
