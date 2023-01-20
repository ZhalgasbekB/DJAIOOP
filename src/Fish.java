import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fish   extends  Product {
       private Store store  =  new Store();
       private  String place = store.getRandomStoragePlace();
       private LocalDate l =  store.getRandomDeliveryTime();
       private LocalDate l1 =  LocalDate.now();

        public  Fish  (){
            super("Fish" , 20 );
        }

    @Override
       public  boolean isFresh (){
            if (l.plusDays(20).isAfter(l1)){
               String place = store.getRandomStoragePlace();
               if (place != "IceBox"){
                   return  l.minusDays(16).isAfter(l1) ? true : false ;
               }
               else {
                   return true;
               }
           }
           else {
               return false;
           }
        }


    @Override
    public String toString() {
        return isFresh() + "  " + super.toString();
    }
}
