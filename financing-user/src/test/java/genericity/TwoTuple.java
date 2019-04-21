package genericity;

public class TwoTuple<A,B> {
    public final A first;
    public final B second;
    public TwoTuple(A a,B b){
        this.first = a;
        this.second = b;
    }
    public String toString(){
        return "("+this.first+","+this.second+")";
    }
}
