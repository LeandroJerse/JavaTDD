import org.junit.Test;



import static org.junit.Assert.*;

public class TestStack {

    Stack p = new Stack(10);

    @Test
    public void StartStack() {
        Stack i = new Stack(10);

    }
    @Test
    public void IsEmpty() {

        assertTrue(p.isEmpty());
        assertEquals(0,p.mySize());

    }

    @Test
    public void pushingOneElement() {

        p.pushing("First");
        assertFalse(p.isEmpty());
        assertEquals(1,p.mySize());
        assertEquals("First",p.top());

    }
    @Test
    public void pushingTwoElement() {

        p.pushing("First");
        p.pushing("Second");
        assertFalse(p.isEmpty());
        assertEquals(2,p.mySize());
        assertEquals("Second",p.top());

    }
    @Test
    public void pushingTwoAndPoppingOneElement() {

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
    @Test(expected = RemoveMyEmptyStackException.class)
    public void removeToEmptyStack() {
        p.pop();

    }

    @Test(expected = FullStackException.class)
    public void increaseOnFullStack() {

        for (int i = 0; i <= 10; i++) {
            p.pushing("element" + i);
        }

    }


}
