import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private RecipeManager manager;

    public UserInterface(RecipeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scan = scanner;
    }

    public void start() {

        System.out.println("File to read: ");
        String fileName = scan.nextLine();

        this.manager.readFile(fileName);

        menu();

        while (true) {

            System.out.println("Enter command: ");

            String command = scan.nextLine();

            if (command.equals("stop")) {
                break;

            } else if (command.equals("list")) {
                this.manager.printRecipes();

            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String recipeHint = scan.nextLine();
                this.manager.searchName(recipeHint);

            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxTime = Integer.valueOf(scan.nextLine());
                this.manager.searchCookingTime(maxTime);

            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scan.nextLine();
                this.manager.searchIngredient(ingredient);

            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
    public void menu() {

        System.out.println("Commands:\n"
            + "list - lists the recipes\n"
            + "stop - stops the program\n"
            + "find name - searches recipes by name\n"
            + "find cooking time - searches recipes by cooking time\n"
            + "find ingredient - searches recipes by ingredient");
    }
}