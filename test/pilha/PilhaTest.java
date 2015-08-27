package pilha;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by valdir on 27/08/15.
 */
public class PilhaTest {

    @Test
    public void naoDeveRetornarNadaPilhaVazia(){
        Pilha<Integer> p = new Pilha<Integer>(5);
        Integer pop = p.pop();
        assertEquals(null, pop);
    }

    @Test
    public void deveColocarCincoElementos(){
        Pilha<Integer> p = new Pilha<Integer>(5);
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
        assertEquals(p.pop(), new Integer(5));
        assertEquals(p.pop(), new Integer(4));
        assertEquals(p.pop(), new Integer(3));
        assertEquals(p.pop(), new Integer(2));
        assertEquals(p.pop(), new Integer(1));
    }

    @Test
    public void naoDeveColocar6Elementos(){
        Pilha<Integer> p = new Pilha<Integer>(5);
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
        p.push(6);
        assertEquals(p.pop(), new Integer(5));
        assertEquals(p.pop(), new Integer(4));
        assertEquals(p.pop(), new Integer(3));
        assertEquals(p.pop(), new Integer(2));
        assertEquals(p.pop(), new Integer(1));
    }
}
