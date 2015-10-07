import game.Game;
import game.board.Board;
import game.board.Tile;
import game.errors.InvalidMoveException;

/**
 * Created by Glenn on 1-10-2015.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.printf(game.getBoard().toString());
        Tile tile = game.getBoard().getTile("C2");
        Tile tile2 = game.getBoard().getTile("B2");
        try {
            tile.getPiece().move(game.getBoard(), game.getBoard().getTile("C3"));
        } catch (InvalidMoveException e) {
            e.printStackTrace();
        }
    }
}
