package sportradar.coding.exercise.scoreboard.impl;

import sportradar.coding.exercise.match.Match;
import sportradar.coding.exercise.match.impl.FootballMatch;
import sportradar.coding.exercise.scoreboard.Scoreboard;
import sportradar.coding.exercise.match.exception.MatchNotFoundException;

import java.util.*;

public class FootballScoreboard implements Scoreboard {
    private List<Match> matches;

    public FootballScoreboard() {
        this.matches = new LinkedList<>();
    }

    @Override
    public void startMatch(String homeTeam, String awayTeam) {
        matches.add(new FootballMatch(homeTeam, awayTeam));
    }

    @Override
    public void updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        Match match = findMatch(homeTeam, awayTeam);
        match.updateScore(homeScore, awayScore);
        sortMatches();
    }

    @Override
    public void finishMatch(String homeTeam, String awayTeam) {
        matches.remove(findMatch(homeTeam, awayTeam));
    }

    @Override
    public List<Match> getSummary() {
        return matches;
    }

    private void sortMatches() {
        matches.sort(Comparator.comparingInt(match -> match.getHomeScore() + match.getAwayScore()));
        Collections.reverse(matches);
    }

    private Match findMatch(String homeTeam, String awayTeam) {
        return matches.stream()
                .filter(match ->
                        match.getHomeTeam().equals(homeTeam)
                                &&
                                match.getAwayTeam().equals(awayTeam))
                .findFirst()
                .orElseThrow(MatchNotFoundException::new);
    }
}
