
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");

        String word = String.valueOf(scanner.nextLine());

        for (int i = 0; i < word.length(); i++) {

            if (word.equals("true")) {
                System.out.println("You got it right!");
                break;
            } else {
                System.out.println("Try again!");
                break;
            }

        }
    }
}
