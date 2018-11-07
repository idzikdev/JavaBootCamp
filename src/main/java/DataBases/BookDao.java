package DataBases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by operator on 27.06.2017.
 */
public class BookDao {
    private MySqlConnector connector;

    public BookDao() {
        connector=MySqlConnector.getInstance();
    }
    public void addBook(Book book){
        String query = "INSERT INTO books VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = connector.getPreparedStatement(query);
        try {
            preparedStatement.setNull(1, 0);
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setString(3, book.getAuthor());
            preparedStatement.setInt(4, book.getPublishedYear());
            preparedStatement.execute();
            preparedStatement.closeOnCompletion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void removeBook(int i){
        String query="DELETE FROM books WHERE id=?";
        PreparedStatement preparedStatement=connector.getPreparedStatement(query);
        try {
            preparedStatement.setInt(1,i);
            preparedStatement.execute();
            preparedStatement.closeOnCompletion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //add book
    //remove book
}
