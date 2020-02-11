
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        
        int number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < number) {
                number = list.get(i);
            }
        }

        System.out.println("Smallest number: " + number);

        for (int i = 0; i < list.size(); i++){
            if (number == list.get(i)){
                System.out.println("Found at index: " + i);
            }
        }
    }
}
