import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
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
    public static void main(String[] args){
//        User userInput=new User();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("First Name:");
//
//        String firstName = scanner.nextLine();
//        userInput.setFirstName(firstName);
//
//        System.out.println("Your name is "+userInput.getFirstName());
//        System.out.println("Last Name:");
//        String lastName=scanner.nextLine();
//        userInput.setLastName(lastName);
//        System.out.println("your last name is "+userInput.getLastName());
//        SaveUser saveUser=new SaveUser();
//        Database db=new Database();
//        saveUser.saveItems(13,userInput.getFirstName(),userInput.getLastName(),db);
//         db.connect();
    }
}
