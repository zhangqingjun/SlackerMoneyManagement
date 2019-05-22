package genericity.innerClass;

import genericity.Generator;

import java.util.*;

/**
 *
 */
public class BankTeller {
    public static void serve(Teller t,Customer c){
        System.out.println(t+"serves"+c);
    }
    public static void main(String[] args){
        Random random = new Random(47);
        Queue<Customer> queue = new LinkedList<Customer>();
        List<Teller> tellers = new ArrayList<Teller>();
        for(Customer c :queue){
            serve(tellers.get(random.nextInt(tellers.size())),c);
        }
    }
}
