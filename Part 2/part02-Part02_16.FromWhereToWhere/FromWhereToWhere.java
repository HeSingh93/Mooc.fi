
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int to = Integer.parseInt(scanner.nextLine());

        System.out.print("Where from? ");
        int from = Integer.parseInt(scanner.nextLine());

        if (from <= to) {
            while (from <= to) {
                System.out.println(from);
                from = from + 1;
            }
        }
    }
}
