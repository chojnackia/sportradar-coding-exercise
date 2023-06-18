package sportradar.coding.exercise.scoreboard;

import sportradar.coding.exercise.match.Match;

import java.util.List;

public interface Scoreboard {
    void startMatch(String homeTeam, String awayTeam);
    void updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore);
    void finishMatch(String homeTeam, String awayTeam);
    List<Match> getSummary();
}
