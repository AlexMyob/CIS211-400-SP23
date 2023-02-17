public class CustomStack<T> {
    private T stuff;

    public T peek() {
        return stuff;
    }

    public void push(T stuff) {
        this.stuff = stuff;
    }
}

