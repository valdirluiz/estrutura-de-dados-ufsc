package fila;

/**
 * Created by valdir on 27/08/15.
 */
public interface IFila<T> {

    public void insere(T objeto) throws Exception;
    public T remove();

}
