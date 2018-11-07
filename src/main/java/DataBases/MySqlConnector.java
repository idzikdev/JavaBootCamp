package DataBases;

import java.sql.*;

/**
 * Created by operator on 26.06.2017.
 */
public class MySqlConnector {
    private final static String DBURL="";
    private final static String DBNAME="";
    private final static String DBPASSWORD="";
    private Connection connection;

    private static MySqlConnector instance;
    private MySqlConnector(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); //lub jeszcze .newInstance() //mechanizm refleksji
            connection = DriverManager.getConnection(DBURL, DBNAME, DBPASSWORD);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Polączono");
    }
    public static MySqlConnector getInstance(){
        if (instance==null){
            instance=new MySqlConnector();
        }
        return instance;
    }
    public Statement getStatement(){
        try {
            return connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public PreparedStatement getPreparedStatement(String query){
        try {
            return connection.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
