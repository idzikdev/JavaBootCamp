package DataBases;


import java.sql.*;

/**
 * Created by operator on 24.06.2017.
 */
public class MyConnection {

    public static void main(String[] args) {
            MySqlConnector baza=MySqlConnector.getInstance();

            Statement statement=baza.getStatement();
            String query="SELECT * FROM user_s WHERE username LIKE 'h%'";
            try {
                ResultSet resultSet = statement.executeQuery(query);
                // zbiór wyników to ResultSet
                while (resultSet.next()) {
                    System.out.println("ID : " + resultSet.getInt("id"));
                    System.out.println("Username : " + resultSet.getString("username"));
                    System.out.println("Savepos1x : " + resultSet.getFloat("savepos1x"));
                }
                //statement.execute("INSERT INTO pracownicy VALUES(NULL,'Toąąććć','Leszek',3000);");
                PreparedStatement preparedStatement = baza.getPreparedStatement("INSERT INTO pracownicy (name,surname,salary) VALUES(?,?,?)");
                preparedStatement.setString(1, "Jan");
                preparedStatement.setString(2, "Kowalski");
                preparedStatement.setInt(3, 9000);
                preparedStatement.execute();
                boolean correct = statement.execute("UPDATE pracownicy SET salary=5001 WHERE surname='Leszek'");
                if (correct) {
                    System.out.println("Poprawiono");
                } else System.out.println("Nic nie zmieniono");
            }
            catch (SQLException e) {
                e.printStackTrace();
            }

    }
}
