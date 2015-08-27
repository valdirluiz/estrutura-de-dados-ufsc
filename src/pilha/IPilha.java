package pilha;

/**
 * Created by valdir on 27/08/15.
 */
public interface IPilha<T> {

    public T pop();
    public void push(T value);
    public T top();
}
