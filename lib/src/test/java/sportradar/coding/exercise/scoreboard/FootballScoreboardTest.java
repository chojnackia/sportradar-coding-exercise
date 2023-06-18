package sportradar.coding.exercise.scoreboard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sportradar.coding.exercise.match.Match;
import sportradar.coding.exercise.scoreboard.impl.FootballScoreboard;

import java.util.List;

public class FootballScoreboardTest {
    private Scoreboard scoreboard;

    @BeforeEach
    public void setUp() {
        scoreboard = new FootballScoreboard();
    }
    @Test
    public void testStartMatch() {
        scoreboard.startMatch("Home Team 1", "Away Team 1");
        List<Match> matchesInProgress = scoreboard.getSummary();
        Assertions.assertEquals(1, matchesInProgress.size());

        Match match1 = matchesInProgress.get(0);
        Assertions.assertEquals("Home Team 1", match1.getHomeTeam());
        Assertions.assertEquals("Away Team 1", match1.getAwayTeam());
        Assertions.assertEquals(0, match1.getHomeScore());
        Assertions.assertEquals(0, match1.getAwayScore());

        scoreboard.startMatch("Home Team 2", "Away Team 2");

        Match match2 = matchesInProgress.get(1);
        Assertions.assertEquals("Home Team 2", match2.getHomeTeam());
        Assertions.assertEquals("Away Team 2", match2.getAwayTeam());
        Assertions.assertEquals(0, match2.getHomeScore());
        Assertions.assertEquals(0, match2.getAwayScore());
        Assertions.assertEquals(2, matchesInProgress.size());

    }

    @Test
    public void testUpdateScore() {
        scoreboard.startMatch("Home Team", "Away Team");
        scoreboard.updateScore("Home Team", "Away Team", 2, 1);
        Match match = scoreboard.getSummary().get(0);
        Assertions.assertEquals(2, match.getHomeScore());
        Assertions.assertEquals(1, match.getAwayScore());
    }

    @Test
    public void testFinishMatch() {
        scoreboard.startMatch("Home Team", "Away Team");
        scoreboard.finishMatch("Home Team", "Away Team");
        List<Match> matchesInProgress = scoreboard.getSummary();
        Assertions.assertTrue(matchesInProgress.isEmpty());
    }

    @Test
    public void testGetMatchesInProgressOrderedByTotalScore() {
        scoreboard.startMatch("Team 1", "Team 2");
        scoreboard.startMatch("Team 3", "Team 4");
        scoreboard.updateScore("Team 1", "Team 2", 2, 1);
        scoreboard.updateScore("Team 3", "Team 4", 0, 3);

        List<Match> matchesInProgress = scoreboard.getSummary();
        Assertions.assertEquals(2, matchesInProgress.size());

        Match match1 = matchesInProgress.get(0);
        Assertions.assertEquals("Team 3", match1.getHomeTeam());
        Assertions.assertEquals("Team 4", match1.getAwayTeam());

        Match match2 = matchesInProgress.get(1);
        Assertions.assertEquals("Team 1", match2.getHomeTeam());
        Assertions.assertEquals("Team 2", match2.getAwayTeam());
    }
}
