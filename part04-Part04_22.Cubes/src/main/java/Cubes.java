
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            res = Integer.valueOf(input);
            System.out.println(res * res * res);
        }
    }
}
