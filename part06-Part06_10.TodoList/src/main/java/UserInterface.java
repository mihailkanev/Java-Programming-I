import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList tasks;
    private Scanner scan;

    public UserInterface(TodoList tasks, Scanner scan) {
        this.tasks = tasks;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String cmd = this.scan.nextLine();
            if (cmd.equals("stop")) {
                break;
            } else if (cmd.equals("add")) {
                add();
            } else if (cmd.equals("list")) {
                list();
            } else if (cmd.equals("remove")) {
                remove();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void add() {
        System.out.println("To add: ");
        String task = this.scan.nextLine();
        this.tasks.add(task);
    }

    public void list() {
        this.tasks.print();
    }

    public void remove() {
        System.out.println("Which one is removed? ");
        int x = Integer.valueOf(scan.nextLine());
        this.tasks.remove(x);
    }
}
