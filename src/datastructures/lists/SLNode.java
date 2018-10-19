package datastructures.lists;

/**
 * Node for a Singly-Linked List
 * @author JMichael652
 */
public class SLNode<T> {
    
    private T data;
    private SLNode<T> next;
    
    /**
     * Constructs an SLNode with data passed in argument. The next pointer is 
     * assumed to be null.
     * @param data The data stored in the SLNode
     */
    public SLNode(T data) {
        this(data, null);
    }
    
    /**
     * Constructs an SLNode with data and next pointer passed in arguments.
     * @param data The data stored in SLNode
     * @param next The node coming after the created note in a list structure
     */
    public SLNode(T data, SLNode next) {
        this.data = data;
        this.next = next;
    }
    
    /**
     * Gets the data stored in the SLNode
     * @return The data stored in the SLNode
     */
    public T getData() {
        return this.data;
    }
    
    /**
     * Sets the data to be stored in the SLNode
     * @param data The data to be stored in the SLNode
     */
    public void setData(T data) {
        this.data = data;
    }
    
    /**
     * Gets the SLNode appearing after the caller in a list structure
     * @return The SLNode appearing after the caller in a list structure
     */
    public SLNode getNext() {
        return this.next;
    }
    
    /**
     * Sets the SLNode to appear after the caller in a list structure
     * @param next the SLNode to appear after the caller in a list structure
     */
    public void setNext(SLNode next) {
        this.next = next;
    }
}
