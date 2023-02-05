package company.repositories;

import Market.Product;
import company.data.interfaces.IDB;
import company.entities.MarketProducts;
import company.repositories.interfaces.IMarketRepository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class MarketRepository implements IMarketRepository {

    private final IDB db;

    public  MarketRepository (IDB db){
        this.db =  db;
    }



    @Override
    public List<MarketProducts> getAllMarketProducts() {
        Connection  con = null;
        try {
             con = db.getConnection();
             String sql = "SELECT id , name , delivered , box  , life_days, is_fresh FROM market";
            Statement st =  con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List <MarketProducts> marketProducts = new LinkedList<>();
            while (rs.next()){
                MarketProducts marketProducts1 = new MarketProducts(
                        rs.getInt("id" ),
                        rs.getString("name"),
                        rs.getDate("delivered").toLocalDate(),
                        rs.getString("box"),
                        rs.getInt("life_days"),
                        rs.getBoolean("is_fresh"));
                marketProducts.add(marketProducts1);
            }
            for  (int i  = 0 ; i< marketProducts.size() ; i++) {
                System.out.println(marketProducts.get(i) + " ");
            }
           return  marketProducts;
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean createMarketProduct() {
        return false;
    }

    @Override
    public boolean insertMarketProduct(MarketProducts m) {
        Connection con = null;
        try {
                con = db.getConnection();
                String sql =  "INSERT INTO market  (name , delivered ,  box , life_days ,is_fresh) VALUES(?,?,?,?,?)";
                PreparedStatement st = con.prepareStatement(sql);


                st.setString(1, m.getName());
                st.setDate(2, Date.valueOf(m.getDeliver()));
                st.setString(3, m.getBox());
                st.setInt(4, 1);
                st.setBoolean(5, m.getIsFresh());

                st.execute();

            System.out.println("Data inserted successfully.");
            return  true;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            }catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }
}
