
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        ArrayList<Integer> list = new ArrayList<>();
        int points = 0;
        int sum = 0;
        double average = 0.0;
        double passing = 0.0;
        int passCount = 0;
        boolean pasOn = false;
        double passPercentage = 0.0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input >= 0 && input <= 100) {
                list.add(input);
                points++;
            }
        }

        
        for (Integer integer : list) {
            sum = sum + integer;
        }

        for (Integer x : list) {
            if(x >= 50) {
                passing = passing + x;
                passCount++;
            } 
        }
        average = (double) sum / points;
        passing = (double) passing / passCount;
        passPercentage = 100 * ((double)passCount / points);

        if(passCount == 0 || sum == 0) {
            passing = 0.0;
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (all): " + average);
            System.out.println("Point average (passing): " + passing);
           // System.out.println("Passing percentage: " + passPercentage);
        }  

        System.out.println("Passing percentage: " + passPercentage);
        System.out.println("Grade Distribution:");
        System.out.print("5: ");
        for(int score: list){
            if(score >= 90){
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("4: ");
        for(int score: list){
            if(score >= 80 && score < 90) {
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("3: ");
        for(int score: list){
            if(score >= 70 && score < 80) {
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("2: ");
        for(int score: list){
            if(score >= 60 && score < 70) {
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("1: ");
        for(int score: list){
            if(score >= 50 && score < 60) {
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("0: ");
        for(int score: list){
            if(score < 50) {
                System.out.print("*");
            }
        }
    }
}