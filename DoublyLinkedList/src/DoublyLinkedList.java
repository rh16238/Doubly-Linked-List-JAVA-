package DoublyLinkedList;

/**
 * Doubly linked list of Value type V
 * @param <V> Value type of list.
 */
public class DoublyLinkedList<V>
{
    private DoublyLinkedNode<V> startNode;
    private DoublyLinkedNode<V> endNode;
    private int length = 0;
    /**
     * Returns a new DoublyLinkedList
     */
    public DoublyLinkedList()
    {
        
    }
    
    /** 
     * @return The length of the list 
     */
    public int Length()
    {
        return length;
    }
    
    /**
     * Adds a value to the start of list
     * @param v The value of type V to add
     */
    public void addValueStart(V v)
    {
        if (startNode == null)
        {
            startNode = new DoublyLinkedNode(v,null,null);
            endNode = startNode;
        }
        else
        {
            DoublyLinkedNode<V> newStart = new DoublyLinkedNode(v,startNode, null);
            startNode = newStart;
        }
        length++;
    }
    
     /**
     * Adds a value to the end of list
     * @param v The value of type V to add
     */
    public void addValueEnd(V v)
    {
        if (endNode == null)
        {
            endNode = new DoublyLinkedNode(v,null,null);
            startNode = endNode;
        }
        else
        {
            DoublyLinkedNode<V> newEnd = new DoublyLinkedNode(v,null,endNode);
            endNode = newEnd;
        }
        length++;
    }
    
    /**
     * Returns the value of the item at the list index specified.
     * @param index the index of the value to return.
     * @return 
     */
    public V getValueAt(int index)
    {
        if (indexWithinBounds(index))
        {
            getValueAtIndexVisitor<V> visitor = new getValueAtIndexVisitor<>(index);
            visitor.visitNode(startNode);
            return visitor.value;
        }
        else {return null;}
    }
    
    /**
     * Removes the item at the specified index of the list
     * @param index The index of the item to be removed.
     */
    public void removeAt(int index)
    {
        if (indexWithinBounds(index))
        {
            removeAtVisitor<V> visitor = new removeAtVisitor<>(index);
            visitor.visitNode( startNode);
            index--;
        }
        
    }
    
    /**
     * Determines if an index is within list bounds.
     * @param index The index to check
     * @return If the index is a valid index within the list.
     */
    private boolean indexWithinBounds(int index)
    {
        return ((index<=length)&&(index>=0));
    }
}


