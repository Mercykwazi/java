import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement ;

public class SaveUser {
    private Database db;
    public void saveItems(int id,String firstName,String lastName,Database db) {
        this.db=db;
        try {
            Connection conn = null;
            Connection stmnt =db.connect();
            PreparedStatement sql =stmnt.prepareStatement("INSERT INTO people (user_id,firstname,lastname) "
                    + "VALUES (?,?,?)");
            sql.setInt(1,id);
            sql.setString(2,firstName);
            sql.setString(3,lastName);
            sql.executeUpdate();
            sql.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
