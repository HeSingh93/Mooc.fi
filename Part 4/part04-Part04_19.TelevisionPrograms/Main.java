import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter a movie:");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Duration:");
            int duration = Integer.parseInt(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));

        }

        System.out.println("Enter max duration for program:");
        int duration = Integer.parseInt(scanner.nextLine());
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= duration){
                System.out.println(program);
            }
        }
    }
}
