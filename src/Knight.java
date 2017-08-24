
// child class, parent class is Piece
public class Knight extends Piece{

    public Knight() {
        super();
        this.name = "knight";
    }

    @Override
    boolean isValidMove (Position newPosition) {
        // First check the parent's isValidMove test, then move on to the Knight's movement rules test.
        if (!super.isValidMove(newPosition)) return false;

        return true;
    }
}
