package company;

import Market.Product;
import company.controllers.MarketProductController;
import company.entities.MarketProducts;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MyApplication3 {
    private static List<Product> products =  new ArrayList<>();
     private  final MarketProductController controller;

    private  final Scanner scanner;

    public  MyApplication3(MarketProductController controller){
        this.controller = controller;
        scanner = new Scanner(System.in);
    }


    public  void  start  (){
        while (true){
            System.out.println("Welcome to My Application 3 ");
            System.out.println("Select option:");
            System.out.println("1. Get all products from market ");
            System.out.println("2. Insert product to market");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1 or 2): ");
                int option = scanner.nextInt();
                switch (option){
                    case 1:getAllProductsMenu();break;
                    case 2:
                        System.out.println("We have such products now");
                        System.out.println(products);
                        insertProductsMenu();
                        break;
                    default: return;
                }
            }catch (InputMismatchException e){
                System.out.println("Input must be integer");
                scanner.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void  add  (Product p ){
        products.add(p);
        System.out.println(products);
    }
    public  void  getAllProductsMenu (){
        String response =  controller.getAllMarketProducts();
        System.out.println(response);
    }

    public  void  insertProductsMenu(  ){
        for (Product p : products) {
                    String response =  controller.insertProductsToTable(p.getName(),p.getDeliveredAt(), p.getPlace(), 1, p.isFresh());
                    System.out.println(response);

        }

    }
}
