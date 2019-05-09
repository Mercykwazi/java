
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement ;

public class Database {
    private final String url = "jdbc:postgresql://localhost/people_records";
    private final String user = "postgres";
    private final String password = "Gugulethu";

    public Connection connect() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void saveItems(int id,String firstName,String lastName) {

        try {
            Connection stmnt = connect();
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

    public static void main(String[] args) {
        User userInput=new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name:");

        String firstName = scanner.nextLine();
        userInput.setFirstName(firstName);

        System.out.println("Your name is "+userInput.getFirstName());
        System.out.println("Last Name:");
        String lastName=scanner.nextLine();
        userInput.setLastName(lastName);
        System.out.println("your last name is "+userInput.getLastName());

        Database database = new Database();
      //  database.saveItems( 2,userInput.getFirstName(),userInput.getLastName());
        database.saveItems( 3,userInput.getFirstName(),userInput.getLastName());

        database.connect();
    }
}
