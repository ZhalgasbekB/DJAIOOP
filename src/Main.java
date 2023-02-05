import Market.*;
import People.Employee;
import People.Student;
import People.Teenager;
import PersonCharacter.Person;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;


import company.MyApplication;
import company.MyApplication2;
import company.MyApplication3;
import company.controllers.MarketProductController;
import company.controllers.Product1Controller;
import company.controllers.UserController;
import company.data.PostgresDB;
import company.data.interfaces.IDB;
import company.entities.MarketProducts;
import company.repositories.MarketRepository;
import company.repositories.Product1Repository;
import company.repositories.UserRepository;
import company.repositories.interfaces.IMarketRepository;
import company.repositories.interfaces.IProductRepository;
import company.repositories.interfaces.IUserRepository;
public class Main {
    public  static  void main (String  []  args) throws SQLException, ClassNotFoundException {
        Double positiveInfinity = Double.POSITIVE_INFINITY;
        Random random =  new Random(System.nanoTime());
        WareHouse  wareHouse = new WareHouse();
        Store store   =  new Store();

         for (int i = 0; i < 20; i++) {
             int n  = 1 + random.nextInt(5);
             switch (n){
                 case 1:
                     store.add(new Fish("Market.Fish", 20, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     wareHouse.add(new Fish("Market.Fish", 20, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                 //    marketProducts.add(new Fish("Market.Fish", 20, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     break;
                 case 2:
                     store.add(new Corn("Market.Corn", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     wareHouse.add(new Corn("Market.Corn", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                 //    marketProducts.add(new Corn("Market.Corn", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     break;
                 case 3:
                     store.add(new Milk("Market.Milk", 60, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     wareHouse.add(new Milk("Market.Milk", 60, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                 //    marketProducts.add(new Milk("Market.Milk", 60, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     break;
                 case 4:
                     store.add(new Salt("Market.Salt", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     wareHouse.add(new Salt("Market.Salt", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                  //   marketProducts.add(new Salt("Market.Salt", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     break;
                 case 5:
                     store.add(new Stew("Market.Stew", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     wareHouse.add(new Stew("Market.Stew", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                  //   marketProducts.add(new Stew("Market.Stew", positiveInfinity, store.getRandomDeliveryTime(), store.getRandomStoragePlace()));
                     break;
             }
          }
         store.doInspection();

        ArrayList<Person> people =  new ArrayList<>();
        people.add(new Employee("Ringo", "Starr", 27, 84848, "Employee"));
        people.add(new Employee("Tolebi", "Baitasov", 18, 8834, "Startuper"));
        people.add(new Student("S@ken", "Oralkhan", 19,4.0001));
        people.add(new Employee("Askar", "Khaimuldin", 36,58464548, "ThebestTeacher"));
        people.add(new Student(  "Zhalgas"  ,"Bolatov" , 18,3.999999));
        people.add(new Teenager("Anton" ,  "Ivanov",15 , 4 ));



//        for (Person p  : people){
//            System.out.println(p);
//        }

        System.out.println("***************************************");

          for (Product p : wareHouse.getProducts()){
            MyApplication3.add(p);
          }
        System.out.println("***************************************");

         wareHouse.getProductOnlyFresh();
         wareHouse.generalWareHouse();

//         IUserRepository repo = new UserRepository(db);
//         UserController controller = new UserController(repo);
//         MyApplication app = new MyApplication(controller);
//         app.start();
        //IProductRepository repository =  new Product1Repository(db);
        //Product1Controller controller1 =  new Product1Controller(repository);
        //MyApplication2 app1 =  new MyApplication2(controller1);
        //app1.start();

        IDB db = new PostgresDB();
        db.createTableWithConnection();
        IMarketRepository repository = new MarketRepository(db);

        MarketProductController controller = new MarketProductController(repository);
        MyApplication3 app = new MyApplication3(controller);
        app.start();


    }
}
