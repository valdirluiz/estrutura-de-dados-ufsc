package lista;

/**
 * Created by valdir on 27/08/15.
 */
public class Elemento<T> {

    private Elemento proximoElemento;
    private T valorDoElemento;

    public Elemento() {

    }

    public Elemento(Elemento proximoElemento) {
        this.proximoElemento = proximoElemento;
    }

    public Elemento(T valorDoElemento) {
        this.valorDoElemento = valorDoElemento;
    }

    public Elemento(Elemento proximoElemento, T valorDoElemento) {
        this.proximoElemento = proximoElemento;
        this.valorDoElemento = valorDoElemento;
    }

    public Elemento getProximoElemento() {
        return proximoElemento;
    }

    public void setProximoElemento(Elemento proximoElemento) {
        this.proximoElemento = proximoElemento;
    }

    public T getValorDoElemento() {
        return valorDoElemento;
    }

    public void setValorDoElemento(T valorDoElemento) {
        this.valorDoElemento = valorDoElemento;
    }
}
