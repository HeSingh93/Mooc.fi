
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");

        while (true){
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1){
                break;
            }
            sum += input;
            n++;

            if (input % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " +sum);
        System.out.println("Numbers: " + n);
        System.out.println("Average: " + ((sum + 0.0) / n));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
