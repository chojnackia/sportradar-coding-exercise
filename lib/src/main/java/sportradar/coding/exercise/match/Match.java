package sportradar.coding.exercise.match;

public interface Match {
    String getHomeTeam();
    String getAwayTeam();
    int getHomeScore();
    int getAwayScore();
    void updateScore(int homeScore, int awayScore);
}
