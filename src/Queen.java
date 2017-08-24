
// child class, parent class is Piece
public class Queen extends Piece{

    public Queen() {
        super();
        this.name = "queen";
    }

    /**
     * Override the parent isValidMove() method to handle the queen's specific movement rules
     * @param newPosition where the chess piece is trying to move to
     * @return true if the move is valid, else false
     */
    @Override
    boolean isValidMove(Position newPosition) {
        // First call the parent's method to check for the board bounds. If this test passes, then check for the
        // specific queen movement rules. The queen can only move in straight lines or diagonally.
        return super.isValidMove(newPosition) && (newPosition.column == this.position.column || newPosition.row
                == this.position.row || Math.abs(newPosition.column - this.position.column)
                == Math.abs(newPosition.row - this.position.row));
    }

}
