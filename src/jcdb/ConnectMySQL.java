package jcdb;

import cooking.salad.CookSalad;
import entities.Vegetable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectMySQL extends CookSalad {


    public mySQL bd = null;

    //getter method for list
   List<Vegetable> vegs2 = new ArrayList<Vegetable>();

    public String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public  String DB_URL = "jdbc:mysql://localhost:3306/salad?useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

//    метод коннект базы данных который вытаскивает ингредиеты и распечатывает в консоле?? ты серьёзно?
    public void connectBD() {

        Connection connection = null;
        Statement statement = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = connection.createStatement();
            String sql;
            sql = "SELECT name, weight, type from ingreds";

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //Retrieve by column name
//                зачем заменил сущности овощей этим? работай с существующими объектами
//                сделай дополнительный сервис который бы читал ингредиенты из бд и записывал их в коллекцию, у программы должна быть возмодность делать салат из этих овощей
                bd = new mySQL();
                bd.setName(resultSet.getString("name"));
                bd.setWeight(resultSet.getInt("weight"));
                bd.setType(resultSet.getString("type"));


                vegs2.add(bd);
            }
           // List<Vegetable> vegs = vegs2();


          // System.out.println(vegs2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

