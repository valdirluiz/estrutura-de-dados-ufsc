package lista;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by valdir on 10/09/15.
 */
public class ListaTest {

    @Test
    public void deveAdicionarElementoNoFimDaLista() throws ListaVaziaException {
        Lista<String> lista = new Lista<>();
        lista.adicionaNoFim("Item 1");
        assertThat(lista.contem("Item 1"), is(Boolean.TRUE));
        assertThat(lista.tamanho(), is(1));
    }

    @Test
    public void deveAdicionarElementoNoComecoDaLista() throws ListaVaziaException {
        Lista<String> lista = new Lista<>();
        lista.adicionaNoComeco("Item 1");
        assertThat(lista.contem("Item 1"), is(Boolean.TRUE));
        assertThat(lista.tamanho(), is(1));
    }

    @Test(expected = ListaVaziaException.class)
    public void naoDeveDeixarAdicionarDepoisDoAtual() throws ListaVaziaException {
        Lista<String> lista = new Lista<>();
        lista.adicionaDepoisDoAtual("");
    }

    @Test(expected = ListaVaziaException.class)
    public void naoDeveDeixarAdicionarAntesDoAtual() throws ListaVaziaException {
        Lista<String> lista = new Lista<>();
        lista.adicionaAntesDoAtual("");
    }

    @Test
    public void deveAdicionarElementoDepoisDoAtual() throws ListaVaziaException {
        Lista<String> lista = new Lista<>();
        lista.adicionaNoComeco("Atual");
        lista.adicionaDepoisDoAtual("Depois do atual");
        assertThat(lista.contem("Atual"), is(Boolean.TRUE));
        assertThat(lista.contem("Depois do atual"), is(Boolean.TRUE));
        assertThat(lista.tamanho(), is(2));
    }

    @Test
    public void deveAdicionarElementoAntesDoAtual() throws ListaVaziaException {
        Lista<String> lista = new Lista<>();
        lista.adicionaNoComeco("Atual");
        lista.adicionaNoComeco("Atual 2");
        lista.adicionaNoFim("Atual 3");
        lista.adicionaAntesDoAtual("Antes do atual");
        assertThat(lista.contem("Atual"), is(Boolean.TRUE));
        assertThat(lista.contem("Antes do atual"), is(Boolean.TRUE));
        assertThat(lista.contem("Atual 2"), is(Boolean.TRUE));
        assertThat(lista.contem("Atual 3"), is(Boolean.TRUE));
        assertThat(lista.tamanho(), is(4));
    }

    @Test
    public void deveConterElemento(){
        Lista<Integer> lista = new Lista<>();
        lista.adicionaNoComeco(1);
        assertThat(lista.contem(1), is(true));
    }

    @Test
    public void naoDeveConterElemento(){
        Lista<Integer> lista = new Lista<>();
        lista.adicionaNoComeco(1);
        assertThat(lista.contem(2), is(false));
    }

    @Test
    public void listaDeveEstarVazia(){
        Lista<Integer> lista = new Lista<>();
        assertThat(lista.listaEstaVazia(), is(true));
    }

    @Test
    public void listaNaoDeveEstarVaziaItemNoComeco(){
        Lista<Integer> lista = new Lista<>();
        lista.adicionaNoComeco(1);
        assertThat(lista.listaEstaVazia(), is(false));
    }

    @Test
    public void listaNaoDeveEstarVaziaItemNoFim(){
        Lista<Integer> lista = new Lista<>();
        lista.adicionaNoFim(1);
        assertThat(lista.listaEstaVazia(), is(false));
    }

}
