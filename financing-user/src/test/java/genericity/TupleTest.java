package genericity;

public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return new TwoTuple<>("h1",1);
    }
    static ThreeTuple<Boolean,String,Integer> h(){
        return new ThreeTuple<>(false,"h1",2);
    }
    public static void main(String[] args){
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(h());
    }
}
