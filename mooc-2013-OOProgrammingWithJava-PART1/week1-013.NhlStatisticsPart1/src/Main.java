
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        // Print the top ten players based on goals
        System.out.println("- Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        // Print the top 25 players based on penalty amounts
        System.out.println("\n- Top 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        // Print the statistics for Sidney Crosby
        System.out.println("\n- Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        // Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!
        System.out.println("\n- Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");

        // Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
        System.out.println("\n- Anaheim Ducks");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
