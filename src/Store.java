import java.awt.*;
import java.lang.reflect.Array;
import   java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;

public class Store {
    private   final  LocalDate dateNow = LocalDate.now();
    private  final Random random  =  new Random(System.currentTimeMillis());

    private  final Random randomTime  = new Random();

      private Product[] products =   new Product[20];



    public  String  getRandomStoragePlace(){
        int i = random.nextInt(1);
        return i == 1 ? "IceBox" : "Showcase";
    }
    public   LocalDate getRandomDeliveryTime () {
        int i =  1 +  randomTime.nextInt(200);
         dateNow.minus(i, ChronoUnit.DAYS);
         return dateNow;
       }
    public  void  doInspection (){

        for (int  i = 0 ;  i < products.length ; i++){
            products[i] = new Fish();
        }

        for ( int i = 0 ; i  < products.length  ; i++){
            System.out.println(products[i]);
        }
    }
}
