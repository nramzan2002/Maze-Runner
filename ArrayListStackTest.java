package Maze_DS;

import DataStructures.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Noor Ramzan
 */
public class ArrayListStackTest{
    /**
     * 
     */
    public ArrayListStackTest() {
    }

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        try{
            System.out.println("push");
            String element = "Testing";
            ArrayListStack<String> instance = new ArrayListStack<>();
            instance.push(element);
            assertEquals(1, instance.size());
            assertEquals(element, instance.peek());
        }catch(EmptyCollectionException e){
            fail("The test case is a prototype");
            
        }
    }

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop() {
        try{
            System.out.println("pop");
            ArrayListStack<String> instance = new ArrayListStack<>();
            String expResult = "Testing";
            instance.push(expResult);
            String result = instance.pop();
            assertEquals(expResult, result);
            assertEquals(0,instance.size());
        }catch(EmptyCollectionException e){
            fail("The test case is a prototype");
        }
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek() {
        try{
            System.out.println("peek");
            ArrayListStack<String> instance = new ArrayListStack<>();
            String expResult = "Testing";
            instance.push(expResult);
            String result = instance.peek();
            assertEquals(expResult, result);
        }catch(EmptyCollectionException e){
            fail("The test is a prototype");
        }
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack<String> instance = new ArrayListStack<>();
        assertTrue(instance.isEmpty());
        instance.push("Testing");
        assertFalse(instance.isEmpty());
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack <String> instance = new ArrayListStack<>();
        assertEquals(0,instance.size());
        instance.push("Testing");
        assertEquals(1, instance.size());
    }

    /**
     * Test of toString method, of class ArrayListStack.
     */
    /*@Test
    public void testToString() {
        System.out.println("toString");
        ArrayListStack instance = new ArrayListStack();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }*/
    
}
