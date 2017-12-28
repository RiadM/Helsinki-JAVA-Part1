
import java.util.Scanner;
import nhlstats.NHLStatistics;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Top ten by points");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 by penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Sidney Crosby stats:");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Philadelphia Flyers stats");
        NHLStatistics.teamStatistics("PHI");

        NHLStatistics.sortByPoints();

        System.out.println("Players Anaheim Ducks ordered by points");
        NHLStatistics.teamStatistics("ANA");

    }
}
