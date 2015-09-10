package pilha.ligada;

import pilha.IPilha;
import utils.Elemento;

/**
 * Created by valdir on 02/09/15.
 */
public class Pilha<T> implements IPilha<T>{

    private Elemento topo;

    @Override
    public T pop() {
        Elemento pop = topo;
        topo = topo.getProximo();
        return (T) pop.getValor();
    }

    @Override
    public void push(T value) {
        topo = new Elemento(topo, value);
    }

    @Override
    public T top() {
        return (T) topo.getValor();
    }
}
