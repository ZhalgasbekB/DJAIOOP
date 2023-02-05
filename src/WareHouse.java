import Market.Product;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WareHouse   {


    private List<Product> products1 = new ArrayList<>();

    private HashMap<Product , Integer> products01 = new HashMap<>();

    private HashMap <String , Integer> products02 = new HashMap<>();
    public void add(Product product) {
        products1.add(product);
    }
     public  void printData (){
          for (Product p : products1){
              System.out.println(p.toString());
          }
     }
     public List<Product> getProducts (){
        return products1;
     }
     public  void generalWareHouse (){
          setForRepeatedProducts();
          System.out.println("--------------");
         for (Map.Entry<String, Integer> entry : products02.entrySet()) {
             System.out.println(entry.getKey() + ": " + entry.getValue());
         }
         System.out.println("--------------");
     }
     private void  setForRepeatedProducts(){
        for (Product p : products1){
            if (isFreshToday(p)){
                int k = products02.containsKey(p.getName()) ? products02.get(p.getName()): 0 ;
                products02.put(p.getName(),++k);
            }
        }
     }
     public void getProductOnlyFresh() {
          setProductHashMap();

         System.out.println("---------------------------------------------------");
         for (Map.Entry<Product, Integer> entry : products01.entrySet()) {
             System.out.println(entry.getKey() + ": " + entry.getValue());
         }
         System.out.println("---------------------------------------------------");
     }
     private void  setProductHashMap() {
           for  (Product p  : products1) {
             if  (isFreshToday(p)) {
                 int k = products01.containsKey(p) ? products01.get(p) : 0;
                  products01.put(p, ++k);
             }
          }
      }

    private boolean isFreshToday(Product p ){
         return  p.isFresh();
        }
     }

