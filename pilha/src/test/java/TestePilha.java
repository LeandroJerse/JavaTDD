import org.junit.Test;

import static org.junit.Assert.*;

public class TestePilha {
    @Test
    public void pilhaVazia() {
        Pilha p = new Pilha();
        assertTrue(p.isEmpty());
        assertEquals(0,p.mySize());

    }

    @Test
    public void pushingOneElement() {
        Pilha p = new Pilha();
        p.pushing("First");
        assertFalse(p.isEmpty());
        assertEquals(1,p.mySize());
        assertEquals("First",p.top());

    }

    public void pushingTwoElement() {
        Pilha p = new Pilha();
        p.pushing("First");
        assertFalse(p.isEmpty());
        assertEquals(1,p.mySize());
        assertEquals("First",p.top());

    }


}
