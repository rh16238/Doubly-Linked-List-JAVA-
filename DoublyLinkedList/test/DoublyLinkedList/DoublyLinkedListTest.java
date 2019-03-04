
package DoublyLinkedList;

import org.junit.Test;
import static org.junit.Assert.*;


public class DoublyLinkedListTest
{
    
  

    /**
     * Test of Length method for zero values, of class DoublyLinkedList.
     */
    @Test
    public void testLengthAt0()
    {
        System.out.println( "Length" );
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 0;
        int result = instance.Length();
        assertEquals( expResult, result );
        
    }
    
        /**
     * Test of Length method for non zero values, of class DoublyLinkedList.
     */
    @Test
    public void testLengthNonZero()
    {
        System.out.println( "Length" );
        DoublyLinkedList<Integer> instance = new DoublyLinkedList<>();
        instance.addValueStart( 1 );
        int expResult = 1;
        int result = instance.Length();
        assertEquals( expResult, result );
        
    }

    /**
     * Test of addValueStart method, of class DoublyLinkedList.
     */
    @Test
    public void testAddValueStart()
    {
        
        System.out.println( "addValueStart" );
        DoublyLinkedList<Integer> instance = new DoublyLinkedList<>();
        instance.addValueStart( 1 );
        assertEquals(1,instance.Length());

       
    }

    /**
     * Test of addValueEnd method, of class DoublyLinkedList.
     */
    @Test
    public void testAddValueEnd()
    {
        System.out.println( "addValueEnd" );
        Integer v = 0;
        DoublyLinkedList<Integer> instance = new DoublyLinkedList<>();
        instance.addValueEnd( 0 );
        instance.addValueEnd( 1 );
        instance.addValueEnd( 2 );
        instance.addValueEnd( 3 );
        assertEquals((Integer)3, instance.getValueAt( 3 ));
        
      
    }

    /**
     * Test of getValueAt method, of class DoublyLinkedList.
     */
    @Test
    public void testGetValueAt()
    {
        System.out.println( "getValueAt" );
        DoublyLinkedList<Integer> instance = new DoublyLinkedList<>();
        instance.addValueStart( 1);
        instance.addValueEnd( 2);
        Integer value = instance.getValueAt( 0);
        assertEquals((Integer) 1, value );
        value = instance.getValueAt( 1);
        assertEquals((Integer) 2, value);
    }

    /**
     * Test of removeAt method, of class DoublyLinkedList.
     */
    @Test
    public void testRemoveAt()
    {
        System.out.println( "removeAt" );

        DoublyLinkedList<Integer> instance = new DoublyLinkedList<>();
        instance.addValueStart( 1);
        instance.addValueEnd( 2);
        instance.addValueEnd( 3);
        
        instance.removeAt( 1);
        
        assertEquals((Integer) 1, instance.getValueAt( 0) );
        assertEquals((Integer) 3, instance.getValueAt( 1) );
    }
    
}
