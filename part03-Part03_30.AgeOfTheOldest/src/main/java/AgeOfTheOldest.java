
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        ArrayList<String> userNames = new ArrayList<String>();
        ArrayList<Integer> userAges = new ArrayList<Integer>();

        while(true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            
            String[] pieces = input.split(",");
            userNames.add(pieces[0]);
            userAges.add(Integer.valueOf(pieces[1]));
            
        }
        int larger = 0;
        for (int i = 0; i < userAges.size(); i++) {
            int number = userAges.get(i);
            if (larger < number) {
                larger = number;
            }
        }
        System.out.println("Age of the oldest: " + larger);
    }
}
