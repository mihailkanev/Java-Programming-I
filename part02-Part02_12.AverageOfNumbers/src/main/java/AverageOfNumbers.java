
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;
       
        while(true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
          
            if (num == 0) {
                break;
            } else {
                count++;
                sum = sum + num;
            }
        }
        System.out.println("Average of the numbers: " + sum / count);
    }
}
