package company.repositories.interfaces;

import Market.Product;
import company.entities.MarketProducts;
import company.repositories.MarketRepository;

import java.util.List;

public interface IMarketRepository   {

    List <MarketProducts> getAllMarketProducts ();

    boolean createMarketProduct ();
    boolean insertMarketProduct(MarketProducts m);

 }
