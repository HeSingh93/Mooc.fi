
public class AdvancedAstrology {

    // Part one
    public static void printStars(int number) {
        int count = 0;
        while (count < number) {
            System.out.print("*");
            count++;
        }
        System.out.println();
    }

    // Part one
    public static void printSpaces(int number) {
        int count = 0;
        while (count < number) {
            System.out.print(" ");
            count++;
        }
    }

    // Part two
    public static void printTriangle(int size) {
        int count = 1;
        while (count <= size) {
            printSpaces(size - count);
            printStars(count);
            count++;
        }
    }

    // Part three
    public static void christmasTree(int height) {
        int count = 1;
        while (count < height + 1) {
            printSpaces(height - count);
            printStars(count + (count - 1));
            count++;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
