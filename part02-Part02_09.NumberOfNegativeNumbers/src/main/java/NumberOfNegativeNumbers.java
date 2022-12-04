
import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negative = 0;
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if (num < 0) {
                negative++;
            }

            if (num == 0) {
                // negative = (negative - 1);
                break;
            }
        }
        System.out.println("Number of negative numbers: " + negative);

    }

}
