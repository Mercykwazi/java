
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private final String url = "jdbc:postgresql://localhost/people_records";
    private final String user = "postgres";
    private final String password = "Gugulethu";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("what is this: "+conn);
        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database database = new Database();
        database.connect();
    }
}
