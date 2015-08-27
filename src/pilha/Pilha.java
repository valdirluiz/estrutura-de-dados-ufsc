package pilha;


public class Pilha<T> implements IPilha<T> {


    private int maxLimit;
    private T [] array;
    private int index;


    @SuppressWarnings("unchecked")
    public Pilha(int maxLimit) {
        this.maxLimit = maxLimit;
        this.array = (T[])new Object[maxLimit];
        this.index=-1;
    }


    @Override
    public T pop() {
        if(index==-1){
            return null;
        } else{
            T top = this.array[index];
            this.index--;
            return top;
        }
    }

    @Override
    public void push(T value) {
        if (index<maxLimit-1) {
            this.index++;
            this.array[index] = value;
        }
    }

    @Override
    public T top() {
        if(index==-1){
            return null;
        } else{
            return this.array[this.index];
        }
    }
}
