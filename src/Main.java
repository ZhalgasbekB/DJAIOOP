import java.util.Random;

public class Main {
    public  static  void main (String  []  args){

         Store  store   =  new Store();
         for (int i = 0; i < 20; i++) {
             store.add(new Fish("Fish", 20, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
         }

         store.doInspection();
     }
}
