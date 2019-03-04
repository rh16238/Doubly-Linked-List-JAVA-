
package DoublyLinkedList;

/**
 * Gets the value at a certain index of a list of type V
 * @param <V> The type of the list to visit.
 */
public class getValueAtIndexVisitor<V>implements IVisitor<V>
{
    private int index = 0;
    private int desiredIndex = 0;
    public V value;
    
    /**
     * Sets the visitor to return the value at the specified index
     * @param index the index to return the value of.
     */
    public getValueAtIndexVisitor(int index)
    {
        this.desiredIndex = index;
    }
    
    @Override
    public void visitNode(DoublyLinkedNode<V> node)
    {
     
     if (desiredIndex == index)
     {
         value = node.getValue();
     }
     else
     {
         index++;
         node.passToNextNode( this );
         
     }
     
    }
    
}
