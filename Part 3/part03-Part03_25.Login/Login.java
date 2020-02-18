
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String name = scanner.nextLine();

        System.out.print("Enter password: ");
        String passwd = scanner.nextLine();

        if (name.equals("alex") &&  passwd.equals("sunshine")) {
            System.out.println("You have succesfully logged in!");
        } else if (name.equals("emma") && (passwd.equals("haskell"))) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
