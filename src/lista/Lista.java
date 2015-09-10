package lista;

import utils.Elemento;

/**
 * Created by valdir on 27/08/15.
 */
public class Lista<T> {

    private Elemento<T> primeiroElemento;
    private Elemento<T> ultimoElemento;
    private Elemento<T> cursor;
    private int contador = 0;

    public void adicionaNoFim(T objeto){
        Elemento elemento = new Elemento<T>(null, null, objeto);
        if(this.listaEstaVazia()){
            this.primeiroElemento = elemento;
            this.ultimoElemento = elemento;
            this.cursor = elemento;
        } else{
            elemento.setAnterior(ultimoElemento);
            ultimoElemento.setProximo(elemento);
        }
        this.contador++;
    }

    public void adicionaNoComeco(T objeto){
        Elemento elemento = new Elemento<T>(null, null, objeto);
        if(this.listaEstaVazia()){
            this.primeiroElemento = elemento;
            this.ultimoElemento = elemento;
            this.cursor = elemento;
        } else{
            elemento.setAnterior(null);
            elemento.setProximo(primeiroElemento);
            primeiroElemento = elemento;
        }
        this.contador++;
    }

    public void adicionaDepoisDoAtual(T objeto) throws ListaVaziaException {
        if(this.listaEstaVazia()){
            throw new ListaVaziaException();
        }
        Elemento<T> elemento = new Elemento<>();
        elemento.setProximo(this.cursor.getProximo());
        elemento.setAnterior(this.cursor);
        elemento.setValor(objeto);
        this.cursor = elemento;
        this.contador++;
    }

    public void adicionaAntesDoAtual(T objeto) throws ListaVaziaException {
        if(this.listaEstaVazia()){
            throw new ListaVaziaException();
        }
        Elemento<T> elemento = new Elemento<>();
        elemento.setProximo(this.cursor);
        elemento.setAnterior(this.cursor.getAnterior());
        elemento.setValor(objeto);
        this.cursor = elemento;
        this.contador++;
    }

    public void removeDoComeco(){

    }

    public void removeDoFim(){

    }

    public T busca(T objeto){
        Elemento<T> atual = this.primeiroElemento;
        while (atual!=null){
            if (atual.getValor().equals(objeto)){
                return atual.getValor();
            }
            atual = atual.getProximo();
        }
        return null;
    }




    public boolean contem(T objeto) {return false;}

    public int tamanho() throws ListaVaziaException {
        if(this.listaEstaVazia()){
            throw new ListaVaziaException();
        }
        return this.contador;
    }

    public boolean listaEstaVazia(){
        return this.primeiroElemento==null;
    }





}
