
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.validation.Validator;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userName = new ArrayList<String>();
        ArrayList<Integer> userAge = new ArrayList<Integer>();

        while(true) {
            String input = scanner.nextLine();

            if(input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");
            userName.add(pieces[0]);
            userAge.add(Integer.valueOf(pieces[1]));

        }
        int sum = 0;
        double average = 0;
        int numOfYears = 0;

        int longestName = userName.get(0).length();
        int nameIndex = 0;
        for (int i=0; i < userName.size(); i++) {

            if(userName.get(i).length() > longestName) {
                longestName = userName.get(i).length();
                nameIndex = i;
            }
            sum += userAge.get(i);
            numOfYears++;
        }

        average = 1.0 * sum / numOfYears;
        
        System.out.println("Longest name: " + userName.get(nameIndex));
        System.out.println("Average of the birth year: " + average);
    }
}
