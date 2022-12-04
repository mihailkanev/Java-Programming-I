
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int years = Integer.valueOf(scan.nextLine());

        if (years < 0 || years > 120) {
            System.out.println("Impossible!");
        }
        if (years >= 0 && years <= 120) {
            System.out.println("OK");
        }
    }
}
