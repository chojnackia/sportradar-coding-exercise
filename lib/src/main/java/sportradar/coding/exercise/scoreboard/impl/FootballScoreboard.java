package sportradar.coding.exercise.scoreboard.impl;

import sportradar.coding.exercise.match.Match;
import sportradar.coding.exercise.scoreboard.Scoreboard;

import java.util.List;

public class FootballScoreboard implements Scoreboard {
    private List<Match> matches;

    @Override
    public void startMatch(String homeTeam, String awayTeam) {

    }

    @Override
    public void updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore) {

    }

    @Override
    public void finishMatch(String homeTeam, String awayTeam) {

    }

    @Override
    public List<Match> getSummary() {
        return null;
    }
}
