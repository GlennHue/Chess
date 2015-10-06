package game.pieces;

import game.board.Board;
import game.board.Tile;
import game.errors.InvalidMoveException;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Glenn on 1-10-2015.
 */
public abstract class Piece {
    protected Tile position;
    protected String color;

    public Piece(Tile position, String color) {
        this.color = color;
        this.position = position;
    }

    public void move(Board board, Tile position) throws InvalidMoveException {
        if (Arrays.asList(getMoves(board)).contains(position)) {
            this.position = position;
            position.setPiece(this);
        } else {
            throw new InvalidMoveException("This piece can't move there.");
        }
    }

    abstract List<Tile> getMoves(Board board);

    public String getColor() {
        return color;
    }

    public Tile getPosition() {
        return position;
    }
}

