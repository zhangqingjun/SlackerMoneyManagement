package genericity.complexmodel;

import java.util.ArrayList;

public class Aisie extends ArrayList<Shelf> {
    public Aisie(int nshelves,int nProducts){
        for (int i=0;i<nshelves;i++){
            add(new Shelf(nProducts));
        }
    }
}
