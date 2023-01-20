
import java.time.LocalDate;
public  abstract   class Product {
    Store store  =  new Store();
    private String  name;
    private  double  storageLifeDays;
     private LocalDate  DateTime;

   public  Product (){DateTime = LocalDate.now();
   }



   public  Product (String  name   , int storageLifeDays){
       this();
       this.name  =  name;
       this.storageLifeDays =  storageLifeDays;
    }
   public  boolean  isFresh  (){
          return true;
   }

    @Override
    public String toString() {
        return "[" + name + "] :"    + " " +  store.getRandomDeliveryTime() +  " " +  store.getRandomStoragePlace()  ;
    }
}
