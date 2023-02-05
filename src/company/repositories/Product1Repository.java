package company.repositories;

import Market.Product;
import company.entities.Product1;
import company.data.interfaces.IDB;
import company.repositories.interfaces.IProductRepository;


import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Product1Repository implements IProductRepository  {
    private  List<Product> products =  new ArrayList<>();

    private  final  IDB db ;

    public  Product1Repository (IDB db){
        this.db = db;
    }

    @Override
    public List<Product1> getAllProducts() {
        Connection con  =  null;
        try {
            con = db.getConnection();
            String sql =  "SELECT id,  name , count FROM products";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Product1> products=  new LinkedList<>();
            while (rs.next()){
                Product1 product1 = new Product1(rs.getInt("id"),rs.getString("name"), rs.getInt("count"));
                products.add(product1);
            }
            return products;
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e ){
            e.printStackTrace();
        }finally {
            try{
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return  null;
    }



    @Override
    public boolean createProduct(Product1 p) {
        Connection  con  = null;

        try {
            con = db.getConnection();
            String sql = "INSERT INTO products (name, count) VALUES(?, ?)";
            PreparedStatement st  = con.prepareStatement(sql);

            st.setString(1 , p.getName1());
            st.setInt(2 , p.getCount());

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            }catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }
}
