
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");

        int number1 = Integer.parseInt(scanner.nextLine());

        int number2 = Integer.parseInt(scanner.nextLine());

        double squareRoot = Math.sqrt(number1 + number2);

        System.out.println(squareRoot);




    }
}
