
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String read = scanner.nextLine();
            if (read.equals("")) {
                break;
            }

            String[] pieces = read.split(" ");

            System.out.println(pieces[pieces.length-1]);
        }
    }
}
