public class FootballStatistics extends PlayerStatistics {
    public int assists;

    public FootballStatistics(String name, int matchesPlayed, int goals, int assists) {
        super(name, matchesPlayed, goals);
        this.assists = assists;
    }

    public void setAssists(int assists){
        this.assists = assists;
    }

    public int getAssists(){
        return assists;
    }

    public void displayStats() {
        super.displayStats();
        System.out.println("Assists: " + assists);
    }
}
