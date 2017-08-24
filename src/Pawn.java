
// child class, parent class is Piece
public class Pawn extends Piece {

    public Pawn() {
        super();
        this.name = "pawn";
    }

    @Override
    boolean isValidMove (Position newPosition) {
        // First check the parent's isValidMove test, then move on to the Pawn's movement rules test.
        if (!super.isValidMove(newPosition)) return false;

        return true;
    }
}
