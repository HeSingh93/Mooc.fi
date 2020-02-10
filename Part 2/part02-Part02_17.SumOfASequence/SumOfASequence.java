
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number?");

        int counter = 1;
        int sum = 0;

        while (counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println("The sum is " + sum);
    }
}
