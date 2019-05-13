import java.util.Scanner;
public class Input {
    public String firstName;
    public  String lastName;

    Input (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Last Name:");
        String lastName = scanner.nextLine();

        this.firstName = firstName;
        this.lastName = lastName;

    }


}