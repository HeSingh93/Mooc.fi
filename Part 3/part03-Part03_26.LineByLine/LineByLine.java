
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] pieces = line.split(" ");

            for (String piece : pieces) {
                System.out.println(piece);
            }
        }

    }
}
