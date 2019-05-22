package genericity.complexmodel;

import genericity.GenericMethods;

import java.util.ArrayList;

/**
 *
 */
class Shelf extends ArrayList<Product> {
    public Shelf(int nProducts){
        GenericMethods.fill(this,Product.generator,nProducts);
    }
}
