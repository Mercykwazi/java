import java.util.Scanner;

public class Input {
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
    }
}
