
import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            counter++;
        }
        System.out.println(counter);
    }
}

