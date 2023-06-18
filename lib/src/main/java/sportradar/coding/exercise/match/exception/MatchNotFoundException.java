package sportradar.coding.exercise.match.exception;

public class MatchNotFoundException extends RuntimeException {

    public MatchNotFoundException() {
        super("Match not found");
    }
}
