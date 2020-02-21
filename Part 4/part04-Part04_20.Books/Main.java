import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter title:");
            String title = scanner.nextLine();

            if(title.isEmpty()){
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year:");
            int year = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();

        for (Book book : books) {
            if (answer.equalsIgnoreCase("everything")){
                System.out.println(book.toString());
            } else if (answer.equalsIgnoreCase("name")){
                System.out.println(book.getTitle());
            }
        }
    }
}
