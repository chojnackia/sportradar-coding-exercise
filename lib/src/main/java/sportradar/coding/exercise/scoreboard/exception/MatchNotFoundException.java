package sportradar.coding.exercise.scoreboard.exception;

public class MatchNotFoundException extends RuntimeException {

    public MatchNotFoundException() {
        super("Match not found");
    }
}
