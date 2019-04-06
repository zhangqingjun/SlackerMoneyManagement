package proxy;

public interface Interface {
    void doSomething();
    void somethingElse(String arg);
    class RealObject implements Interface{

        public void doSomething() {
            System.out.println("doSomething");
        }

        public void somethingElse(String arg) {
            System.out.println("somethingElse"+arg);
        }
    }
    class SimpleProxy implements Interface{
        private Interface anInterface;
        public SimpleProxy(Interface anInterface){
            this.anInterface = anInterface;
        }
        public void doSomething() {
            System.out.println("SImeProxy doSomething");
            anInterface.doSomething();

        }

        public void somethingElse(String arg) {
            System.out.println("SimpleProxy somethingElse" + arg);
            anInterface.somethingElse(arg);
        }
    }
}
