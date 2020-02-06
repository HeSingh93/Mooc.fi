
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");

        int number = Integer.parseInt(scanner.nextLine());

        if (number < 0) {
            int sum = number * -1;
            System.out.println(sum);
        } else {
            System.out.println(number);
        }

    }
}
