import org.junit.Test;

import static org.junit.Assert.*;

public class TestStack {
    @Test
    public void IsEmpty() {
        Stack p = new Stack();
        assertTrue(p.isEmpty());
        assertEquals(0,p.mySize());

    }

    @Test
    public void pushingOneElement() {
        Stack p = new Stack();
        p.pushing("First");
        assertFalse(p.isEmpty());
        assertEquals(1,p.mySize());
        assertEquals("First",p.top());

    }
    @Test
    public void pushingTwoElement() {
        Stack p = new Stack();
        p.pushing("First");
        p.pushing("Second");
        assertFalse(p.isEmpty());
        assertEquals(2,p.mySize());
        assertEquals("Second",p.top());

    }
    @Test
    public void pushingTwoAndPoppingOneElement() {
        Stack p = new Stack();
        p.pushing("First");
        p.pushing("Second");
        assertFalse(p.isEmpty());
        assertEquals(2,p.mySize());
        assertEquals("Second",p.top());
        Object popped = p.pop();
        assertEquals(1,p.mySize());
        assertEquals("First",p.top());
        assertEquals("Second",popped);

    }


}
