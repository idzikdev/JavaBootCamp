package DataBases;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by operator on 27.06.2017.
 */
public class UserDao {
    private MySqlConnector connector;

    public UserDao() {
        connector=MySqlConnector.getInstance();
    }

    public void addUser(User user) {
        String query = "INSERT INTO users VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = connector.getPreparedStatement(query);
        try {
            preparedStatement.setNull(1, 0);
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getLastName());
            preparedStatement.setString(4, user.getTelephone());
            preparedStatement.execute();
            preparedStatement.closeOnCompletion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void removeUser(int i){
        String query="DELETE FROM user WHERE id=?";
        PreparedStatement preparedStatement=connector.getPreparedStatement(query);
        try {
            preparedStatement.setInt(1,i);
            preparedStatement.execute();
            preparedStatement.closeOnCompletion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<User> getAllUsers(){
        ArrayList results=new ArrayList();
        //TODO
        String query="SELECT * FROM users";
        return results;
    }
}
