public class Driver {
    public static void main(String[] args) {
        FootballStatistics footballPlayer = new FootballStatistics("Ethan Ampadu", 15, 3, 5);
        System.out.println("Football Player Statistics");
        footballPlayer.displayStats();

        CricketStatistics cricketPlayer = new CricketStatistics("Freddy Flintoff", 8, 120);
        System.out.println("Cricket Player Statistics:");
        cricketPlayer.displayStats();
    }
}
