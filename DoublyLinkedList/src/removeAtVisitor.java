
package DoublyLinkedList;

/**
 * When visiting a list it will remove the node at index set.
 * @param <V> The type of the list we are iterating over.
 */
public class removeAtVisitor<V>implements IVisitor<V>
{
    private int index = 0;
    private int desiredIndex = 0;
    
    /**
     * Returns a new removeAtVisitor that will remove the item at the specified index for lists of type V
     * @param index The index at which to remove an item.
     */
    public removeAtVisitor(int index)
    {
        desiredIndex = index;
    }
    @Override
    public void visitNode(DoublyLinkedNode<V> node)
    {
     if (index == desiredIndex)
     {
         node.removeSelf();
     }
     else
     {
         index++;
         node.passToNextNode( this );
          
     }
   
    }
}
