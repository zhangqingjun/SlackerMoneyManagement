package genericity.complexmodel;

import org.assertj.core.util.Lists;

import java.util.ArrayList;

public class Store extends ArrayList<Aisie> {
    private ArrayList<CheckoutStand> checkoutStands = Lists.newArrayList();
    private Office office = new Office();
    public Store(int nAisles,int nshelves,int nProducts){
        for(int i=0;i<nAisles;i++){
            add(new Aisie(nshelves,nProducts));
        }
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Aisie a :this){
            for(Shelf s:a){
                for(Product p:s){
                    stringBuilder.append(p);
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args){
        System.out.println(new Store(14,5,10));
    }
}
