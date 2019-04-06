package proxy;

import java.lang.reflect.Proxy;

class SimpleDynmicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("banana");
    }

    public static void main(String[] args) {
        Interface.RealObject realObject = new Interface.RealObject();
        consumer(realObject);
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class}, new DynamicProxyHandler(realObject));
        consumer(proxy);
    }
}
