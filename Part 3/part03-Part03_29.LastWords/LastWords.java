
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] pieces = line.split(" ");
            int i = pieces.length - 1;
            System.out.println(pieces[i]);
        }

    }
}
