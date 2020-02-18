
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String longest = "";
        double sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int year =  Integer.parseInt(parts[1]);
            sum += year;
            count++;
            String name = parts[0];
            if (name.length() > max) {
                max = name.length();
                longest = name;
            }
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of bith years: " + (sum / count));

    }
}
