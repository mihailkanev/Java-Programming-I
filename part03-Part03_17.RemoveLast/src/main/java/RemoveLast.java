
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveLast {

    public static void main(String[] args) {
        try (// Try your method in here
        Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> list = new ArrayList<>();
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("")) {
                    break;
                }

                list.add(input);
                
            }
            for (int i = 0; i <= list.size()-1; i++) {
                 System.out.println(list.get(i));
               
            }
            System.out.println("New list: ");
            removeLast(list);
        }
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }

        for (int i = 0; i < strings.size()-1; i ++) {
            
            System.out.println(strings.get(i));
        }
        strings.remove(strings.size()-1);
    }
}
