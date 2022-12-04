
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;

        while (true) {
            System.out.println("Give a number: ");
            double num = Double.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                count++;
                sum = sum + num;
            }
        }
        if (count <= 0) {
            System.out.println("Cannot calcute the average");
        }
        double aver = 1.0 * sum / count;
        System.out.println("Average of the positive numbers: " + aver);
    }
}
