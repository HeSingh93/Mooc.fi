
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int firstN = Integer.parseInt(scanner.nextLine());

        System.out.println("Last number?");
        int lastN = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (firstN <= lastN) {
            sum += firstN;
            firstN++;
        }
        System.out.println("The sum is " + sum);
    }
}
