package company.controllers;

import  company.entities.Product1;
import  company.repositories.interfaces.IProductRepository;

import java.util.List;

public class Product1Controller {
     private final  IProductRepository repos;

     public  Product1Controller (IProductRepository repos){
         this.repos = repos;
     }
     public String creatProduct1(String name , int count){

         Product1 product1=  new Product1(name , count);

         return repos.createProduct(product1) ?  "User was created!" : "User creation was failed!" ;
     }
     public  String getAllProducts (){
         List<Product1> product1s =  repos.getAllProducts();
         return product1s.toString();
     }
}
