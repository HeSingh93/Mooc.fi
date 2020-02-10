
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        int multiplier = 1;

        while (counter <= number){
            multiplier *= counter;
            counter++;
        }
        System.out.println("Factorial: " + multiplier);
    }
}
