package fila;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by valdir on 27/08/15.
 */
public class FilaTest {

    @Test
    public void deveInserirElementos() throws Exception {
        Fila<String> fila = new Fila<>(5);
        fila.insere("1");
        fila.insere("2");
        fila.insere("3");
        fila.insere("4");
        fila.insere("5");

        assertEquals("1", fila.remove());
        assertEquals("2", fila.remove());
        assertEquals("3", fila.remove());
        assertEquals("4", fila.remove());
        assertEquals("5", fila.remove());
    }

    @Test(expected = Exception.class)
    public void naoDeveInserirMaisElementosQueOTamanho() throws Exception {
        Fila<String> fila = new Fila<>(5);
        fila.insere("1");
        fila.insere("2");
        fila.insere("3");
        fila.insere("4");
        fila.insere("5");
        fila.insere("6");

    }
}
