
package DoublyLinkedList;

public interface IVisitable<V>
{
    void accept(IVisitor<V> visitor);

}
