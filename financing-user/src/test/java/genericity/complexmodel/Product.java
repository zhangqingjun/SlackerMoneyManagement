package genericity.complexmodel;

import genericity.Generator;

import java.util.Random;

/**
 * fanhua gouzao complex model
 */
class Product {
    private final int id;
    private String description;
    private double price;
    public Product(int idNumber,String desc,double price){
        this.id= idNumber;
        this.description = desc;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id+":"+description+",price:$"+price;
    }
    public static Generator<Product> generator =
            new Generator<Product>() {
        private Random random = new Random(47);
                @Override
                public Product next() {
                    return new Product(random.nextInt(1000),"Test",Math.round(random.nextDouble()*1000.0)+0.99);
                }
            };
}
