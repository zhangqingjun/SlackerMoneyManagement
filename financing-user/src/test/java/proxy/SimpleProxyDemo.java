package proxy;

public class SimpleProxyDemo {
    public static void consumer(Interface intec){
        intec.doSomething();
        intec.somethingElse("banana");
    }
    public static void main(String []  args){
        consumer(new Interface.RealObject());
        consumer(new Interface.SimpleProxy(new Interface.RealObject()));
    }
}
