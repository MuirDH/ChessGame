
// child class, parent class is Piece
public class Bishop extends Piece{

    public Bishop() {
        super();
        this.name = "bishop";
    }

    @Override
    boolean isValidMove(Position newPosition) {
        // First check the parent's isValidMove test, then move on to the Bishop's movement rules test.
        // A Bishop can only move diagonally, so check that the number of vertical steps is equal to the number of
        // horizontal steps. That is, the difference between the current and new column positions is the same as the
        // difference between the current and new row positions.
        return super.isValidMove(newPosition) && Math.abs(newPosition.column - this.position.column)
                == Math.abs(newPosition.row - this.position.row);
    }
}
