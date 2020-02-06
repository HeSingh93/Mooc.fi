
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        int plus = first + second;
        int minus = first - second;
        int multi = first * second;
        double div = (1.0 * Integer.valueOf(first) / Integer.valueOf(second));

        System.out.println(first + " + " + second + " = " + plus );
        System.out.println(first + " - " + second + " = " + minus);
        System.out.println(first + " * " + second + " = " + multi);
        System.out.println(first + " / " + second + " = " + div);

    }
}
