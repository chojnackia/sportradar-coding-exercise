package sportradar.coding.exercise.match.impl;

import sportradar.coding.exercise.match.Match;

public class FootballMatch implements Match {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;

    public FootballMatch(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
    }

    @Override
    public String getHomeTeam() {
        return homeTeam;
    }

    @Override
    public String getAwayTeam() {
        return awayTeam;
    }

    @Override
    public int getHomeScore() {
        return homeScore;
    }

    @Override
    public int getAwayScore() {
        return awayScore;
    }

    @Override
    public void updateScore(int homeScore, int awayScore) {
        if (homeScore < 0 || awayScore < 0) {
            throw new IllegalArgumentException("Score can't be a negative value");
        } else {
            this.homeScore = homeScore;
            this.awayScore = awayScore;
        }
    }
}
