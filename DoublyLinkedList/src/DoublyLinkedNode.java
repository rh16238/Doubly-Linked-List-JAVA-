package DoublyLinkedList;


public class DoublyLinkedNode<V> implements IVisitable
{

    private V value;
    private DoublyLinkedNode<V> nextNode;
    private DoublyLinkedNode<V> prevNode;
    
    public DoublyLinkedNode(V v, DoublyLinkedNode next, DoublyLinkedNode prev)
    {
        value = v;
        nextNode = next;
        prevNode = prev;
        
        if (nextNode != null) {nextNode.acceptNewAftNode( this);}
        if (prevNode != null) {prevNode.acceptNewForeNode( this);}
    }
     /**
     * @return the value
     */
    public V getValue()
    {
        return value;
    }

    /**
     * @return the isStartSentinal
     */
    public boolean isIsStartSentinal()
    {
        return (prevNode == null);
    }

    /**
     * @return the isEndSentinal
     */
    public boolean isIsEndSentinal()
    {
        return (nextNode == null);
    }
    
    /**
     * Sets the successor node the new next node
     * @param nextNode 
     */
    public void acceptNewForeNode(DoublyLinkedNode nextNode)
    {
        this.nextNode = nextNode;
    }
    /**
     * sets the predecessor node to the new node
     * @param prevNode 
     */
    public void acceptNewAftNode(DoublyLinkedNode prevNode)
    {
        this.prevNode = prevNode;
    }

    @Override
    public void accept(IVisitor visitor)
    {
        visitor.visitNode( this);
    }
    
    /**
     * Informs the next node to let the visitor visit.
     * @param visitor 
     */
    public void passToNextNode(IVisitor visitor)
    {
        nextNode.accept( visitor);
    }
    
      /**
     * Informs the previous node to let the visitor visit.
     * @param visitor 
     */
    public void passToPrevNode(IVisitor visitor)
    {
        prevNode.accept( visitor);
    }
    
    /**
     * Node removes self by linking its predecessor to its successor.
     */
    public void removeSelf()
    {
        if (prevNode != null)
        {
            prevNode.acceptNewForeNode( nextNode );
        }
        if (nextNode != null)
        {
            nextNode.acceptNewAftNode( prevNode );
        }
    }
    
}
