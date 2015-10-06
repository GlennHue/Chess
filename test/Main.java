import game.Game;
import game.board.Board;

/**
 * Created by Glenn on 1-10-2015.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.printf(game.getBoard().toString());
    }
}
