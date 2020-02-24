import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of file: ");
        String file = scanner.nextLine();
        try (Scanner foundFile = new Scanner(Paths.get(file))) {

            while (foundFile.hasNextLine()) {
                String line = foundFile.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                String label = "";
                if (age == 1)
                    label = " year";
                else
                    label = " years";

                System.out.println(name + ", age: " + age + label);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
