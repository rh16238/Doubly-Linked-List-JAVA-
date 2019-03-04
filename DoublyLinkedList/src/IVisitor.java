package DoublyLinkedList;

public interface IVisitor<V>
{
    void visitNode(DoublyLinkedNode<V> nodeToVisit);
}
