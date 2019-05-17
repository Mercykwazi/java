import java.util.Scanner;
public class User {
    private String firstName;
    private   String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    User (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Last Name:");

        String lastName = scanner.nextLine();
        this.setFirstName(firstName);
        this.setLastName(lastName);

    }


}