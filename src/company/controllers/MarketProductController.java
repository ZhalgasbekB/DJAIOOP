package company.controllers;

import Market.Product;
import company.entities.MarketProducts;
import company.repositories.MarketRepository;
import company.repositories.interfaces.IMarketRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MarketProductController {

     private  final IMarketRepository repo;

    public MarketProductController (IMarketRepository repo){
        this.repo = repo;
    }
    public  String getAllMarketProducts (){
        List<MarketProducts> products = repo.getAllMarketProducts();
        return  products.toString();
    }
     public  String insertProductsToTable(String name , LocalDate date , String box , int life_days , boolean isFresh){

        MarketProducts marketProducts =  new MarketProducts( name , date , box , life_days , isFresh);
        return  repo.insertMarketProduct(marketProducts) ? "Market was created" : " Market creation was failed";
    }
}
