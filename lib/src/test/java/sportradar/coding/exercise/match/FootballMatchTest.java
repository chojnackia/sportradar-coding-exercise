package sportradar.coding.exercise.match;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sportradar.coding.exercise.match.impl.FootballMatch;

public class FootballMatchTest {
    private Match match;

    @BeforeEach
    public void setUp() {
        match = new FootballMatch("Home Team", "Away Team");
    }
    @Test
    public void testUpdateScore() {
        match.updateScore(2, 1);
        Assertions.assertEquals(2, match.getHomeScore());
        Assertions.assertEquals(1, match.getAwayScore());
    }

    @Test
    public void testGetHomeTeam() {
        Assertions.assertEquals("Home Team", match.getHomeTeam());
    }

    @Test
    public void testGetAwayTeam() {
        Assertions.assertEquals("Away Team", match.getAwayTeam());
    }

    @Test
    public void testGetHomeScore() {
        Assertions.assertEquals(0, match.getHomeScore());
    }

    @Test
    public void testGetAwayScore() {
        Assertions.assertEquals(0, match.getAwayScore());
    }

}
