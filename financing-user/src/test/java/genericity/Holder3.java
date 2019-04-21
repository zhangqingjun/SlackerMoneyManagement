package genericity;

public class Holder3<T> {
    private T a;
    public Holder3(T a){
        this.a = a;
    }
    public void set(T a){
        this.a=a;
    }
    public T get(){
        return a;
    }
    static class Automobile{}
    public static void main(String[] args){
        Holder3<Automobile> holder3 = new Holder3<>(new Automobile());
        Automobile automobile = holder3.get();
        System.out.println(automobile);
    }
}
