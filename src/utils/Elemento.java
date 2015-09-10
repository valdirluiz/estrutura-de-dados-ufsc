package utils;

/**
 * Created by valdir on 02/09/15.
 */
public class Elemento<T> {

    private Elemento proximo;
    private Elemento anterior;
    private T valor;

    public Elemento() {
    }

    public Elemento(Elemento proximo, Elemento anterior, T valor) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.valor = valor;
    }

    public Elemento(T valor) {
        this.valor = valor;
    }

    public Elemento(Elemento proximoElemento, T valor) {
        this.proximo = proximoElemento;
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public Elemento getAnterior() {
        return anterior;
    }

    public void setAnterior(Elemento anterior) {
        this.anterior = anterior;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
