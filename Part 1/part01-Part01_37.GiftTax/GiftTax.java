
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int amount = Integer.parseInt(scan.nextLine());

        if (amount < 5000) {
            System.out.println("No tax!");
        } else if (amount < 25000) {
            System.out.println("Tax: " + (100 + (amount - 5000) * 0.08));
        } else if (amount < 55000) {
            System.out.println("Tax: " + (1700 + (amount - 25000) * 0.10));
        } else if (amount < 200000) {
            System.out.println("Tax: " + (4700 + (amount - 55000) * 0.12));
        } else if (amount < 1000000) {
            System.out.println("Tax: " + (22100 + (amount - 200000) * 0.15));
        } else {
            System.out.println("Tax: " + (142100 + (amount - 1000000) * 0.17));
        }
    }
}