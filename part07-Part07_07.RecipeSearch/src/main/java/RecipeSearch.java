import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        RecipeManager manager = new RecipeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();

    }
}
