
// child class, parent class is Piece
public class Rook extends  Piece{

    public Rook() {
        super();
        this.name = "rook";
    }

    @Override
    boolean isValidMove(Position newPosition) {
        // First call the parent's method to check for the board bounds. If the parent's test passes, then check for the
        // specific rook movement. A Rook can only move along it's current column or row
        return super.isValidMove(newPosition) && (newPosition.column == this.position.column || newPosition.row == this.position.row);
    }
}
