import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<BookInformation> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
                String title = scanner.nextLine();

                if (title.isEmpty()) {
                    break;
                }
                String pages = scanner.nextLine();
                String year = scanner.nextLine();

                books.add(new BookInformation(title, pages, year));
        }

        System.out.println("What information will be printed? ");
        String question = scanner.nextLine();

        if(question.equals("everything")) {
            for (BookInformation bookInformation : books) {
                System.out.println(bookInformation.toString());
            }
        } else if (question.equals("name")){
            for (BookInformation bookInformation : books) {
                System.out.println(bookInformation.title);
            }
        }
    }
}
