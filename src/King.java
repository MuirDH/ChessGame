
// child class, parent class is Piece
public class King extends Piece{

    public King() {
        super();
        this.name = "king";
    }

    @Override
    boolean isValidMove (Position newPosition) {
        // First check the parent's isValidMove test, then move on to the King's movement rules test.
        if (!super.isValidMove(newPosition)) return false;

            return true;
    }

}
