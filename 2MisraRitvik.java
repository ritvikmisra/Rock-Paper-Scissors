import java.util.*;

public class StrategicPlayer implements Player {
    private static String name = "AlternatingPlayer";
    private static String strategy = "Alternates first 3 moves, then plays paper";

    /**
     * Decides the move based on alternating for the first 3 moves, then playing paper.
     *
     * @param myMoves       Array of the player's past moves.
     * @param opponentMoves Array of the opponent's past moves.
     * @param myScore       The player's current score.
     * @param opponentScore The opponent's current score.
     * @return              The move to play ("r", "p", "s").
     */
    public String move(String[] myMoves, String[] opponentMoves, int myScore, int opponentScore) {
        // Check if there are no moves yet (first round).
        if (myMoves == null || myMoves.length == 0) {
            return "r"; // Start with rock.
        }

        int moveCount = myMoves.length;

        // Alternate between "r", "p", "s" for the first three rounds.
        if (moveCount < 3) {
            switch (moveCount % 3) {
                case 0: return "r"; // Rock
                case 1: return "p"; // Paper
                case 2: return "s"; // Scissors
            }
        }

        // After three rounds, always play paper.
        return "p";
    }

    /**
     * Returns the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }
}
