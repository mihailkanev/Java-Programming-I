
import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Give a number");
        int num = Integer.valueOf(scanner.nextLine());

        while(true) 
        
        if (num < 0) {
            System.out.println("Unsuitable number");
            int num2 = Integer.valueOf(scanner.nextLine());
            if (num2 == 0) {
                break;
            } 
        }

    }
}
