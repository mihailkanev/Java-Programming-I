import java.util.Scanner;

public class UserInterface {

    private BirdManager birdManager;
    private Scanner scan;

    public UserInterface(BirdManager manager, Scanner scan) {
        this.birdManager = manager;
        this.scan = scan;
    }

    public void start() {
        
        while (true) {
            
            String command = askInput("command");

            if (command.equals("Quit")) {
                break;

            } else if (command.equals("Add")) {                
                add();

            } else if (command.equals("Observation")) {
                observation();

            } else if (command.equals("One")) {
                one();

            } else if (command.equals("All")) {
                this.birdManager.print();

            } else {
                System.out.println("Unknown command");
            }
        }
    }

    private void add() {

        String birdName = askInput("bird");
        String latinName = askInput("latin");

        this.birdManager.addBird(birdName, latinName);
    }

    private void observation() {

        String birdName = askInput("bird");

        Boolean isObservationSuccess = this.birdManager.addObservation(birdName);

        if (!isObservationSuccess) {
            System.out.println("Not a bird!");
        }
    }

    private void one() {

        String birdName = askInput("bird");
        this.birdManager.print(birdName);
    
    }

    private String askInput(String input) {

        if (input.equals("command")) {
            System.out.println("?");    
        } else if (input.equals("bird")) {
            System.out.println("Bird?");
        } else if (input.equals("latin")) {
            System.out.println("Name in Latin:");
        }

        return scan.nextLine();
    }
}