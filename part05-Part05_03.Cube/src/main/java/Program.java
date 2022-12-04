
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube newCube = new Cube(4);
        System.out.println(newCube.volume());
        System.out.println(newCube);
    }
}
