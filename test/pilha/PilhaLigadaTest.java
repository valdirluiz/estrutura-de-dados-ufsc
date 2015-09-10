package pilha;

import org.junit.Test;
import pilha.ligada.Pilha;

import static org.junit.Assert.assertEquals;

/**
 * Created by valdir on 10/09/15.
 */
public class PilhaLigadaTest {

    @Test
    public void naoDeveRetornarNadaPilhaVazia(){
        Pilha<Integer> p = new Pilha<Integer>();
        Integer pop = p.pop();
        assertEquals(null, pop);
    }

    @Test
    public void deveColocarCincoElementos(){
        Pilha<Integer> p = new Pilha<Integer>();
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

}
