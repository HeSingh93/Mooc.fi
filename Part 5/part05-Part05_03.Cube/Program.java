
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       Cube cube = new Cube(30);

       cube.volume();
       cube.toString();
    }
}
