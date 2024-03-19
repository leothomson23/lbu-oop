public class CricketStatistics extends PlayerStatistics {
    private int runsScored;

    public CricketStatistics(String name, int matchesPlayed, int runsScored) {
        super(name, matchesPlayed, 0);
        this.runsScored = runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void displayStats() {
        System.out.println("Player: " + name);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Runs Scored: " + runsScored);
    }
}
