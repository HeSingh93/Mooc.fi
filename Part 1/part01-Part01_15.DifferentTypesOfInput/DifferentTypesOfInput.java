
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String string = scan.nextLine();

        System.out.println("Give an integer:");
        int integer = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");
        double number = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean answer = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + number);
        System.out.println("You gave the boolean " + answer);
    }
}
