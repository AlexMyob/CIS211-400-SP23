public class ArrayStack<T> implements Stack<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] stack;
    private int count = 0;

    public ArrayStack() {
        stack = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayStack(int size) {
        stack = (T[]) new Object[size];
    }

    @Override
    public void push(T item) throws IllegalStateException {
        if (count > stack.length-1) {
            // array is full
            throw new IllegalStateException();
        } else {
            stack[count] = item;
            count++;
        }
    }
    @Override
    public T pop() {
        System.out.println("Pop: " + stack[count-1]);
            count--;
            return null;
        }
    @Override
    public T peek() {
        System.out.println("Peek: " + stack[count-1]);
        return null;
    }
    @Override
    public boolean isEmpty() {
        if (count==0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int length() {
        return count;
    }
    @Override
    public String toString() {
        System.out.print("Contents of stack: ");
        for (int i = 0; i < count; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
        System.out.println();
        return null;
    }
}