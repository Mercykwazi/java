public class Main {
    public static void main(String[] args){
        User input=new User();
        SaveUser saveUser=new SaveUser();
        Database db=new Database();
        saveUser.saveItems(22,input.getFirstName(),input.getLastName(),db);
        db.connect();
    }
}
