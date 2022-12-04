import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Name:");
        String teamName = scan.nextLine();

        int teamCount = 0;
        int wins = 0;
        int loss = 0;

        try(Scanner scanFile = new Scanner(Paths.get(fileName))){
            while(scanFile.hasNextLine()){
                String line = scanFile.nextLine();
                
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitTeam = parts[1];
                int pointsHome = Integer.valueOf(parts[2]);
                int pointsVisit = Integer.valueOf(parts[3]);
                
                if(homeTeam.equals(teamName) || visitTeam.equals(teamName)) {
                    teamCount++;
                }
                if(homeTeam.equals(teamName) && pointsHome > pointsVisit) {
                    wins++;
                }
                if(visitTeam.equals(teamName) && pointsVisit > pointsHome) {
                    wins++;
                }
                if(homeTeam.equals(teamName) && pointsHome < pointsVisit) {
                    loss++;
                }
                if(visitTeam.equals(teamName) && pointsVisit  < pointsHome) {
                    loss++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage().toString());
        }
        System.out.println("Games: " + teamCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);
    }
}
