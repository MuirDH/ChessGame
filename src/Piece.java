
// child class, parent class is Piece
public class Piece {
    // stores the current position of that piece on the board.
    Position position;

    // name variable for each chess piece. Each piece is named in it's own class as a string.
    String name;


    // Takes a potential new position and decides if that position is within the bounds of the chess board
    boolean isValidMove(Position newPosition) {
        return position.row > 0 && position.column > 0 && position.row < 8 && position.column < 8;
    }


}
