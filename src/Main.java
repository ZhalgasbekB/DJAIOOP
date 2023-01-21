import java.util.Random;
import java.util.Scanner;

public class Main {
    public  static  void main (String  []  args){
        Double positiveInfinity = Double.POSITIVE_INFINITY;
        Random random =  new Random(System.nanoTime());
        Store  store   =  new Store();


         for (int i = 0; i < 20; i++) {
             int n  = 1 + random.nextInt(5);
             switch (n){
                 case 1:
                     store.add(new Fish("Fish", 20, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     break;
                 case 2:
                     store.add(new Corn("Corn", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     break;
                 case 3:
                     store.add(new Milk("Milk", 60, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     break;
                 case 4:
                     store.add(new Salt("Salt", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     break;
                 case 5:
                     store.add(new Stew("Stew", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     break;
             }
          }

         store.doInspection();
     }
}
