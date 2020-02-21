
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine();

        try (Scanner dataScanner = new Scanner(Paths.get(input))) {
            while (dataScanner.hasNext()) {
                String line = dataScanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }
}
