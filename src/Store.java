  import   java.time.*;
 import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
      private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public  String  getRandomStoragePlace(){
        Random random = new Random(System.nanoTime());
        int i = random.nextInt(2);
        return i == 1 ? "IceBox" : "Showcase";
    }
    public   LocalDate getRandomDeliveryTime () {
        Random random = new Random(System.nanoTime());
        int i =  1 +  random.nextInt(200);
        LocalDate dateNow = LocalDate.now();
         return dateNow.minusDays(i);
       }
    public  void  doInspection (){
        System.out.println( "Product" +  " | "+  " Delivered at " + " | " + "Storage " + " |  " + "S. life days" +  " | " + " Fresh");
        System.out.println("============================================");
        for (Product p : products){
            System.out.println(p);
        }
        System.out.println("============================================");
    }
}
