package genericity;

/**
 * fanxing method
 */
public class GenericMethods {
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }
    public <T> void f(T x,T y,T z){
        System.out.println(x.getClass().getName()+","+y.getClass().getSimpleName()+","+z.getClass().getCanonicalName());
    }
    public static void main(String[] args){
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("");
        genericMethods.f(1);
        genericMethods.f(1.0);
        genericMethods.f(1.0F);
        genericMethods.f('C');
        genericMethods.f(genericMethods);
        genericMethods.f("",1.0,1.0F);
        genericMethods.f(1,"zf",'d');
        genericMethods.f(1.0);
        genericMethods.f(1.0F);
        genericMethods.f('C');
        genericMethods.f(genericMethods);
    }
}
