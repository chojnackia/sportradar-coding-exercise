package sportradar.coding.exercise.match.impl;

import sportradar.coding.exercise.match.Match;

public class FootballMatch implements Match {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;

    @Override
    public String getHomeTeam() {
        return null;
    }

    @Override
    public String getAwayTeam() {
        return null;
    }

    @Override
    public int getHomeScore() {
        return 0;
    }

    @Override
    public int getAwayScore() {
        return 0;
    }

    @Override
    public void updateScore(int homeScore, int awayScore) {

    }
}