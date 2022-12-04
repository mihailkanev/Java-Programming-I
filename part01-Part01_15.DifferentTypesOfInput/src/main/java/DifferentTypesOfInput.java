
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String name = scan.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double numDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean numBoolean = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + name);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + numDouble);
        System.out.println("You gave the boolean " + numBoolean);

    }
}
