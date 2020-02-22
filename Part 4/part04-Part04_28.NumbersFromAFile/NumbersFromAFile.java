
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        try (Scanner fileName = new Scanner(Paths.get(file))) {
            while (fileName.hasNext()) {
                int number = Integer.parseInt(fileName.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    counter++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("Numbers: " + counter);
    }
}
