package company;

import company.controllers.Product1Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication2 {
          private final Product1Controller controller;

          private  final Scanner  scanner;


          public  MyApplication2(Product1Controller controller){
                    this.controller = controller;
                    scanner  = new Scanner(System.in);
          }
          public  void  start  (){
              while (true){
                  System.out.println("Welcome to My Application");
                  System.out.println("Select option:");
                  System.out.println("1. Get all products");
                  System.out.println("2. Create product");
                  System.out.println("0. Exit");
                  System.out.println();
                  try {
                      System.out.print("Enter option (1 or 2): ");
                      int option = scanner.nextInt();
                      switch (option){
                          case 1:getAllProductsMenu();break;
                          case 2:createProductsMenu();break;
                          default: return;
                      }
              }catch (InputMismatchException e){
                      System.out.println("Input must be integer");
                      scanner.nextLine(); // to ignore incorrect input
                  }catch (Exception e){
                      System.out.println(e.getMessage());
                  }
             }
          }
          public  void  getAllProductsMenu (){
            String response =  controller.getAllProducts();
            System.out.println(response);
          }
          public  void createProductsMenu (){
              System.out.println("Please enter name");
              String name = scanner.next();
              System.out.println("Please enter count");
              int  count = scanner.nextInt();


              String response =  controller.creatProduct1(name , count);
              System.out.println(response);
          }

}
