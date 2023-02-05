package company.data;

import company.data.interfaces.IDB;

import java.sql.*;

public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/simpledb";
        try {
            // Here we load the driver’s class file into memory at the runtime
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "qwerty11");

            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public Connection createTableWithConnection() throws SQLException, ClassNotFoundException {
        String  url =  "jdbc:postgresql://localhost:5432/simpledb";
        String user  =  "postgres";
        String password =  "qwerty11";

        try{
            Class.forName("org.postgresql.Driver");

            Connection con  = DriverManager.getConnection(url, user, password);
            Statement  st =  con.createStatement();
            DatabaseMetaData dbm  =  con.getMetaData();
            ResultSet tables = dbm.getTables(null, null , "market", null);

          if (!tables.next()){
              String sql =  "CREATE TABLE market (id serial primary key, name text,delivered date NOT NULL ,  box text, life_days integer , is_fresh boolean);";
              st.execute(sql);
              System.out.println("Table  created successfully");
           }
          else {
              System.out.println("Table already exists.");
          }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return null;
    }
}
