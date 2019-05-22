package genericity.genericity20190519;

public class GenericBase<T> {
    private  T element;
    public void set(T arg){
        arg = element;
    }
    public T get(){
        return element;
    }
}
