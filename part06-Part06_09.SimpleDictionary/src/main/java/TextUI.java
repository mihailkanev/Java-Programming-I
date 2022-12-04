import java.util.Scanner;

public class TextUI {
    private SimpleDictionary text;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary text) {
        this.scanner = scanner;
        this.text = text;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("search")) {
                search();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void add() {
        System.out.println("Word: ");
        String word = scanner.nextLine();

        System.out.println("Translation: ");
        String translation = scanner.nextLine();

        this.text.add(word, translation);
    }

    public void search() {
        System.out.println("To be translated");
        String word = scanner.nextLine();
        String translation = this.text.translate(word);

        if (translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translate: " + translation);
        }
    }
}
