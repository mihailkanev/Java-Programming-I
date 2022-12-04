
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            count++;
            if (num == 0) {
                count = (count - 1);
                break;
            } 
        }
        System.out.println("Number of numbers: " + count);

    }
}
