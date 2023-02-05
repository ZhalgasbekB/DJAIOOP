package company.entities;

import Market.Product;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class MarketProducts {
        private List<Product> products =  new ArrayList<>();

         private int  id ;

         private  String name ;

         private  LocalDate date ;

         private  int life_days;

         private  String box ;

         private  boolean isFresh;

        public MarketProducts (){
        }
        public MarketProducts (int id , String name , LocalDate date , String box , int life_days , boolean isFresh){
                setIdForMarket(id);
                setBoxForMarket(box);
                setFresh(isFresh);
                setDateForMarket(date);
                setNameForMarket(name);
                setLife_daysForMarket(life_days);
        }
        public MarketProducts (String name , LocalDate date , String box , int life_days , boolean isFresh){
                setBoxForMarket(box);
                setFresh(isFresh);
                setDateForMarket(date);
                setNameForMarket(name);
                setLife_daysForMarket(life_days);
        }


        public  void  setIdForMarket (int id ){
                this.id =  id;
        }
        public  void  setNameForMarket (String name){
                this.name =  name;
        }
        public  void setDateForMarket (LocalDate date){
                this.date  =  date;
        }
        public  void  setBoxForMarket (String box){
                this.box =  box;
        }
        public void setLife_daysForMarket (int life_days){
                this.life_days = life_days;
        }
        public  void setFresh (boolean isFresh){
                this.isFresh =  isFresh;
        }


        public  int getLife_days (){
                return  life_days;
        }
        public LocalDate getDeliver (){
                return date;
        }
        public  String  getName(){
                return name;
        }
        public String  getBox(){
                return  box;
        }
        public  boolean getIsFresh (){
                 return isFresh;
        }



        @Override
        public String toString() {
                return "MarketProducts[" + id + "] " + " Name Product: " + name + ' ' + " Delivered: " + date +
                        " Storage Life Days: " + life_days + " Box: "  + box + ' ' +
                        " isFresh: " + isFresh +  " ]";
        }
}
