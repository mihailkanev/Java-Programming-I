
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Text: ");
        while (true) {
            String sentence = scanner.nextLine();
            String[] pieces = sentence.split(" ");

            if (sentence.equals("")) {
                break;
            }

            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        }
    }
}
