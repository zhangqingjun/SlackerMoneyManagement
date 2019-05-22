package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter2 {
    private AtomicInteger atomicInteger = new AtomicInteger();
    public int increase(){
        return atomicInteger.incrementAndGet();
    }
    public int decrease(){
        return atomicInteger.decrementAndGet();
    }
}
