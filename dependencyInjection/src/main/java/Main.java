//import org.springframework.context.ApplicationContext;
public class Main {
    public static void main(String[] args){
//ApplicationContext context=
        User input=new User();
        SaveUser saveUser=new SaveUser();
       //Database db=new Database();
        Database db=new Database();
        saveUser.saveItems(33,input.getFirstName(),input.getLastName(),db);
        db.connect();
    }
}
