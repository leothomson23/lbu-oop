public class PlayerStatistics {
    public String name;
    public int matchesPlayed;
    public int goalsScored;

    public PlayerStatistics(String name, int matchesPlayed, int goalsScored){
        this.name = name;
        this.goalsScored = goalsScored;
        this.matchesPlayed = matchesPlayed;
    }

    public String getName(){
        return name;
    }

    public int getGoals(){
        return goalsScored;
    }

    public int getMatchesPlayed(){
        return matchesPlayed;
    }

    public void displayStats(){
        System.out.println("Player: " + name);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println(("Goals Scored: " + goalsScored));
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
}