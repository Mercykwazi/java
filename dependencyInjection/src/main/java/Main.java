public class Main {
    public static void main(String[] args){
        Input input=new Input();
        User userInput=new User();


        System.out.println("slkkls"+input.firstName + input.lastName);

     
        SaveUser saveUser=new SaveUser();
        Database db=new Database();
      saveUser.saveItems(21,input.firstName,input.lastName,db);

        db.connect();
        System.out.println("this is working perfectly");
    }
}
