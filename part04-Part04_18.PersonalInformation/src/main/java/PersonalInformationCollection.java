
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
         
            String firstName = scanner.nextLine();
                        
            if(firstName.isEmpty()) {
                break;
            }

            String lastName = scanner.nextLine();
            String idNum = scanner.nextLine();
            
            PersonalInformation newPerson = new PersonalInformation(firstName,lastName, idNum);
            System.out.println(firstName + " " + lastName);
        }

    }
}
