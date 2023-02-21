/*

 * @author Delaware Technical Community College

 * Starter and/or reference code provided for Delaware Technical Community College courses.

 */

public interface Stack<T> {

    /**
     * Adds a new entry to the top of this stack.
     *
     * @param item An object to be added to the stack.
     * @throws IllegalStateException- if the element cannot be added at this time due to capacity restrictions
     */
    public void push(T item) throws IllegalStateException;


    /**
     * Removes and returns this stack's top entry.
     *
     * @return The object at the top of the stack.
     * @return null if the stack is empty
     */
    public T pop();


    /**
     * Retrieves this stack's top entry.
     *
     * @return The object at the top of the stack.
     * @return null if the stack is empty
     */
    public T peek();


    /**
     * Detects whether this stack is empty.
     *
     * @return True if the stack is empty.
     */
    public boolean isEmpty();


    /**
     * Retrieves the number of entries in this stack.
     *
     * @return number of entries.
     */
    public int length();
}