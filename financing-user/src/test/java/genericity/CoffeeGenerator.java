package genericity;

import java.util.Iterator;
import java.util.Random;

/**
 * shengchengqi fanxing
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {

    private Class[] types = {Latte.class};
    private static Random random = new Random(47);
    public CoffeeGenerator(){}
    private int size = 0;
    public CoffeeGenerator(int size){this.size =size;}
    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return null;
    }
    class CoffeeIterator implements Iterator<Coffee>{
        int count =size;
        public boolean hasNext(){return count>0;}
        public Coffee next(){
            count--;
            return CoffeeGenerator.this.next();
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args){
        CoffeeGenerator generator = new CoffeeGenerator();
        for(int i=0;i<5;i++){
            System.out.println(generator.next());
        }
        //判断什么时候停止
        for(Coffee coffee:new CoffeeGenerator(5)){
            System.out.println(coffee);
        }
    }
}
