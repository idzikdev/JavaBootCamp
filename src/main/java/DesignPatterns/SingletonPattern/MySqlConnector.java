package DesignPatterns.SingletonPattern;

/**
 * Created by operator on 26.06.2017.
 */
public class MySqlConnector {
    private static MySqlConnector instance;
    private MySqlConnector(){

    }
    public static MySqlConnector getInstance(){
        if (instance==null){
            instance=new MySqlConnector();
        }
        return instance;
    }
}
