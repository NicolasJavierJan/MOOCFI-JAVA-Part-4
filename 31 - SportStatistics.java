
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Match> matchs = readMatchFromFile(file);
        
        int games = 0;
        int win = 0;
        int lose = 0;
        for (Match match : matchs){
            if (team.equals(match.getLocalName()) || team.equals(match.getVisitorName())){
                games++;
                if (team.equals(match.getLocalName())){
                    if (match.getLocalPoints() > match.getVisitorPoints()){
                        win++;
                    } else {
                        lose++;
                    }
                } else {
                    if (match.getVisitorPoints() > match.getLocalPoints()){
                        win++;
                    } else {
                        lose++;
                    }
                }
            }
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
        
        
    }
    
    public static ArrayList<Match> readMatchFromFile(String file){
        ArrayList<Match> matchs = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String local = parts[0];
                String visitor = parts[1];
                int localPoints = Integer.valueOf(parts[2]);
                int visitorPoints = Integer.valueOf(parts[3]);

                matchs.add(new Match(local, visitor, localPoints, visitorPoints));
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return matchs;
    }

}
