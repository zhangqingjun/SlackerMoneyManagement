package atomic;

public class TestWait {
    public void testWait() throws InterruptedException {
        synchronized (this){
            this.wait();
        }
    }
    public String testNotify(){
        synchronized (this){
            this.notify();
            return "111";
        }
    }

    public static void main(String[] args) {
        TestWait testWait = new TestWait();
        System.out.println(testWait.testNotify());
    }
}
