package fila;

/**
 * Created by valdir on 27/08/15.
 */
public class Fila<T> implements  IFila<T> {


    private int indicePrimeiro = 0;
    private int indiceUltimo = -1;
    private int quantidade;
    private T[] fila;

    public Fila(int tamanho){
        this.quantidade = 0;
        this.fila = (T[])new Object[tamanho];
    }


    @Override
    public void insere(T objeto) throws Exception {
        if(quantidade<fila.length){
            if(indiceUltimo ==fila.length-1){
                indiceUltimo = 0;
            } else{
                indiceUltimo++;
            }
            quantidade++;
            fila[indiceUltimo] = objeto;
        } else {
            throw new Exception("Fila já esta cheia");
        }
    }

    @Override
    public T remove() {
        if(quantidade>0){
            T primeiroItem =  fila[indicePrimeiro];
            if(indicePrimeiro ==fila.length-1){
                indicePrimeiro =0;
            } else{
                indicePrimeiro++;
            }
            return primeiroItem;
        } else{
            return null;
        }
    }
}
