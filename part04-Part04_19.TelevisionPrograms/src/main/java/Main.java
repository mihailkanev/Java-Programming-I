import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            //String[] parts = input.split(",");
            //String tvName = parts[0];
            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(input, duration));
        }
       

        // for (TelevisionProgram televisionProgram : programs) {
        //     System.out.println(televisionProgram);
        // }

        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram x : programs) {
            if (x.getDuration() <= maxDuration) {
                System.out.println(x.toString());
            }
        }
    }
}