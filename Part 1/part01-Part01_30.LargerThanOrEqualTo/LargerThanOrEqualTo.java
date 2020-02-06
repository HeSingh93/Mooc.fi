
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scan.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scan.nextLine());

        if (first > second) {
            System.out.println("Larger number is: " + first);
        } else if (first < second) {
            System.out.println("Larger number is: " + second);
        } else if (first == second) {
            System.out.println("The numbers are equal!");
        }

    }
}
