
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");

        int number = Integer.parseInt(scanner.nextLine());

        int sum = number * number;

        System.out.println(sum);
    }
}
