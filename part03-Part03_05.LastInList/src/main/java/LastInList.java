
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
      
        for (int i = 0; i <= list.size(); i++) {
            String input = scanner.nextLine();

            if (input.equals("")){
                break;
            }
            list.add(input);
        }
        System.out.println(list.get(list.size()-1));
    }
}
