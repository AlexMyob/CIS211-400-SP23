import java.util.EmptyStackException;

/*
https://visualgo.net/en/list
 */
public class LinkedStack<T> implements Stack<T> {
    private Node<T> head = null;

    @Override
    public void push(T item) throws IllegalStateException {
        if (head == null) {
            // stack is empty
            // linked list is empty
            // special case
            head = new Node(item, null);
        } else {
            Node<T> newNode = new Node<T>(item, head);
            head = newNode;
        }
    }

    @Override
    public T pop() {
        if (head == null) {
            //The stack is empty
            throw new EmptyStackException();
        } else {
            T returnValue = head.data;
            head = head.next;
            return returnValue;
        }
    }

    @Override
    public T peek() {
        if (head == null) {
            throw new EmptyStackException();
        } else {
            return head.data;
        }
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int length() {
        Node<T> n = head;
        int length = 0;
        while (n != null) {
            length++;
            n = n.next;
        }
        return length;
    }
    public String toString() {
        String result = "";
        Node current = head;
        while(current.getNext() != null) {
            result += current.getData();
            if (current.getNext() != null) {
                result += ", ";
            }
            current = current.getNext();
        }
        return result;
    }
}